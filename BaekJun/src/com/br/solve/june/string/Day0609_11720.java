package com.br.solve.june.string;

import java.util.Scanner;

public class Day0609_11720 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = Integer.parseInt(sc.nextLine());
		String s = sc.nextLine();
		int[] arr = new int[a];
		int sum = 0;
		
		for(int i = 0; i < a; i++) {
			arr[i] = s.charAt(i);
			System.out.println(arr[i]);
		}
		
		System.out.println(sum);
	}

}
