package com.demo;

public class Test {

	public static void main(String[] args) {
		String s = "Hel lo";
		
		int count =0 ;
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i)!=' ') {
				count++;
			}
		}
       System.out.println("count charctor of o :- "+count);
	}

}
