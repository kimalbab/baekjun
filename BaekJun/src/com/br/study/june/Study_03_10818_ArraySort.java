package com.br.study.june;

import java.util.Arrays;
import java.util.Scanner;

public class Study_03_10818_ArraySort {
	public static void main(String[] args) {
	
			int a = 10;
			int b = 20;
			
			System.out.println("변경 전 : ");
			System.out.println("a : " + a + " b : " + b);
			
			int temp = 0; //기존값을 보관할 변수
			temp = a; //a = 10, b = 20, temp = 10;
			a = b; // a = 20, b = 20, temp = 10
			b = temp; // a = 20, b = 10, temp = 10;
			
			System.out.println("변경 후 : ");
			System.out.println("a : " + a + " b : " + b);
			
			
			// -------------------------------------------------------------------- //
			
			int[] arr = {2,5,4,1,3};
			
			for(int i = 1; i < arr.length; i++) {
				for(int j = 0; j < i; j ++) {
					if(arr[i] < arr[j]) {
						int max = arr[i];
						arr[i] = arr[j];
						arr[j] = max;
					}
				}
			}
			System.out.println("회전 후 결과 : " +  Arrays.toString(arr));
			System.out.println(Arrays.toString(arr));
			
			// -------------------------------------------------------------------- //
			
			int[] arr2 = {2,5,4,1,3};
			Arrays.sort(arr2);
			System.out.println(Arrays.toString(arr2));
			
			// -------------------------------------------------------------------- //
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("수를 입력하세요.");
			
			
			int [] dong = new int[3];
			
			for(int i = 0; i<dong.length; i++) {
				dong[i] = sc.nextInt();
			}
			
			
			Arrays.sort(dong);
			System.out.println(Arrays.toString(dong));
			
			
			
			
			
			
			
			
		}
	}



