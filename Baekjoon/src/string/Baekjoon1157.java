package string;

import java.util.Scanner;

public class Baekjoon1157 {

	public static void main(String[] args) {
		//알파벳 대소문자로 된 단어 -> 단어에서 가장 많이 사용된 알파벳 찾기
		//대소문자 구분 X, 가장 많이 사용된 알파벳이 여러개일 경우 ?를 출력
		
		int[] usedAlphabet = new int[26]; 
		
		Scanner sc = new Scanner(System.in);
		String input = sc.next().toLowerCase();
		
		for(int i=0; i<input.length(); i++) {
			usedAlphabet[input.charAt(i)-'a']++; 
		}
		
		int max = -1;
		char ch = '?';
		
		for(int i=0; i<26; i++) {
			if(usedAlphabet[i] > max) {
				max = usedAlphabet[i];
				ch = (char)(i+65);
			} else if(usedAlphabet[i]==max) {
				ch = '?';
			}
		}
		System.out.println(ch);
	}

}
