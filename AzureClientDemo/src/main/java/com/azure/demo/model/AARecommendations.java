package com.azure.demo.model;

import java.util.List;

public class AARecommendations {
	String nextLink;
	List<ResourceRecommendation> value;

	public AARecommendations() {
		super();
	}

	public AARecommendations(String nextLink, List<ResourceRecommendation> value) {
		super();
		this.nextLink = nextLink;
		this.value = value;
	}

	public String getNextLink() {
		return nextLink;
	}

	public void setNextLink(String nextLink) {
		this.nextLink = nextLink;
	}

	public List<ResourceRecommendation> getValue() {
		return value;
	}

	public void setValue(List<ResourceRecommendation> value) {
		this.value = value;
	}
}
