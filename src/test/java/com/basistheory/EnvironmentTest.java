package com.basistheory;

import com.basistheory.core.Environment;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Pins the host each environment resolves to. US and EU both resolved to the
 * compatibility host until the spec grew per-region servers, so the constants
 * existed but selected nothing. These assertions fail if a regeneration
 * collapses them back.
 */
public final class EnvironmentTest {
    @Test
    public void environmentUrls() {
        Assertions.assertEquals("https://api.basistheory.com", Environment.DEFAULT.getUrl());
        Assertions.assertEquals("https://api.us.basistheory.com", Environment.US.getUrl());
        Assertions.assertEquals("https://api.eu.basistheory.com", Environment.EU.getUrl());
        Assertions.assertEquals("https://api.test.basistheory.com", Environment.TEST.getUrl());
    }

    @Test
    public void environmentsAreDistinct() {
        Map<String, String> seen = new HashMap<>();
        seen.put(Environment.DEFAULT.getUrl(), "DEFAULT");
        for (Map.Entry<String, Environment> entry : named().entrySet()) {
            String previous = seen.put(entry.getValue().getUrl(), entry.getKey());
            Assertions.assertNull(
                    previous,
                    entry.getKey() + " and " + previous + " both resolve to "
                            + entry.getValue().getUrl());
        }
    }

    private static Map<String, Environment> named() {
        Map<String, Environment> environments = new HashMap<>();
        environments.put("US", Environment.US);
        environments.put("EU", Environment.EU);
        environments.put("TEST", Environment.TEST);
        return environments;
    }
}
