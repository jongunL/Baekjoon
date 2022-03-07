package repeat;
import java.util.Scanner;

public class Baekjoon2562 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dan = sc.nextInt();
		sc.close();
		
		for(int i=dan; i<=dan; i++) {
			for(int j=1; j<10; j++) {
				System.out.printf("%d * %d = %d\n",i, j, i*j);
			}
		}

	}

}
