package function;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjjon1065 {

	public static void main(String[] args) {
		/*
		한수
		어떤 양의 정수 x의 각 자리가 등차수열을 이룬다면 그 수를 한수라한다.
		
		등차수열
		1	2	3
		  1   1
		 */
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int result = sequenceCount(input);
		System.out.println(result);
		sc.close();


	}
	public static int sequenceCount(int num) {
		int cnt = 0;
		
		if(num < 100) {
			return num;
		} else {
			cnt = 99;
			if(num == 1000) num = 999;
			
			for(int i=100; i<=num; i++) {
				int hun = i/100;
				int ten = (i/10)%10;
				int one = i%10;				
				if((hun-ten)==(ten-one)) cnt++;
			}
 
			
		}
		
		return cnt;
	}

}
