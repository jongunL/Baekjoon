package string;

import java.util.Scanner;
import java.io.*;

public class Baekjoon11720 {

	public static void main(String[] args) {
		/*
		 	N개의 숫자가 공백없이 쓰여있다.
		 	이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
		 	
		 	첫째 줄 : 숫자의 개수
		 	둘째 줄 : 숫자 N개
		 */
		
		//ScannerEx01();
		BufferedReaderEx02();
		
	}
	public static void ScannerEx01() {
		Scanner sc = new Scanner(System.in);
		int place = sc.nextInt();
		String number = sc.next();
		
		int result = 0;
		
		for(int i=0; i<place; i++) {
			result += number.charAt(i) - '0';
		}
		
		System.out.println(result);
	}
	
	public static void BufferedReaderEx02() {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {

			int sum = 0;
			
			for(byte value : br.readLine().getBytes()) {
				sum += (value - '0');
			}
			
			System.out.println(sum);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
