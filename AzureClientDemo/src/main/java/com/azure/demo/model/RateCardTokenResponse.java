package com.azure.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RateCardTokenResponse {
	@JsonProperty("token_type")
	private String tokenType;
	@JsonProperty("expires_in")
	private String expiresIn;
	@JsonProperty("ext_expires_in")
	private String extExpiresIn;
	@JsonProperty("expires_on")
	private String expiresOn;
	@JsonProperty("not_before")
	private String notBefore;
	private String resource;
	@JsonProperty("access_token")
	private String accessToken;

	public RateCardTokenResponse() {
		super();
	}

	public RateCardTokenResponse(String tokenType, String expiresIn, String extExpiresIn, String expiresOn,
			String notBefore, String resource, String accessToken) {
		super();
		this.tokenType = tokenType;
		this.expiresIn = expiresIn;
		this.extExpiresIn = extExpiresIn;
		this.expiresOn = expiresOn;
		this.notBefore = notBefore;
		this.resource = resource;
		this.accessToken = accessToken;
	}

	public String getTokenType() {
		return tokenType;
	}

	public void setTokenType(String tokenType) {
		this.tokenType = tokenType;
	}

	public String getExpiresIn() {
		return expiresIn;
	}

	public void setExpiresIn(String expiresIn) {
		this.expiresIn = expiresIn;
	}

	public String getExtExpiresIn() {
		return extExpiresIn;
	}

	public void setExtExpiresIn(String extExpiresIn) {
		this.extExpiresIn = extExpiresIn;
	}

	public String getExpiresOn() {
		return expiresOn;
	}

	public void setExpiresOn(String expiresOn) {
		this.expiresOn = expiresOn;
	}

	public String getNotBefore() {
		return notBefore;
	}

	public void setNotBefore(String notBefore) {
		this.notBefore = notBefore;
	}

	public String getResource() {
		return resource;
	}

	public void setResource(String resource) {
		this.resource = resource;
	}

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
}
