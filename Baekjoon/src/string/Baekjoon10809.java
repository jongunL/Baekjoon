package string;

import java.util.Scanner;

public class Baekjoon10809 {

	public static void main(String[] args) {
		
		//소문자로 이루어진 단어 S가 주어진다.
		//알파벳 a~z가 처음 등장하는 위치를 공백으로 구분해서 출력
		Scanner sc = new Scanner(System.in);
		
		String line = sc.nextLine();
		useArray(line);
		useCast(line);
	}//main
	
	public static void useArray(String line) {
		
		int[]arr = new int[26];
		for(int i=0; i<arr.length; i++) {
			arr[i] = -1;
		}
		for(int i=0; i<line.length(); i++) {
			char ch = line.charAt(i);
			if(arr[ch - 'a'] == -1)
				arr[ch - 'a'] = i;
		}
		for(int val : arr) {
			System.out.print(val + " ");
		}
		System.out.println();
	}
	public static void useCast(String line) {
		for(int i=0; i<=25; i++) {
			if(i!=0) System.out.print(" ");
			char temp = (char)('a' + i);
			System.out.print(line.indexOf(temp));
		}
		System.out.println();
	}

}
