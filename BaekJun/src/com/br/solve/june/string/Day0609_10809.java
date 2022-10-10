package com.br.solve.june.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Day0609_10809 {

	public static void main(String[] args) throws IOException {
		//일단 첫번째 반복의 경우는 알파벳 갯수만큼? 검색해야한다..
		//예를 들어 첫글자인 b가 알파벳 어디에 있는지 알파벳마다 돌면서 검색해야함
		//만약 b가 있다면 출력한다 : b가 몇번째 알파벳인지....
		
		//아니 뒤집어 생각해야하나
		//알파벳을 1차 for문으로 돌리는데 2차 for문으로 영문의 charAti가 같으면
		//count를 해 준다..?, 그게 아니면 count = -1
		
		//먼저 알파벳 배열.. 소문자 알파벳 배열을 문자화시켜서 배열을 만들어야한다.
		//Scanner sc = new Scanner(System.in);
		//String s = sc.nextLine();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String[] sArr = new String[s.length()];
		String[] arr = new String[26];
		
		for(int i = 0; i < s.length(); i++) {
			sArr[i] = Character.toString(s.charAt(i));
		}
		
		// arr에 알파벳 배열을 담기
		for(int i = 97; i < 123; i++) {
			arr[i-97] = String.valueOf((char) i);
		}
		
		int[] intArr = new int[26];
		
		for(int i = 0; i < 26; i++) {
			intArr[i] = -1;
		}
		
		// 일단 알파벳들은 출력되어야 함
		for(int i = 0; i < 26; i++) {
		// 알파벳 하나마다 반복문을 돌려서 그 알파벳이 있는지 조건검사 해야함
		for(int j=0; j<sArr.length; j++) {
				if(intArr[i] == -1) {
					if(arr[i].equals(sArr[j])) {
						while(sArr[j].equals(arr[i])) {
							//System.out.println("sArr[" + j + "] : " + sArr[j] + "  arr[" + i + "] : " + arr[i] + "   intArr[" + i + " ] : " + intArr[i] +  " i : " + i + "   j : " + j);
							intArr[i] = j;
							//System.out.println("확 : " + intArr[i]);
							break;
						}
						
					}
				}
			}
		}
		
		for(int l=0; l<26; l++) {
			System.out.print(intArr[l] + " ");
		}
		
		}
	}


	
			
			

