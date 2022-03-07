package array;
import java.util.Scanner;

public class Baekjoon2562 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[9];
		int max = 0;
		int num = 0;
		int count = 0;
		for(int i=0; i<array.length; i++) {
			array[i] = sc.nextInt();
		}
		sc.close();
		
		for(int e : array) {
			max = Math.max(max, e);
			count++;
			if(max == e) {
				num = count;
			}
		}
		System.out.println(max);
		System.out.println(num);
	}
	
}
