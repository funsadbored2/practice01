package com.javaex.ex01;

import java.util.Scanner;

public class Prac02 {
	
		 public static void main(String[] args) {
			 
			 Scanner sc = new Scanner(System.in);
			 
			 System.out.print("숫자를 입력하세요. \n숫자:");
			 int num = sc.nextInt();	 
			 int count = 1;
				 
					 for(int row = 1; row <= num; row++) {//열, 입력한 숫자 만큼 높이를 설정
							 
									 for(int line = 1; line <= count; line++) {//행, 한줄 입력할 때 마다 증가, count만큼 입력.
										 
									 System.out.print(count);
										 
									 }
							 
					  count++;//한 줄 입력될 때마다 1씩 증가시킨다. 
								 
					  System.out.println();//입력이 끝나면 엔터 
					 }
					 
			 sc.close();
			 
		 }
		 
}

		 			 
		

