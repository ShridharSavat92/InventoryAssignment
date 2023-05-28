package com.inventoryAssignment;

import java.util.ArrayList;
import java.util.List;

public class InventoryService {
	List<StoreRoom> inventory;
	List<Part> temp=new ArrayList<>();
	
	public InventoryService(List<StoreRoom> inventory) {
		super();
		this.inventory = inventory;
	}
	
	//method to get location of the part
	public String getInventoryLocationOfPart(Integer partNum) {
		for(StoreRoom st:inventory) {
			for(Shelf sf:st.getListOfshelfs()) {
				for(Part pt:sf.getListOfParts()) {
					if(pt.getPartId()==partNum) {
						return "StoreRoom Id:"+st.getStoreRoomId()+" Shelf Id: "+sf.getShelfID();
					}
					
				}
			}
		}

		return "Id not found";
	}
		
	//methods to get NoOfParts greater than average costOfPart
	public Integer getNoOfPartsGreaterThanAveragePartPrice() {
		double sumOfCost=0.0;
		int count=0;
		double avg=0.0;
		int num=0;
		for(StoreRoom st:inventory) {
			for(Shelf sf:st.getListOfshelfs()) {
				for(Part pt:sf.getListOfParts()) {
					sumOfCost+=pt.getCost();
					count++;
					temp.add(pt);
				}
			}
		}
		
		avg=(sumOfCost/count);
		
		for(Part p:temp) {
			if(p.getCost()>avg) {
				num++;
			}
		}
		
		return num;
	}
	

}
