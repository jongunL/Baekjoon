package string;

import java.io.*;
import java.util.*;

public class Baekjoon2908 {

	public static void main(String[] args) throws Exception {
		/*
		 상수는 숫자를 읽는데 문제가 있다.
		 세 자리수 두 개를 칠판에 쓰고 두 수를 비교 후 큰수를 찾는 문제를 내줬는데,
		 상수는 수를 다른 사람과 다르게 꺼꾸로 읽는다.
		 ex) 734 893을 칠판에 적었다면 437 398로 읽는다.
		 따라서 상수는 두 수중 437을 큰수라고 말한다.
		 
		 문제 
		 두 수가 주어졌을 때, 상수의 대답을 출력하는 프로그램을 작성하시오.
		 
		 입력
		 첫째 줄에 상근이가 칠판에 적은 두 수 A와 B가 주어진다. 두 수는 같지 않은 세 자리 수이며, 0이 포함되어 있지 않다.
		 
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer(br.readLine());
		StringTokenizer st = new StringTokenizer(sb.reverse().toString());
		
		//방법 A
		/*
		int[] compareNum = new int[2];
		int max = -1;
		int count = 0;
		
		while(st.countTokens() != 0) {
			compareNum[count++] = Integer.parseInt(st.nextToken());
		}

		for(int num : compareNum) {
			if(max < num) max = num;
		}
		
		System.out.println(max);
		*/
		
		//방법 B
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		System.out.println(A > B ? A : B);
		
		
	}

}
