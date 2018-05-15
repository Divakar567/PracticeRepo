package com.azure.demo.model;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AuthProperties {
	@Value("${azure.api.auth.grant_type}")
	public String grantType;
	@Value("${azure.api.auth.subscription_id}")
	public String subscriptionId;
	@Value("${azure.api.auth.client_id}")
	public String clientId;
	@Value("${azure.api.auth.tenant_id}")
	public String tenantId;
	@Value("${azure.api.auth.client_secret}")
	public String clientSecret;
	@Value("${azure.api.auth.resource}")
	public String resource;
	@Value("${azure.api.auth_token.url}")
	public String tockenURL;
	@Value("${azure.api.rate_card.url}")
	public String rateCardURL;
	@Value("#{${azure.api.rate_card.currencies}}")
	public HashMap<String, String> currencies;

	public AuthProperties() {
		super();
	}

	public AuthProperties(String grantType, String subscriptionId, String clientId, String tenantId,
			String clientSecret, String resource, String tockenURL, String rateCardURL,
			HashMap<String, String> currencies) {
		super();
		this.grantType = grantType;
		this.subscriptionId = subscriptionId;
		this.clientId = clientId;
		this.tenantId = tenantId;
		this.clientSecret = clientSecret;
		this.resource = resource;
		this.tockenURL = tockenURL;
		this.rateCardURL = rateCardURL;
		this.currencies = currencies;
	}

	public String getGrantType() {
		return grantType;
	}

	public void setGrantType(String grantType) {
		this.grantType = grantType;
	}

	public String getSubscriptionId() {
		return subscriptionId;
	}

	public void setSubscriptionId(String subscriptionId) {
		this.subscriptionId = subscriptionId;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getTenantId() {
		return tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public String getClientSecret() {
		return clientSecret;
	}

	public void setClientSecret(String clientSecret) {
		this.clientSecret = clientSecret;
	}

	public String getResource() {
		return resource;
	}

	public void setResource(String resource) {
		this.resource = resource;
	}

	public String getTockenURL() {
		return tockenURL;
	}

	public void setTockenURL(String tockenURL) {
		this.tockenURL = tockenURL;
	}

	public String getRateCardURL() {
		return rateCardURL;
	}

	public void setRateCardURL(String rateCardURL) {
		this.rateCardURL = rateCardURL;
	}

	public HashMap<String, String> getCurrencies() {
		return currencies;
	}

	public void setCurrencies(HashMap<String, String> currencies) {
		this.currencies = currencies;
	}

}
