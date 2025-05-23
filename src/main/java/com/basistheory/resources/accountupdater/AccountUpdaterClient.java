/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.basistheory.resources.accountupdater;

import com.basistheory.core.ClientOptions;
import com.basistheory.core.Suppliers;
import com.basistheory.resources.accountupdater.jobs.JobsClient;
import com.basistheory.resources.accountupdater.realtime.RealTimeClient;
import java.util.function.Supplier;

public class AccountUpdaterClient {
    protected final ClientOptions clientOptions;

    protected final Supplier<JobsClient> jobsClient;

    protected final Supplier<RealTimeClient> realTimeClient;

    public AccountUpdaterClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
        this.jobsClient = Suppliers.memoize(() -> new JobsClient(clientOptions));
        this.realTimeClient = Suppliers.memoize(() -> new RealTimeClient(clientOptions));
    }

    public JobsClient jobs() {
        return this.jobsClient.get();
    }

    public RealTimeClient realTime() {
        return this.realTimeClient.get();
    }
}
