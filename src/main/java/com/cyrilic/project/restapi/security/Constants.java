package com.cyrilic.project.restapi.security;

import java.time.Duration;

public class Constants {
    public static final long ACCESS_TOKEN_VALIDITY_MS = Duration.ofHours(2).toMillis();
	public static final String SIGNING_KEY = "secret";
    public static final String TOKEN_PREFIX = "Bearer";
    public static final String HEADER_STRING = "Authorization";
}
