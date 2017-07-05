package com.javaex.ex01;

import java.util.Scanner;

public class Prac08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int money = 0 , minus, plus;
		boolean run = true;
		
		while(run) {
			
				System.out.println("--------------------------");
				System.out.println("1.예금 2.출금 .3.잔고 4.종료");
				System.out.println("--------------------------");
				
				System.out.print("선택:");
				int num = sc.nextInt();
				
				
				switch(num) {
				
				case 1: 
					System.out.print("예금액:");
					plus = sc.nextInt();
					money = money + plus;
					break;
				
				case 2:
					System.out.print("출금액:");
					minus = sc.nextInt();
					money = money - minus;
					break;
					
				case 3:
					System.out.print("잔고:");
				    System.out.println(money);
				    break;
				    
				case 4:
					System.out.println("종료됩니다.");	 
				    run = false;
					break;
				
				default:
					System.out.println("다시입력해주세요");
					break;
				
				}
		
		}
		sc.close();
	}
   
}
