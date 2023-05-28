package com.inventoryAssignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InventoryTest {
	static List<StoreRoom> inventory=new ArrayList<>();
	public static void main(String[] args) {
		List<Part> parts1=new ArrayList<>();
		Part p1=new Part(1,10.50);
		Part p2=new Part(2,12.50);
		
		parts1.add(p1);
		parts1.add(p2);
		
		List<Part> parts2=new ArrayList<>();
		Part p3=new Part(3,11.50);
		Part p4=new Part(4,13.50);
		Part p5=new Part(5,21.50);
		Part p6=new Part(6,9.50);
		
		parts2.add(p3);
		parts2.add(p4);
		parts2.add(p5);
		parts2.add(p6);
		
		List<Shelf> shelfs=new ArrayList<>();
		Shelf shelf1=new Shelf(1,200,parts1);
		Shelf shelf2=new Shelf(2,100,parts2);
		
		shelfs.add(shelf1);
		shelfs.add(shelf2);
		
		StoreRoom storeRoom=new StoreRoom(1,100,shelfs);
		inventory.add(storeRoom);
		
		
		InventoryService service=new InventoryService(inventory);
		
		boolean b=true;
		while(true) {
		try{Scanner sc=new Scanner(System.in);
		System.out.println("Enter the partNumber to extract the location: ");
		int id=sc.nextInt();
		if(id>=0 && id<=Integer.MAX_VALUE) {
		//methods to get location of Part
		System.out.println(service.getInventoryLocationOfPart(id));
		//methods to get NoOfParts greater than average costOfPart
		System.out.println("The noOf parts greate than average costOfPrice: "+service.getNoOfPartsGreaterThanAveragePartPrice());
		b=false;
		break;
		}else {
	}
		}
		catch(Exception e) {
			System.out.println("Please,Enter a Valid Input!");
			
		}
	
		
		
	}
	
	}
}
