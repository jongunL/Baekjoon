package repeat;
import java.util.Scanner;

public class Baekjoon10950_Scanner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); //테스트 케이스 수행횟수
		int[] sum = new int[N]; // A+B의 값을 저장할 배열
		
		for(int i=0; i<N; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			sum[i] = a+b;
		} sc.close();
		
		for(int e : sum) {
			System.out.println(e);
		}

	}

}
