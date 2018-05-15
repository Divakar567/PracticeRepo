package com.azure.demo.model;

public class OperationDisplayInfo {
	String description;
	String operation;
	String provider;
	String resource;

	public OperationDisplayInfo() {
		super();
	}

	public OperationDisplayInfo(String description, String operation, String provider, String resource) {
		super();
		this.description = description;
		this.operation = operation;
		this.provider = provider;
		this.resource = resource;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public String getResource() {
		return resource;
	}

	public void setResource(String resource) {
		this.resource = resource;
	}
}
