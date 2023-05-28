package com.inventoryAssignment;

import java.util.List;

public class StoreRoom {
	private int storeRoomId;
	private double area;
	private List<Shelf> listOfshelfs;
	
	public StoreRoom(int storeRoomId, double area, List<Shelf> listOfshelfs) {
		super();
		this.storeRoomId = storeRoomId;
		this.area = area;
		this.listOfshelfs = listOfshelfs;
	}

	public int getStoreRoomId() {
		return storeRoomId;
	}

	public void setStoreRoomId(int storeRoomId) {
		this.storeRoomId = storeRoomId;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public List<Shelf> getListOfshelfs() {
		return listOfshelfs;
	}

	public void setListOfshelfs(List<Shelf> listOfshelfs) {
		this.listOfshelfs = listOfshelfs;
	}

	@Override
	public String toString() {
		return "StoreRoom [storeRoomId=" + storeRoomId + ", area=" + area + ", listOfshelfs=" + listOfshelfs + "]";
	}
	
}

