package com.stormpath.sdk.impl.okta

import com.stormpath.sdk.cache.CacheManager
import com.stormpath.sdk.client.AuthenticationScheme
import com.stormpath.sdk.impl.api.ApiKeyResolver
import com.stormpath.sdk.impl.authc.credentials.ApiKeyCredentials
import com.stormpath.sdk.impl.client.DefaultClient
import com.stormpath.sdk.impl.http.authc.RequestAuthenticatorFactory
import com.stormpath.sdk.impl.util.BaseUrlResolver
import com.stormpath.sdk.lang.Classes
import com.stormpath.sdk.okta.User
import org.testng.annotations.Test

import static org.easymock.EasyMock.expect
import static org.powermock.api.easymock.PowerMock.createStrictMock
import static org.powermock.api.easymock.PowerMock.mockStatic
import static org.powermock.api.easymock.PowerMock.replayAll
import static org.testng.Assert.assertEquals
import static org.testng.Assert.fail
import static org.hamcrest.Matchers.*
import static org.hamcrest.MatcherAssert.*


/**
 * Tests for {@link DefaultUser}.
 */
class DefaultUserTest {

    @Test
    void validateClientInstantiateTest() {

        def apiKeyCredentials = createStrictMock(ApiKeyCredentials)
        def apiKeyResolver = createStrictMock(ApiKeyResolver)
        def cacheManager = createStrictMock(CacheManager)
        def requestAuthenticatorFactory = createStrictMock(RequestAuthenticatorFactory)
        def baseUrlResolver = createStrictMock(BaseUrlResolver)

        replayAll()

        def client = new DefaultClient(apiKeyCredentials,
                apiKeyResolver,
                baseUrlResolver,
                null,
                cacheManager,
                AuthenticationScheme.BASIC,
                requestAuthenticatorFactory,
                3600)

        def user = client.instantiate(User)
        assertThat(user, instanceOf(DefaultUser))

    }
}
