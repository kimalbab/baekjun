package com.br.solve.june.method;

import java.util.Scanner;

public class Day0621_10809 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		/*
		 * 배열을 돌릴 때
		 * a가 2번째에 있고 b가 첫번째에 있다는 걸 알려주고..
		 * c는 없으면 -1..
		 * 그럼 첫번째 for문에서 a라는 문자가 baekjoon의 어디에 들어가있는지 판단해야 함
		 * 그럼 for문은 baekjoon의 길이인 8번만큼 돌려?
		 * 아니지..
		 * 왜냐면 실제로 출력되어야 하는 건 27개의 알파벳이니까
		 * 첫번째 for문은 27번 돌긴 해야한다
		 * 처음부터 소문자라고 하는 거 보면 아스키코드를 이용하는건지?
		 * 그냥 이퀄스 메소드 이용해도 되지 않나 싶은데
		 * 
		 * 여튼 첫번째 for 문 돌릴때..
		 * 만약 두번째 for문을 돌릴 때 즉 백준의 배열과 비교할 때 같다면.. 이런식으로 해야하네
		 * 아니 그러고보니까 음... 알파벳을 배열에 하나하나 넣을수가 없으니
		 * 아스키코드를 쓰긴 해야하는 거 아닌가
		 * 
		 */
		
		for(int i=97; i<=122; i++) {
			
			for(int j=0; j<str.length(); j++) {
				if(i == (int)(str.charAt(j))) {
					System.out.print(j + " ");
				} else {
					System.out.print(-1+ " ");
				}
			}
		}

	}

}
