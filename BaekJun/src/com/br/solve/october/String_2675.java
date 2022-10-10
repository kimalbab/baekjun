package com.br.solve.october;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String_2675 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String[] splitArr =  s.split(" ");
		int re = Integer.parseInt(splitArr[0]);
	
		if(re==0 || !s.contains(" ")) {
			System.out.print("");
		} else {
			String realString = splitArr[1]; 
			String [] sArr = new String[realString.length()];
			for(int i=0; i<realString.length(); i++) {
				sArr[i] = Character.toString(realString.charAt(i));
				for(int k=0; k<re; k++) {
					System.out.print(sArr[i]);
				}
			}
		}
	}

}
