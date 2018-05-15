package com.azure.demo.model;

import java.util.List;

public class ResourceListResult {
	String nextLink;
	List<GenericResource> value;

	public ResourceListResult() {
		super();
	}

	public ResourceListResult(String nextLink, List<GenericResource> value) {
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

	public List<GenericResource> getValue() {
		return value;
	}

	public void setValue(List<GenericResource> value) {
		this.value = value;
	}
}
