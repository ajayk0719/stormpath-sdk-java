package com.stormpath.sdk.okta;

import java.util.Date;

/**
 * User object mapped into the Okta API.
 */
public interface User {

    String getId();
    User setId(String string);

    UserStatus getStatus();
    User setStatus(UserStatus userStatus);

    Date getCreated();
    User setCreated(Date date);

    Profile getProfile();
    User setProfile(Profile profile);

    Links getLinks();
    User setLinks(Links links);

    Credentials getCredentials();
    User setCredentials(Credentials credentials);

}
