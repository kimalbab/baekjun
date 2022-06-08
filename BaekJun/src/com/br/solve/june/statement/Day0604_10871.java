package com.br.solve.june;

import java.util.Scanner;

public class Day0604_10871 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int [] arr = new int [n];
		
		for(int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < x) {
				System.out.print(arr[i] + " ");
			}
		}
		
		
		/*
		 * 원래는 이렇게 풀었음
		 * 
		 * int n = sc.nectInt();
		 * int x = sc.nextInt();
		 * 
		 * StringBuilder sb = new String Builder();
		 * 
		 * for(int i = 0; i < n; i++) {
		 * 		int value = sc.nextInt();
		 * 			if(value < x) {
		 * 				sb.append (value + " ");
		 * 			}
		 * 		}
		 * System.out.println(sb);
		 */
		
	}

}