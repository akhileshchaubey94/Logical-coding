package com.qa;

public class LargestAndSmallestNumberInArray {
	
	public static void main(String[] args) {
		
		int[] numbers= {25,125,1215,-10,6,-350};
		
		int largest=numbers[0];
		int smallest=numbers[0];
		
	    for(int i=1; i< numbers.length; i++) {
	    	if(numbers[i]>largest){
	    		largest=numbers[i];
	    	}
	    	else if(numbers[i]<smallest) {
	    		smallest=numbers[i];
	    	}
	    }
	    System.out.println("Largest Number:" + largest   );
	    System.out.println("Smallest number:" + smallest);
	}

}
