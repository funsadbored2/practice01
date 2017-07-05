package com.javaex.ex01;

import java.util.Scanner;

public class Prac06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력해주세요! \n숫자: ");
		int num = sc.nextInt();
		int sum = 0;

		if(num%2 != 0){//홀수일 때

			for(int odd = 1; odd <= num; odd++){
	
					if(odd%2 != 0){
	
					      sum = sum + odd;
	
					} else {continue;}
	
			}
	    System.out.println(sum);
		}
		else { //짝수일 때
			
			for(int even = 1; even <= num; even++) {
				
				if(even % 2 == 0) {
					
					sum = sum + even;
					
				} else {continue;}
				
			}
			System.out.println(sum);
		}
		
	sc.close();
	
	}
	
}
