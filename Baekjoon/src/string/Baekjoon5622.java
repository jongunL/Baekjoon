package string;

import java.util.Scanner;

public class Baekjoon5622 {

	public static void main(String[] args) {
		/*
		 전화 다이얼
		 
		  숫자 하나 누른 다음 금속 핀이 있는 곳 까지 시계방향으로 돌려야 한다.
		  수자를 하나 누르면 아이얼이 처음 위치로 돌아가고, 다음 수자를 누르려면 다이얼을 처음 위치에서 다시 돌려야한다.
		  
		  숫자 1을 걸려면 총 2초가 필요하고
		  한칸 옆에 있는 술자를 걸기 위해선 1초씩 더 걸린다.
		  
		  상근이 할머니는 전화 번호를 각 숫자에 해당하는 문자로 외운다.
		  각 알파벳에 해당하는 숫자를 걸면되는데, 할머니가 외운 단어가 주어졌을 때, 전화를 걸기 위해 필요한 최소 시간을 구해라.
		  
		  1				- 2초
		  2 = ABC			
		  3 = DEF			
		  4 = GHI			
		  5 = JKL			
		  6 = MNO			
		  7 = PQRS			
		  8 = TUV			
		  9 = WXYZ			
		  0 = OPERATOR
		  
		  ex)
		  UNUCIC = 868242
		  
		  입력단어는 2~15자리의 길이를 갖는다.
		  입력       출력
		  WA     =  13
		  UNUCIC =  36
		  
		 */
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine().toUpperCase();
		
		int count = 0;
		for(int i=0; i<word.length(); i++) {
			
			switch (word.charAt(i)) {
			case 'A': case 'B': case 'C':
				count += 3;
				break;
			case 'D': case 'E': case 'F':
				count += 4;
				break;
			case 'G': case 'H': case 'I':
				count += 5;
				break;
			case 'J': case 'K': case 'L':
				count += 6;
				break;
			case 'M': case 'N': case 'O':
				count += 7;
				break;
			case 'P': case 'Q': case 'R': case 'S':
				count += 8;
				break;
			case 'T': case 'U': case 'V':
				count += 9;
				break;
			case 'W': case 'X': case 'Y': case 'Z':
				count += 10;
				break;
			}//switch
		}//for
		System.out.println(count);
		

	}

}

































