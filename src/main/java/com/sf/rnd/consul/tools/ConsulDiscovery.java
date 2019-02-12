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
	public String getDasboardServiceURI() {
		return services.discoverServiceURI("dashboardms");
	}

	@Override
	public String getModuleServiceURI() {
		return services.discoverServiceURI("modulems");
	}

	@Override
	public String getPayrollServiceURI() {
		return services.discoverServiceURI("payrollms");
	}

	@Override
	public String getOrgansationServiceURI() {
		return services.discoverServiceURI("organisationms");
	}

	@Override
	public String getSubscriptionServiceURI() {
		return services.discoverServiceURI("subscriptionms");
	}

	@Override
	public String getDepartmentServiceURI() {
		return services.discoverServiceURI("departmentms");
	}

	@Override
	public String getTransactionServiceURI() {
		return services.discoverServiceURI("transactionms");
	}
}
