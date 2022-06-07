package com.br.solve.june;

import java.util.Scanner;

public class Day0607_2562 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		
		int [] arr = new int[9];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		
		int max = arr[0];
		
		for(int num : arr) {
			if(num > max) {
				max = num;
			}
		}
		
		int nth = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(max == arr[i]) {
				nth = i+1;
			}
		}
		
		System.out.printf("%d\n%d", max, nth);
		
		
		
		// 내가 한 건 너무 원시적인 방법이 아닌가 싶다. count 변수 활용을 잘하자!  
		
		/* 다른 풀이 1.
		 * int[] arr 배열 생성한 후 상황
		 * >> 
		 * 
		 * int count = 0;
		 * int max = 0;
		 * int index = 0;
		 * 
		 *  for(int value : arr) { <<arr 안에서 int 를 하나씩 거내서 비교할거다.
		 *  	count;; << 비교하는동안 카운트를 하나씩 증가시킴
		 *  	
		 *  	for(value > max) { << int값이 max 보다 크다면
		 *  			max = value; 
		 *  			index = count; << 혹은 count를 없애고 index = i + 1 로 해 줘도 된다.
		 *  	}
		 *  }
		 *  System. out.prntln(max + "\n" +index)
		 *  
		 *  
		 *  
		 *  
		 *  다른풀이 2.
		 *  Buffered Reader vr = new BufferedReader(new InputStreamReader(System.in));
		 *  int max = 0;
		 *  int index = 0;
		 *  
		 *  
		 * for(int i = 0; i < 9; i++) {
		 * 		int val = Integer.parseInt(br.readLine());
		 * 		if(val > max) {
		 * 			max = val;
		 * 			index = i + 1;
		 * 		}
		 * }
		 * System. out.prntln(max + "\n" +index)
		 */
	
	
	
	
	
	
	
	
	}
	
	
	
	

}