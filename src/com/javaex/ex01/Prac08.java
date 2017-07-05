package com.javaex.ex01;

import java.util.Scanner;

public class Prac08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int money = 0 , minus, plus;
		
		while(true) {
			
				System.out.println("--------------------------");
				System.out.println("1.예금 2.출금 .3.잔고 4.종료");
				System.out.println("--------------------------");
				
				System.out.print("선택:");
				int num = sc.nextInt();
				
				    if(num == 4) {
				    	
				    	System.out.println("종료됩니다.");
				    	 
				    	break;
				    	
				    }
				
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
					    			 
					default:
						
						break;
					
					}
		
		}
		
		sc.close();
		
	}

}
