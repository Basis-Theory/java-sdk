/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.basis.theory.api;

import com.basis.theory.api.core.ClientOptions;
import com.basis.theory.api.core.Suppliers;
import com.basis.theory.api.resources.applicationkeys.ApplicationKeysClient;
import com.basis.theory.api.resources.applications.ApplicationsClient;
import com.basis.theory.api.resources.applicationtemplates.ApplicationTemplatesClient;
import com.basis.theory.api.resources.logs.LogsClient;
import com.basis.theory.api.resources.permissions.PermissionsClient;
import com.basis.theory.api.resources.proxies.ProxiesClient;
import com.basis.theory.api.resources.reactorformulas.ReactorformulasClient;
import com.basis.theory.api.resources.reactors.ReactorsClient;
import com.basis.theory.api.resources.roles.RolesClient;
import com.basis.theory.api.resources.sessions.SessionsClient;
import com.basis.theory.api.resources.tenants.TenantsClient;
import com.basis.theory.api.resources.threeds.ThreedsClient;
import com.basis.theory.api.resources.tokenize.TokenizeClient;
import com.basis.theory.api.resources.tokens.TokensClient;
import java.util.function.Supplier;

public class BasisTheoryApiClient {
    protected final ClientOptions clientOptions;

    protected final Supplier<ApplicationsClient> applicationsClient;

    protected final Supplier<ApplicationKeysClient> applicationKeysClient;

    protected final Supplier<ApplicationTemplatesClient> applicationTemplatesClient;

    protected final Supplier<LogsClient> logsClient;

    protected final Supplier<PermissionsClient> permissionsClient;

    protected final Supplier<ProxiesClient> proxiesClient;

    protected final Supplier<ReactorformulasClient> reactorformulasClient;

    protected final Supplier<ReactorsClient> reactorsClient;

    protected final Supplier<RolesClient> rolesClient;

    protected final Supplier<SessionsClient> sessionsClient;

    protected final Supplier<ThreedsClient> threedsClient;

    protected final Supplier<TokenizeClient> tokenizeClient;

    protected final Supplier<TokensClient> tokensClient;

    protected final Supplier<TenantsClient> tenantsClient;

    public BasisTheoryApiClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
        this.applicationsClient = Suppliers.memoize(() -> new ApplicationsClient(clientOptions));
        this.applicationKeysClient = Suppliers.memoize(() -> new ApplicationKeysClient(clientOptions));
        this.applicationTemplatesClient = Suppliers.memoize(() -> new ApplicationTemplatesClient(clientOptions));
        this.logsClient = Suppliers.memoize(() -> new LogsClient(clientOptions));
        this.permissionsClient = Suppliers.memoize(() -> new PermissionsClient(clientOptions));
        this.proxiesClient = Suppliers.memoize(() -> new ProxiesClient(clientOptions));
        this.reactorformulasClient = Suppliers.memoize(() -> new ReactorformulasClient(clientOptions));
        this.reactorsClient = Suppliers.memoize(() -> new ReactorsClient(clientOptions));
        this.rolesClient = Suppliers.memoize(() -> new RolesClient(clientOptions));
        this.sessionsClient = Suppliers.memoize(() -> new SessionsClient(clientOptions));
        this.threedsClient = Suppliers.memoize(() -> new ThreedsClient(clientOptions));
        this.tokenizeClient = Suppliers.memoize(() -> new TokenizeClient(clientOptions));
        this.tokensClient = Suppliers.memoize(() -> new TokensClient(clientOptions));
        this.tenantsClient = Suppliers.memoize(() -> new TenantsClient(clientOptions));
    }

    public ApplicationsClient applications() {
        return this.applicationsClient.get();
    }

    public ApplicationKeysClient applicationKeys() {
        return this.applicationKeysClient.get();
    }

    public ApplicationTemplatesClient applicationTemplates() {
        return this.applicationTemplatesClient.get();
    }

    public LogsClient logs() {
        return this.logsClient.get();
    }

    public PermissionsClient permissions() {
        return this.permissionsClient.get();
    }

    public ProxiesClient proxies() {
        return this.proxiesClient.get();
    }

    public ReactorformulasClient reactorformulas() {
        return this.reactorformulasClient.get();
    }

    public ReactorsClient reactors() {
        return this.reactorsClient.get();
    }

    public RolesClient roles() {
        return this.rolesClient.get();
    }

    public SessionsClient sessions() {
        return this.sessionsClient.get();
    }

    public ThreedsClient threeds() {
        return this.threedsClient.get();
    }

    public TokenizeClient tokenize() {
        return this.tokenizeClient.get();
    }

    public TokensClient tokens() {
        return this.tokensClient.get();
    }

    public TenantsClient tenants() {
        return this.tenantsClient.get();
    }

    public static BasisTheoryApiClientBuilder builder() {
        return new BasisTheoryApiClientBuilder();
    }
}
