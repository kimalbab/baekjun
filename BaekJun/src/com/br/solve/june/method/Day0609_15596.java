package com.br.solve.june.method;

import java.util.Scanner;

public class Day0609_15596 {

	
	long sum(int[] a) {
		long ans = 0;
		
		
		for(int i = 0; i < a.length; i++) {
			ans += a[i];
		}
		
		return ans;
		
	}

}

// 그냥 내가 만든 코드
/*
public void method1() {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	
	int sum = 0;
	
	for(int i = 0; i < n; i++) {
		sum += sc.nextInt();
	}
} 
*/