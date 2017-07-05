package com.javaex.ex01;

public class Prac04 {
	
	public static void main(String[] args) {
		
		for(int row = 1; row < 11; row++) { //세로10번
			
			int num = row;
			
			 for(int line = 1; line < 11; line++) { //가로10번
				
                System.out.print(num + "	");
                
                num++;
                	 
              }  
			 
        System.out.println(); 
        
		}
			
	}
		
}
