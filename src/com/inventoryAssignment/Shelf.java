package com.inventoryAssignment;

import java.util.List;

public class Shelf {
	private int shelfID;
	private int volume;
	private List<Part> listOfParts;
	
	public Shelf(int shelfID, int volume, List<Part> listOfParts) {
		super();
		this.shelfID = shelfID;
		this.volume = volume;
		this.listOfParts = listOfParts;
	}

	public int getShelfID() {
		return shelfID;
	}

	public void setShelfID(int shelfID) {
		this.shelfID = shelfID;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public List<Part> getListOfParts() {
		return listOfParts;
	}

	public void setListOfParts(List<Part> listOfParts) {
		this.listOfParts = listOfParts;
	}

	@Override
	public String toString() {
		return "Shelf [shelfID=" + shelfID + ", volume=" + volume + ", listOfParts=" + listOfParts + "]";
	}
	
	

}
