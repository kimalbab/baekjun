package com.br.solve.june;

import java.util.Scanner;

public class Day0606_10818 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int [] arr = new int[a];
		
		int max = 1000000;
		int min = -1000000;
		
		for(int i = 0; i < a; i++) {
			arr[i] = sc.nextInt();
		}
		
		int maxmax = 0;
		
		for(int i = 0; i<arr.length; i++) {
			if(arr[].next()) {
				if(arr[i] > arr[i+1]) {
					maxmax = arr[i];
				} else {
					maxmax = arr[i+1];
				}
			}
			
		}
	}

}