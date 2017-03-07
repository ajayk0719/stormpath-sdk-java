package com.stormpath.sdk.impl.okta;

import com.stormpath.sdk.impl.ds.InternalDataStore;
import com.stormpath.sdk.impl.resource.AbstractInstanceResource;
import com.stormpath.sdk.impl.resource.Property;
import com.stormpath.sdk.okta.Credentials;
import com.stormpath.sdk.okta.Link;
import com.stormpath.sdk.okta.Profile;
import com.stormpath.sdk.okta.User;
import com.stormpath.sdk.okta.UserStatus;

import java.util.Date;
import java.util.Map;

/**
 * Default implementation of {@link com.stormpath.sdk.okta.User}.
 */
public class DefaultUser extends AbstractInstanceResource implements User  {

    private static final Map<String, Property> PROPERTY_DESCRIPTORS = createPropertyDescriptorMap();

    public DefaultUser(InternalDataStore dataStore) {
        super(dataStore);
    }

    public DefaultUser(InternalDataStore dataStore, Map<String, Object> properties) {
        super(dataStore, properties);
    }

    @Override
    public Map<String, Property> getPropertyDescriptors() {
        return PROPERTY_DESCRIPTORS;
    }

    @Override
    public String getId() {
        return null;
    }

    @Override
    public User setId(String string) {
        return null;
    }

    @Override
    public UserStatus getStatus() {
        return null;
    }

    @Override
    public User setStatus(UserStatus userStatus) {
        return null;
    }

    @Override
    public Date getStatusChanged() {
        return null;
    }

    @Override
    public User setStatusChanged(Date statusChangedDate) {
        return null;
    }

    @Override
    public Date getCreated() {
        return null;
    }

    @Override
    public User setCreated(Date createdDate) {
        return null;
    }

    @Override
    public Date getLastLogin() {
        return null;
    }

    @Override
    public User setLastLogin(Date lastLoginDate) {
        return null;
    }

    @Override
    public Date getLastUpdated() {
        return null;
    }

    @Override
    public User setLastUpdated(Date lastUpdatedDate) {
        return null;
    }

    @Override
    public Date getPasswordChanged() {
        return null;
    }

    @Override
    public User setPasswordChanged(Date passwordChangedDate) {
        return null;
    }

    @Override
    public Profile getProfile() {
        return null;
    }

    @Override
    public User setProfile(Profile profile) {
        return null;
    }

    @Override
    public Map<String, Link> getLinks() {
        return null;
    }

    @Override
    public User setLinks(Map<String, Link> links) {
        return null;
    }

    @Override
    public Credentials getCredentials() {
        return null;
    }

    @Override
    public User setCredentials(Credentials credentials) {
        return null;
    }
}
