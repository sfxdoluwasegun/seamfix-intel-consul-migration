package com.sf.rnd.consul.tools;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class ConsulDiscovery extends ServiceDiscovery {

    @Inject
    @ConsulServices
    ServiceRegistry services;

	@Override
	public String getUserServiceURI() {
		return services.discoverServiceURI("userms");
	}

	@Override
	public String getCatalogServiceURI() {
		return services.discoverServiceURI("catalogms");
	}

	@Override
	public String getCartServiceURI() {
		return services.discoverServiceURI("cartms");
	}

	@Override
	public String getClipperServiceURI() {
		return services.discoverServiceURI("bgcleanupms");
	}
	
}
