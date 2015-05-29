/*
 * Copyright 2015 Stormpath, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.stormpath.spring.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.LogoutHandler;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @since 1.0.RC4.3
 */
@Component
public class StormpathLogoutHandler implements LogoutHandler {

    @Autowired
    protected StormpathWebMvcConfiguration stormpathWebMvcConfiguration;

    @Override
    public void logout(HttpServletRequest request, HttpServletResponse response, Authentication authentication) {
        removeAccount(request, response);
    }

    private void removeAccount(HttpServletRequest request, HttpServletResponse response) {
        stormpathWebMvcConfiguration.stormpathAuthenticationResultSaver().set(request, response, null);
    }

}