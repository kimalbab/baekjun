package com.br.solve.june;

import java.util.Scanner;

public class Day0607_3052 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 스캐너의 수를 하나하나 담을 배열
		int [] arr = new int [10];
		
		
		// 스캐너의 수 % 42한 값들을 하나하나 담는다.
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt() % 42;
		}
		
		int count = 0;
		int sameCount = 0;
		// sameCout 말고 boolean 을 이용한 풀이도 있다!@
		
		
		for(int i = 0; i < 10; i++) {
			sameCount = 0;
			//하나씩 수를 비교해서 두 수가 같지 않으면 카운트를 하나씩 증가시킬 것 이다.
		
			
			//i랑 j랑 비교할거임
			for(int j = i+1; j < 10; j++) {
				if(arr[i] == arr[j]) {
					sameCount ++;
					// 같은값이 있으면 sameCount를 하나씩 증가시켜라
				}
			}
			if (sameCount == 0) {
				count ++;
				// sameCount 값이 늘었다면, 즉 42로 나눈 나머지가 같은값이 있었다면, count를 증가시켜라 
			}
		} System.out.println(count);
		
		
		
		

	}

}
