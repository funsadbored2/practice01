package com.javaex.ex01;

import java.util.Scanner;

public class Prac07 {

	public static void main(String[] args) {
		
		System.out.println("==============");
		System.out.println("  숫자맞추기 게임  ");
		System.out.println("==============");
		
		int num = (int)(Math.random()*100)+1;
		
		Scanner sc = new Scanner(System.in);
		
			while(true){
				
				System.out.print(">>");
	
				int insert = sc.nextInt();
				
				
						if(insert < num) {
							
							System.out.println("더 높게");
							
						}
						else if(insert > num) {
							
							System.out.println("더 낮게");
						
						} else {
							
							System.out.println("정답입니다.");
							System.out.print("게임을 종료하시겠습니까? (y/n) >> ");
							String answer = sc.next();
						    
								if("y".equals(answer)) {
									System.out.println("종료합니다.");
									break;
								} else {
									
									System.out.println("==============");
									System.out.println("  숫자맞추기 게임  ");
									System.out.println("==============");
									
									num = (int)(Math.random()*100)+1;
									
									continue;}
						  }
			}
	   sc.close();	
	}
}
