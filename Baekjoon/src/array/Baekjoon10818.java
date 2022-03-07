package array;
import java.util.Scanner;

public class Baekjoon10818 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n] ;
		
		for(int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int max = arr[0];
		int min = arr[0];
		
		for ( int e : arr ) {
			max = Math.max(max, e);
			min = Math.min(min, e);
		}
		System.out.printf("%d %d", min, max);
		
	}

}
