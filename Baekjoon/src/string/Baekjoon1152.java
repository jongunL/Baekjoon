package string;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Baekjoon1152 {

	public static void main(String[] args) {
		//처음에 split으로 풀어봤는데, " " 공백 입력시 "" 빈문자열 입력되어 단어가 없음에도 length가 측정됐음
		//조건으로 "" 문자열은 뺀 길이를 출력해도 되나, 굳이 그럴필요없이 Tokenizer를 사용했다.
		Scanner sc = new Scanner(System.in);

		String line = sc.nextLine();
		sc.close();
		
		StringTokenizer st = new StringTokenizer(line, " ");
		System.out.println(st.countTokens());
	}

}
