package com.br.solve.june;

import java.util.Scanner;

public class Day0607_8958 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String [] arr = new String [sc.nextInt()];
		
		// count 하는 변수가 필요하다
		// sum 도 필요하다. 더해줘야하니까.
		// 그런데 그 두 변수는 배열을 돌 때 마다 초기화 되어야 한다.
		// 첫번째 for문을 돌 때는 5행을 돌 것이다 => arr.length() 만큼
		// 두번째 for문을 돌 때는 각 행의 ox를 조회하면서 조건검사를 할거다.
		// 생각해보니까 와일문을 돌리면서 x 가 나오면 종료되도록 코드를 짜고 와일문이 돌아갈동안 count를 하나씩 증가시켜도 될듯?

	}

}
