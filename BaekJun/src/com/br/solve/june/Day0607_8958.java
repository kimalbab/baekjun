package com.br.solve.june;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Day0607_8958 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String [] arr = new String [sc.nextInt()];
		
		//입력받은 것 중에 0가 나오면 1씩 더해준다
		//1 1+1 0 0 1 0 0 1 1+1 1+1+1
		//어떨때만 count 해서 sum 하면 되나? O 일 때만
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.next();
		} //배열에 일단 담았음
		
		
		
		for(int i = 0; i < arr.length; i++) {
			
			
			int count = 0;
			int sum = 0;
			
			for(int j = 0; j < arr[i].length(); j++) {
				if(arr[i].charAt(j) == 'O') {
					count ++;
				} else {
					count = 0;
				} sum += count;
			}
			
			System.out.println(sum);
		}
		// ---------------------------------------------------------------//
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		try {
			int test = Integer.parseInt(br.readLine());
			
			for(int i = 0; i < test; i++) {
				
				int count = 0;
				int sumsum =  0;
				
				// getBytes 는 입력받은 문자열ㅊ을 byte 형 배열로 반환한다.
				for(byte value : br.readLine().getBytes()) {
					
					//for each 문으로 한 줄씩 받아서 해당 문자열의 길이만큼 반복하면서
					//문자를 하나씩 value 에서 저장해 꺼내온다.
					if ( value == 'O' ) {
						count ++;
						sumsum += count;
					} else {
						count = 0;
					}
				}
				
				
			}
			
			
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
