package com.br.solve.june;

import java.util.Scanner;

public class Day0607_1110 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 스트링으로 수를 입력받고, char로 나눠서 하나하나 분리하던가
		// 아니면 숫자로 받아서 % , / 로 풓던가
		// 후자를 해 보자
		
		int num = sc.nextInt(); 
				
		int count = 0;
		int copy = num;
		int setNo = 0;
		
		while(true) {
			
			num = ((num % 10) * 10) + (((num / 10) + (num % 10)) % 10);
			count ++;
			
			if (copy == num) {
				break;
			}
			
		}
		System.out.println(count);
	}
}
