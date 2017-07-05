package com.javaex.ex01;

import java.util.Scanner;

public class Prac06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력해주세요! \n숫자: ");
		int num = sc.nextInt();
		int sum = 0;

		if(num%2 != 0){//홀수일 때

			for(int hol = 1; hol <= num; hol++){
	
					if(hol%2 != 0){
	
					      sum = sum + hol;
	
					} else {continue;}
	
			}
	    System.out.println(sum);
		}
		else { //찍수일 때
			
			for(int jjak = 1; jjak <= num; jjak++) {
				
				if(jjak%2 == 0) {
					
					sum = sum + jjak;
					
				} else {continue;}
				
			}
			System.out.println(sum);
		}
		
	}
	
}
