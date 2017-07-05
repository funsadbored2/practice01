package com.javaex.ex01;

import java.util.Scanner;

public class Prac07 {

	public static void main(String[] args) {
		
		System.out.println("==============");
		System.out.println("  숫자맞추기 게임  ");
		System.out.println("==============");
		
		int num = (int)(Math.random()*100)+1;//랜덤 값
		Scanner sc = new Scanner(System.in);
		
			while(true){
				
				System.out.print(">>");
	
				int insert = sc.nextInt();
				
				
						if(insert < num) {//num보다 낮은 값을 입력한 경우
							
							System.out.println("더 높게");
							
						}
						else if(insert > num) {//num보다 높은 값을 입력한 경우
							
							System.out.println("더 낮게");
						
						} else {//정답을 맞춘 경우
							
							System.out.println("정답입니다.");
							System.out.print("게임을 종료하시겠습니까? (y/n) >> ");
							String answer = sc.next();
							
						        //질문에 대한 응답 처리를 위해 else 안에 if문 사용
							
								if("y".equals(answer)) {//y입력하면 종료
									
									System.out.println("종료합니다.");
									break;
									
								} else {//no입력 시 타이틀 다시 불러오고 랜덤값 재입력
									
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
