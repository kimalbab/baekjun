package com.br.solve.june;

import java.util.Arrays;
import java.util.Scanner;

public class Day0606_10818 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int [] arr = new int[a];
		
		for(int i = 0; i < a; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr); //배열정렬
		int max = arr[arr.length-1];
		int min = arr[0];
		
		System.out.printf("%d %d", min, max);
	}

}