package com.qa;

public class StringManipulationInJava {
	
	public static void main(String[] args) {
		
		String s1="The Rains Have Started Here";
		System.out.println(s1.length());//27 (0-26)
		System.out.println(s1.charAt(5));// a
		System.out.println(s1.indexOf('s')); //8 1st accurance of s
		System.out.println(s1.indexOf('S',9));//15 hard coded value
		System.out.println(s1.indexOf('S',s1.indexOf('s')+1));//15 2nd accurance of s
		System.out.println(s1.indexOf("Have"));//10
		System.out.println(s1.indexOf("have"));// -1
		
		//String Comparision
		String s2="The Rains Have Started Here";
		System.out.println(s1.equals(s2)); //true
		
		String s3="the rains have started here";
		System.out.println(s1.equals(s3)); //false
		
		//SubString
		
		System.out.println(s1.substring(0,9)); //The Rains
		
		//Trim
		
		String s4="     Hello World    ";
		System.out.println(s4);
		System.out.println(s4.trim());
		System.out.println(s4.replace(" ", ""));
		
		String date="01-01-2021";
		System.out.println(date.replace("-", "/"));
		
		//Split
		String s5="My_Name_is_Akhilesh";
		String s6[]=s5.split("-");
		for(int i=0; i<s6.length; i++) {
			System.out.println(s6[i]);
		}
		
		// Concat
		String s7="Hello";
		System.out.println(s7.concat(" World"));
		
		String x="Hello";
		String y="World";
		int a=100;
		int b=200;
		
		System.out.println(x+y);
		System.out.println(a+b);
		System.out.println(x+y+a+b);
		System.out.println(a+b+x+y);
		System.out.println(x+y+(a+b));
		
		String s8="AKHILESH";
		System.out.println(s8.toLowerCase());
		
		String s9="akhilesh";
		System.out.println(s9.toUpperCase());
		
		String s10="akhileshchaubey";
		System.out.println(s10.lastIndexOf('a'));//10
	}

}
