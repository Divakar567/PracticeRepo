package com.azure.demo.model;

import java.util.List;

public class OperationEntityListResult {
	String nextLink;
	List<OperationEntity> value;

	public OperationEntityListResult() {
		super();
	}

	public OperationEntityListResult(String nextLink, List<OperationEntity> value) {
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

	public List<OperationEntity> getValue() {
		return value;
	}

	public void setValue(List<OperationEntity> value) {
		this.value = value;
	}
}
