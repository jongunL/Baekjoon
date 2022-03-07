package star;
import java.util.Scanner;

public class Baekjoon2439 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		for(int i=n; i>0; i--) {
			for(int j=1; j<=n; j++) {
				if(i<=j) {
					System.out.print('*');
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
			

	}

}
