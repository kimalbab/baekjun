package com.br.solve.june.array;

import java.util.Scanner;

public class Day0608_4344 {

	public static void main(String[] args) {
		
		// 처음 입력되는 수는 배열의 크기가 된다, 그리고 곧 1차반복하게 될 횟수
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		// 줄마다 배열을 만들어야 하지 않나, 그래야 그 배열 내에서 반복을 돌리면서 평균을 구할 수 있지..?
		// 맨 앞에는 또 배열을 돌릴만한 수가 들어오네. 진짜 3중 배열인가?
		for(int i = 0; i < a; i++) {
			// 일단 맨 처음 입력된 a 번만큼 반복하게 코드를 만들어둠
			
			//그리고 두번째로 오는 수는 일단 배열의 길이.
			int b = sc.nextInt();
			int [] arr1 = new int [b];
			for(int j=0; j < arr1.length; j++) {
				arr1[j] = sc.nextInt();
			}
			// 여기까지 하면 일단 첫번째줄은 배열이 담긴 상태임
			// 그럼 이제 첫번째 줄의 평균을 구해보자.
			int sum = 0;
			for(int j = 0; j <arr1.length; j++) {
				sum += arr1[j];
			}
			// 여기까지 하면 각 배열의 합이 담김..?
			// 그럼 이제 평균을 구하자.
			double avg = sum / b;
			// System.out.printf("%.3f\n", avg);
			// 내가 구해야 하는 건 평균을 넘는 학생의 비율.
			// 그럼 다시 또 비교하기를 arr[j] 가 평균보다 크면 count++ 해서
			// 나중에 각 배열의 길이 (학생 수) b에서 count 되는 수를 나누면 된다..
			int count = 0;
			for(int j=0; j < arr1.length; j++) {
				if(arr1[j] > avg) {
					count ++;
				} //if 문이 끝나고 바로 for문이 종료
			}
			
			// 카운트도 제대로 되고 있는 것 같은데...
			//System.out.println(count);
			double c = (double)count / (double)b * 100;
			System.out.printf("%.3f%%\n", c);
			// 마지막에 틀렸던 이유는 단연 %% 때문으로, printf 문 쓸 때 %를 출력하고 싶으면 %%로 써야한다!
		
		}

	}

}
