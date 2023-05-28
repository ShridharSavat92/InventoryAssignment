package com.inventoryAssignment;

public class Part {
	private int partId;
	private double cost;
	
	public Part(int partId, double cost) {
		super();
		this.partId = partId;
		this.cost = cost;
	}

	public int getPartId() {
		return partId;
	}

	public void setPartId(int partId) {
		this.partId = partId;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	
	@Override
	public String toString() {
		return "Part [partId=" + partId + ", cost=" + cost + "]";
	}
	
	
	
	

}
