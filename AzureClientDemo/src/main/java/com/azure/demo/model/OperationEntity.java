package com.azure.demo.model;

public class OperationEntity {
	String name;
	OperationDisplayInfo display;

	public OperationEntity() {
		super();
	}

	public OperationEntity(String name, OperationDisplayInfo display) {
		super();
		this.name = name;
		this.display = display;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public OperationDisplayInfo getDisplay() {
		return display;
	}

	public void setDisplay(OperationDisplayInfo display) {
		this.display = display;
	}
}
