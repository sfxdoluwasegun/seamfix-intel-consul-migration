package com.sf.rnd.consul.tools;

import java.net.URI;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.UriBuilder;

public abstract class ServiceDiscovery {

	private WebTarget userService;
	private WebTarget moduleService;
	private WebTarget dashboardService;
	private WebTarget payrollService;
	private WebTarget organisationService;
	private WebTarget departmentService;
	private WebTarget subscriptionService;
	private WebTarget transactionService;

	public abstract String getUserServiceURI();
	public abstract String getDasboardServiceURI();
	public abstract String getModuleServiceURI();
	public abstract String getPayrollServiceURI();
	public abstract String getOrgansationServiceURI();
	public abstract String getDepartmentServiceURI();
	public abstract String getSubscriptionServiceURI();
	public abstract String getTransactionServiceURI();

	public WebTarget getUserService() {

		if (null == userService)
			userService = ClientBuilder.newClient().target(UriBuilder.fromUri(URI.create(getUserServiceURI())).path("/user").build());
		return userService;
	}

	public WebTarget getDasboardService() {

		if (null == dashboardService)
			dashboardService = ClientBuilder.newClient().target(UriBuilder.fromUri(URI.create(getDasboardServiceURI())).path("/dashboard").build());
		return dashboardService;
	}

	public WebTarget getOrganisationService() {

		if (null == organisationService)
			organisationService = ClientBuilder.newClient().target(UriBuilder.fromUri(URI.create(getOrgansationServiceURI())).path("/organisation").build());
		return organisationService;
	}

	public WebTarget getModuleService() {

		if (null == moduleService)
			moduleService = ClientBuilder.newClient().target(UriBuilder.fromUri(URI.create(getModuleServiceURI())).path("/module").build());
		return moduleService;
	}

	public WebTarget getPayrollService() {

		if (null == payrollService)
			payrollService = ClientBuilder.newClient().target(UriBuilder.fromUri(URI.create(getPayrollServiceURI())).path("/payroll").build());
		return payrollService;
	}

	public WebTarget getSubscriptionService() {

		if (null == subscriptionService)
			subscriptionService = ClientBuilder.newClient().target(UriBuilder.fromUri(URI.create(getSubscriptionServiceURI())).path("/subscription").build());
		return subscriptionService;
	}
	
	public WebTarget getDepartmentService() {
		if (null == departmentService)
			departmentService = ClientBuilder.newClient().target(UriBuilder.fromUri(URI.create(getDepartmentServiceURI())).path("/department").build());
		return departmentService;
	}
	
	public WebTarget getTransactionService() {
		if (null == transactionService)
			transactionService = ClientBuilder.newClient().target(UriBuilder.fromUri(URI.create(getTransactionServiceURI())).path("/transaction").build());
		return transactionService;
	}

}