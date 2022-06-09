package com.br.solve.june.string;

import java.util.Scanner;

public class Day0609_10809 {

	public static void main(String[] args) {
		//일단 첫번째 반복의 경우는 알파벳 갯수만큼? 검색해야한다..
		//예를 들어 첫글자인 b가 알파벳 어디에 있는지 알파벳마다 돌면서 검색해야함
		//만약 b가 있다면 출력한다 : b가 몇번째 알파벳인지....
		
		//아니 뒤집어 생각해야하나
		//알파벳을 1차 for문으로 돌리는데 2차 for문으로 영문의 charAti가 같으면
		//count를 해 준다..?, 그게 아니면 count = -1
		
		//먼저 알파벳 배열.. 소문자 알파벳 배열을 문자화시켜서 배열을 만들어야한다.
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		char[] arr = new char[26];
		
		for(int i = 97; i < 123; i++) {
			arr[i-97] = (char) i;
		}
		
		for(int i = 0; i < s.length(); i++) {
			int count = -1;
			for(int j = 0; j < arr.length; j++) {
				if(s.charAt(j) == arr[i]) {
					count ++;
				}
			}
		}
	}

}
