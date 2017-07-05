package com.javaex.ex01;

public class Prac04 {
	
	public static void main(String[] args) {
		
		
		for(int row = 1; row < 11; row++) { //세로10번
			
			 int num = row;
			
			 for(int line = 0; line < 10; line++) { //가로10번
				
                System.out.print(num + "	");
                
                num++;
                	 
              }  
			 
			 System.out.println(); 
			}
		
		}
	
}

		/*//다른 변수 없이 row와 line만으로 해결
		for(int row = 1; row < 11; row++) { //세로10번
			
			 for(int line = 0; line < 10; line++) { //가로10번
				 System.out.print(row+line + "	");
			  }  
			 
			 System.out.println(); 
	   
		}
		
	}
		
}
*/