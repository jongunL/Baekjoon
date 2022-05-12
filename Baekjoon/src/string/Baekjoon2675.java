package string;

import java.io.*;


public class Baekjoon2675 {

	public static void main(String[] args) throws Exception {
		/*
		 1. 문자열 S를 입력받음
		 2. 각 문자를 R번 반복해 새 문자열 P를 만들고 출력  
		 */
		useReader();
		
	}
	
	public static void useReader() throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i=0; i<t; i++) {
			String[] temp = br.readLine().split(" ");
			int r = Integer.parseInt(temp[0]);
			String s = temp[1];
			
			for(int j=0; j<s.length(); j++) {
				for(int k = 0; k<r; k++) {
					System.out.print(s.charAt(j));
				}//for
			}//for
			System.out.println();
		}//for
	}//useReader
	
	public static void useBuilder() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i=0; i<t; i++) {
			String[] str = br.readLine().split(" ");
			int r = Integer.parseInt(str[0]);
			
			for(byte val : str[1].getBytes()) {
				for(int j=0; j<r; j++) {
					sb.append((char)val);
				}
			}
			sb.append('\n');
		}
		System.out.println(sb);
	}

}
