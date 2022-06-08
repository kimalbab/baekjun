package com.br.solve.june;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Day0607_2577 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int multi = sc.nextInt() * sc.nextInt() * sc.nextInt();
		
		
		
		String str = Integer.toString(multi);
		
		

		for(int i = 0; i < 10; i++) {
			int count = 0;
			for(int j =0; j < str.length(); j++) {
				if((str.charAt(j) - '0') == i) {
					count ++;
				}
					//j 가 증가하는 동안에도 i는 그대로 값을 지키고 있음
					/* 0 부터 생각해보면
					 * i = 0 일 때 j는 1,2,3,4,5,6,7,8,9번까지 반복하면서 문자를 세게 됨
					 * -'0' 을 해 준 건 0번일때 0이 나왔을 때 0-0 = 0을 만들어주기 위해서~
					 */
			}
			System.out.println(count);
				} // 시간복잡도가 높은코드
		
		
		//---------------------------------------------------------------------------//
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[10];
		
		try {
			int value = Integer.parseInt(br.readLine()) *  Integer.parseInt(br.readLine()) *  Integer.parseInt(br.readLine());
			
			String s = String.valueOf(value); //value를 string으로 변환
			
			for(int i = 0; i < s.length(); i++) {
				arr[(str.charAt(i) - 48)] ++ ; //if((str.charAt(j) - '0') == i)과 같음 48은 아스키코드 0
			}
			
			for(int v : arr) {
				System.out.println(v);
			}
			
			
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//---------------------------------------------------------------------------//
		
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int val = Integer.parseInt(br.readLine()) *  Integer.parseInt(br.readLine()) *  Integer.parseInt(br.readLine());
			int [] arr2 = new int[10];
			// 이건 지금 텅 빈 배열이라 00000000000 상태임
			
			while(val > 0) {
				arr2[val % 10]++; // => 배열 arr[0] 의 값이 1이된다. arr[0] = 1
				//val = val / 10;
				val /= 10;
				// 나머지는 필요없으니 떼준다.
				// 다시 반복할때에 각 자리수에 해당하는 arr[i]의 값이 1개씩 증가된다.
			}
			
			for(int result : arr) {
				System.out.println(result);
			}
			
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
		
	}
	
}


