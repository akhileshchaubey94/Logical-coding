package com.qa;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElement {
	
	public static void main(String[] args) {
		
		String names[]= {"java","Ruby","JavaScript","c#","Python","PHP","java"};
		
		//1. Method: Compare each element: o(n*n) ...Wrost selection
		 for(int i=0; i<names.length; i++)
		 {
			 for(int j=i+1; j<names.length; j++)
			 {
				 if(names[i].equals(names[j]))
				 {
					 System.out.println("Duplicate Element is --"+ names[i]);
				 }
			 }
		 }
		
		 
		 //2. Method:  Using HashSet : Java Collection which is store unique value
		 
		 Set<String>store=new HashSet<String>();
		 for(String name: names)
		 {
			 if(store.add(name)== false)
			 {
				 System.out.println("Duplicate element is--"+ name);
			 }
		 }
	}

}
