package com.azure.demo;

public class VMData {
	String id;
	String name;
	String type;
	String status;
	String resourceGroup;
	String location;
	String maintenance;
	String subscriptionType;
	String ipaddress;

	public VMData() {
		super();
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getResourceGroup() {
		return resourceGroup;
	}

	public void setResourceGroup(String resourceGroup) {
		this.resourceGroup = resourceGroup;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getMaintenance() {
		return maintenance;
	}

	public void setMaintenance(String maintenance) {
		this.maintenance = maintenance;
	}

	public String getSubscriptionType() {
		return subscriptionType;
	}

	public void setSubscriptionType(String subscriptionType) {
		this.subscriptionType = subscriptionType;
	}

	public String getIpaddress() {
		return ipaddress;
	}

	public void setIpaddress(String ipaddress) {
		this.ipaddress = ipaddress;
	}

	public VMData(String id, String name, String type, String status, String resourceGroup, String location,
			String maintenance, String subscriptionType, String ipaddress) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.status = status;
		this.resourceGroup = resourceGroup;
		this.location = location;
		this.maintenance = maintenance;
		this.subscriptionType = subscriptionType;
		this.ipaddress = ipaddress;
	}

	
}
