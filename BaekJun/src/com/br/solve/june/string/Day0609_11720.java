package com.br.solve.june.string;

import java.util.Scanner;

public class Day0609_11720 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = Integer.parseInt(sc.nextLine());
		
		String s = sc.nextLine();
		
		int sum = 0;
		
		char [] arr = s.toCharArray();
		String [] stArr = new String [a];
		
		for(int i = 0; i < a; i++) {
			
			stArr[i] = Character.toString(arr[i]);
			
		}
		
		for(int i = 0; i < a; i++) {
			
			sum += Integer.parseInt(stArr[i]);
			
		}
		System.out.println(sum);
	}

}
