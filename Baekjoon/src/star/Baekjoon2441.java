package star;
import java.util.Scanner;

public class Baekjoon2441 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		for(int i=0; i<n; i++) {
			
			for(int k=0; k<i; k++) {
				System.out.printf(" ");
			}
			
			for(int j=n-i; j>0; j--) {
				System.out.printf("*");
			}
			System.out.println();
		}
	}

}
