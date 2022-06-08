package com.br.solve.june;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Day0607_1546 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		double[] arr = new double[sc.nextInt()];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextDouble();
		}
		
		double sum = 0;
		Arrays.sort(arr);
		
		for(int i = 0; i < arr.length; i++) {
			sum = sum + ((arr[i] / arr[arr.length-1]) * 100);
			// 0 회전시 : arr[0] (최소값) / arr[3-1] (최대값) * 100 이라는 문제에서 제시한 식이 나온다.
			// 			그 값에 현재 sum 인 0값을 더해줌 == 새로운 최소값
			// 1 회전시 : arr[1] (2번째값) / arr[3-1] (최대값) * 100 이라는 문제에서 제시한 식이 나온다.
			// 			새로운 최소값만 있던 sum에 변형된 arr[1](2번째 값)도 더해줌
			// 2 회전시 : arr[2] (3번째값 == 최대값) / arr[3-1] (최대값 => 최대값 / 최대값은 걍 1) * 100 == 100점
			// 			새로운 최소값만 있던 sum에 변형된 arr[2](3번째 값)도 더해줌
		}
		
		System.out.println(sum / arr.length);
		
		
		// -------------------------------------------------------------------------------------- //
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			// 나눌 수 셋팅
			int n = Integer.parseInt(br.readLine());
			
			//토크나이저로 미리 점수들 " "로 나눠가며 저장
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			int max = -1;
			double sumsum = 0.0;
			
			for(int i = 0; i < n; i ++) {
				// 토크나이저에 있는 값은 string 이므로 반복하면서 하나씩 int로 변환
				int value = Integer.parseInt(st.nextToken());
				
				// 만약 int로 변환된 점수값인 value가 max 보다 크다면
				if (value > max) {
					// 최대값 = 현재 점수값이 된다.
					max = value;
					// 또 다시 배열이 돌 때 최대값이 바뀌게 됨.
				} // value가 max보다 작으면 그냥 빠져나옴
				
				sum += value;
				//for 문 안에 있는 합계 구하는 식으로 
			}
			
			System.out.println(((sum / max) * 100) / n);
			
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
