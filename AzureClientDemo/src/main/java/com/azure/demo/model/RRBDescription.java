package com.azure.demo.model;

public class RRBDescription {
	private String problem;
	private String solution;

	public RRBDescription() {
		super();
	}

	public RRBDescription(String problem, String solution) {
		super();
		this.problem = problem;
		this.solution = solution;
	}

	public String getProblem() {
		return problem;
	}

	public void setProblem(String problem) {
		this.problem = problem;
	}

	public String getSolution() {
		return solution;
	}

	public void setSolution(String solution) {
		this.solution = solution;
	}
}
