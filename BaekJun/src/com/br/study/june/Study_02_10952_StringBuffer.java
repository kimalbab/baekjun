package com.br.study.june;

public class Study_02_10952_StringBuffer {

	public static void main(String[] args) {
		
		/*
		 * StringBuffer는 Builder와 유사함 String
		 * - 배열은 값을 수정할 때 카피하고 재정렬해야 함
		 * 		=> StringBuffer는 있는 그대로에서 값을 삭제할 수 있음
		 * - String은 문자열로 값을 넣고 뺄 수 없음
		 * 		=> StringBuffer는 문자 배열로 값을 넣고 뺄 수 있음
		 * - StringBuffer는 equals가 동기화가 되지 않아 주소값만 비교함
		 * 		=> 내용이 같아도 false => String으로 형변환 후 비교해야함
		 */
		
		StringBuffer sb = new StringBuffer("01");
		StringBuffer sb2 = sb.append(23);
		sb.append('4').append(56);
		
		StringBuffer sb3 = sb.append(78);
		sb3.append(9.0);
		
		System.out.println("sb : " + sb.deleteCharAt(10));
		System.out.println("sb : " + sb.delete(3, 6));
		System.out.println("sb : " + sb.insert(3, "abc"));
		System.out.println("sb : " + sb.replace(6, sb.length(), "end"));
		
		System.out.println("capacity : " + sb.capacity());
		System.out.println("length : " + sb.length());
		
	}
	}
