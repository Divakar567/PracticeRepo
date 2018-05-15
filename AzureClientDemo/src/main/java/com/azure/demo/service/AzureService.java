package com.azure.demo.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.azure.demo.model.AARecommendations;
import com.azure.demo.model.AuthProperties;
import com.azure.demo.model.OperationEntityListResult;
import com.azure.demo.model.RateCardTokenResponse;
import com.azure.demo.model.ResourceListResult;
import com.microsoft.aad.adal4j.AuthenticationException;
import com.microsoft.azure.AzureEnvironment;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.credentials.ApplicationTokenCredentials;
import com.microsoft.azure.management.Azure;

@Service
public class AzureService {

	@Autowired
	AuthProperties authProperties;

	public RateCardTokenResponse generateAzureTocken() {
		RateCardTokenResponse rateCardTokenResponseObj = null;
		RestTemplate restTemplate = new RestTemplate();

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

		MultiValueMap<String, String> map = new LinkedMultiValueMap<>();
		map.add("grant_type", authProperties.getGrantType());
		map.add("client_id", authProperties.getClientId());
		map.add("client_secret", authProperties.getClientSecret());
		map.add("resource", authProperties.getResource());
		authProperties.setTockenURL(authProperties.getTockenURL().replace("{tenant-id}", authProperties.getTenantId()));
		
		HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<>(map, headers);
		rateCardTokenResponseObj = (RateCardTokenResponse) restTemplate.postForObject(authProperties.getTockenURL(),
				request, RateCardTokenResponse.class, new Object[0]);

		return rateCardTokenResponseObj;
	}

	public Azure getAzureEntry() throws CloudException, IOException {
		Azure azure = null;
		try {
			ApplicationTokenCredentials credentials = new ApplicationTokenCredentials(authProperties.getClientId(),
					authProperties.getTenantId(), authProperties.getClientSecret(), AzureEnvironment.AZURE);
			azure = Azure.authenticate(credentials).withDefaultSubscription();
			System.out.println("Authenticaiton successfully completed");
		} catch (AuthenticationException e) {
			e.printStackTrace();
		}
		return azure;
	}

	public ResourceListResult getResourceListResult(RateCardTokenResponse rateCardTokenResponse) {
		String resourceListURL = "https://management.azure.com/subscriptions/{subscriptionId}/resources";
		resourceListURL = resourceListURL.replace("{subscriptionId}", authProperties.getSubscriptionId());

		UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromHttpUrl(resourceListURL).queryParam("api-version",
				"2018-02-01");

		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.set("Authorization",
				rateCardTokenResponse.getTokenType() + " " + rateCardTokenResponse.getAccessToken());
		httpHeaders.set("content-type", "application/json");

		HttpEntity<?> httpEntity = new HttpEntity<>(httpHeaders);

		RestTemplate restTemplate = new RestTemplate();
		HttpEntity<ResourceListResult> responseEntiy = restTemplate.exchange(uriBuilder.toUriString(), HttpMethod.GET,
				httpEntity, ResourceListResult.class);
		return responseEntiy.getBody();
	}

	public OperationEntityListResult getOperationEntities(RateCardTokenResponse rateCardTokenResponse) {
		String operationEntitieListURL = "https://management.azure.com/providers/Microsoft.Advisor/operations";
		UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromHttpUrl(operationEntitieListURL).queryParam("api-version",
				"2017-03-31");

		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.set("Authorization",
				rateCardTokenResponse.getTokenType() + " " + rateCardTokenResponse.getAccessToken());
		httpHeaders.set("content-type", "application/json");

		HttpEntity<?> httpEntity = new HttpEntity<>(httpHeaders);

		RestTemplate restTemplate = new RestTemplate();
		HttpEntity<OperationEntityListResult> responseEntiy = restTemplate.exchange(uriBuilder.toUriString(), HttpMethod.GET,
				httpEntity, OperationEntityListResult.class);
		return responseEntiy.getBody();
	}

	public AARecommendations getAdviserRecommendations(RateCardTokenResponse rateCardTokenResponse) {
		String adviserRecommendationsURL = "https://management.azure.com/subscriptions/{subscriptionId}/providers/Microsoft.Advisor/recommendations";
		adviserRecommendationsURL = adviserRecommendationsURL.replace("{subscriptionId}", authProperties.getSubscriptionId());
		UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromHttpUrl(adviserRecommendationsURL).queryParam("api-version",
				"2017-03-31");

		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.set("Authorization",
				rateCardTokenResponse.getTokenType() + " " + rateCardTokenResponse.getAccessToken());
		httpHeaders.set("content-type", "application/json");

		HttpEntity<?> httpEntity = new HttpEntity<>(httpHeaders);

		RestTemplate restTemplate = new RestTemplate();
		HttpEntity<AARecommendations> responseEntiy = restTemplate.exchange(uriBuilder.toUriString(), HttpMethod.GET,
				httpEntity, AARecommendations.class);
		return responseEntiy.getBody();
	}
}
