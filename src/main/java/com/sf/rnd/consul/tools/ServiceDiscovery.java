package com.sf.rnd.consul.tools;

import java.net.URI;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.UriBuilder;

public abstract class ServiceDiscovery {

	private WebTarget userService;
	private WebTarget catalogService;
	private WebTarget cartService;

	public abstract String getUserServiceURI();
	public abstract String getCatalogServiceURI();
	public abstract String getCartServiceURI();

	public WebTarget getUserService() {

		if (null == userService)
			userService = ClientBuilder.newClient().target(UriBuilder.fromUri(URI.create(getUserServiceURI())).path("/user").build());
		return userService;
	}
	
	public WebTarget getCatalogService() {
		if (null == catalogService)
			catalogService = ClientBuilder.newClient().target(UriBuilder.fromUri(URI.create(getCatalogServiceURI())).path("/catalog").build());
		return catalogService;
	}
	
	public WebTarget getCartService() {
		if (null == cartService)
			cartService = ClientBuilder.newClient().target(UriBuilder.fromUri(URI.create(getCartServiceURI())).path("/cart").build());
		return cartService;
	}

}