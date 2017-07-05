package com.javaex.ex01;

import java.util.Scanner;

public class Prac05 {
	
	public static void main(String args[]) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 5개를 입력하세요");
		
		System.out.print("숫자:");
		int num1 = sc.nextInt();
		System.out.print("숫자:");
		int num2 = sc.nextInt();
		System.out.print("숫자:");
		int num3 = sc.nextInt();
		System.out.print("숫자:");
		int num4 = sc.nextInt();
		System.out.print("숫자:");
		int high = sc.nextInt();//숫자 입력 받는 부분 //일단 마지막으로 입력받은 값을 임의로 high(최대값)로 잡음
		
			if(high < num1) {
				
				high = num1;	
			} 
		
			if(high < num2) {
				
				high = num2;	
			}
			
			if(high < num3) {
				
				high = num3;	
			}
	        
			if(high < num4) {
				
				high = num4;	
			}//숫자 5개를 비교
		
        System.out.println("최대값은 " + high);
        
		sc.close();
        
	}

}
