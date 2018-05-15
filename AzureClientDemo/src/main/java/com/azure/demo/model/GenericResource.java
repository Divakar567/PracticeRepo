package com.azure.demo.model;

import java.util.Map;

import com.microsoft.azure.management.resources.Identity;
import com.microsoft.azure.management.resources.Plan;
import com.microsoft.azure.management.resources.Sku;

public class GenericResource {
	private String id;
	private Identity identity;
	private String kind;
	private String location;
	private String managedBy;
	private String name;
	private Plan plan;
	private Object properties;
	private Sku sku;
	private Map<String, String> tags;
	private String type;

	public GenericResource() {
		super();
	}

	public GenericResource(String id, Identity identity, String kind, String location, String managedBy, String name,
			Plan plan, Object properties, Sku sku, Map<String, String> tags, String type) {
		super();
		this.id = id;
		this.identity = identity;
		this.kind = kind;
		this.location = location;
		this.managedBy = managedBy;
		this.name = name;
		this.plan = plan;
		this.properties = properties;
		this.sku = sku;
		this.tags = tags;
		this.type = type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Identity getIdentity() {
		return identity;
	}

	public void setIdentity(Identity identity) {
		this.identity = identity;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getManagedBy() {
		return managedBy;
	}

	public void setManagedBy(String managedBy) {
		this.managedBy = managedBy;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Plan getPlan() {
		return plan;
	}

	public void setPlan(Plan plan) {
		this.plan = plan;
	}

	public Object getProperties() {
		return properties;
	}

	public void setProperties(Object properties) {
		this.properties = properties;
	}

	public Sku getSku() {
		return sku;
	}

	public void setSku(Sku sku) {
		this.sku = sku;
	}

	public Map<String, String> getTags() {
		return tags;
	}

	public void setTags(Map<String, String> tags) {
		this.tags = tags;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
