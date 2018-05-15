package com.azure.demo.model;

public class ResourceRecommendation {
	private String id;
	private String name;
	private RRBProperties properties;
	private String type;

	public ResourceRecommendation() {
		super();
	}

	public ResourceRecommendation(String id, String name, RRBProperties properties, String type) {
		super();
		this.id = id;
		this.name = name;
		this.properties = properties;
		this.type = type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public RRBProperties getProperties() {
		return properties;
	}

	public void setProperties(RRBProperties properties) {
		this.properties = properties;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
