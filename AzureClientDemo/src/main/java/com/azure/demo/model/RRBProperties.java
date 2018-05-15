package com.azure.demo.model;

import java.util.Map;

public class RRBProperties {
	private Category category;
	private Impact impact;
	private String impactedField;
	private String impactedValue;
	private String lastUpdated;
	private Map<String, Object> metadata;
	private String recommendationTypeId;
	private Risk risk;
	private RRBDescription shortDescription;
	private String[] suppressionIds;

	private enum Category {
		Cost, HighAvailability, Performance, Security;
	}

	private enum Impact {
		High, Low, Medium;
	}

	private enum Risk {
		Error, None, Warning;
	}

	public RRBProperties() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RRBProperties(Category category, Impact impact, String impactedField, String impactedValue,
			String lastUpdated, Map<String, Object> metadata, String recommendationTypeId, Risk risk,
			RRBDescription shortDescription, String[] suppressionIds) {
		super();
		this.category = category;
		this.impact = impact;
		this.impactedField = impactedField;
		this.impactedValue = impactedValue;
		this.lastUpdated = lastUpdated;
		this.metadata = metadata;
		this.recommendationTypeId = recommendationTypeId;
		this.risk = risk;
		this.shortDescription = shortDescription;
		this.suppressionIds = suppressionIds;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Impact getImpact() {
		return impact;
	}

	public void setImpact(Impact impact) {
		this.impact = impact;
	}

	public String getImpactedField() {
		return impactedField;
	}

	public void setImpactedField(String impactedField) {
		this.impactedField = impactedField;
	}

	public String getImpactedValue() {
		return impactedValue;
	}

	public void setImpactedValue(String impactedValue) {
		this.impactedValue = impactedValue;
	}

	public String getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(String lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public Map<String, Object> getMetadata() {
		return metadata;
	}

	public void setMetadata(Map<String, Object> metadata) {
		this.metadata = metadata;
	}

	public String getRecommendationTypeId() {
		return recommendationTypeId;
	}

	public void setRecommendationTypeId(String recommendationTypeId) {
		this.recommendationTypeId = recommendationTypeId;
	}

	public Risk getRisk() {
		return risk;
	}

	public void setRisk(Risk risk) {
		this.risk = risk;
	}

	public RRBDescription getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(RRBDescription shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String[] getSuppressionIds() {
		return suppressionIds;
	}

	public void setSuppressionIds(String[] suppressionIds) {
		this.suppressionIds = suppressionIds;
	}

}
