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
		int num5 = sc.nextInt();
		
		int high = num1;
		
		if(high < num2) {
			
			high = num2;	
		}
		
		if(high < num3) {
			
			high = num3;	
		}
        
		if(high < num4) {
			
			high = num4;	
		}
        
		if(high < num5) {
			
			high = num5;	
		}
		
        System.out.println(high);
        
		sc.close();
        
	}

}
