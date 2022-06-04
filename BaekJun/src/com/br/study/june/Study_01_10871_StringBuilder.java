package com.br.study.june;

public class Study_01_10871_StringBuilder {
	
	
	/*
	 * StringBuilder 동기화는 불가능!
	 */
	public static void main(String [] args) {
		StringBuilder sb = new StringBuilder();
		
		//append => 추가 메소드
		sb.append("Java ");
		sb.append("Program Study");
		System.out.println(sb.toString());
		
		
		//insert => 삽입 메소드
		sb.insert(4, "2");
		System.out.println(sb.toString());
		
		sb.setCharAt(4, '6');
		System.out.println(sb.toString());
		
		
		
		//replace => 대체 메소드
		sb.replace(6, 13, "Book");
		System.out.println(sb.toString());
		
		//delete => 삭제 메소드
		sb.delete(4, 5);
		System.out.println(sb.toString());
		
		
		//length => 문자열의 길이를 알려주는 메소드
		int length = sb.length();
		System.out.println("�� ���� �� : " + length);
		
		System.out.println(sb.toString());
		
	}
}