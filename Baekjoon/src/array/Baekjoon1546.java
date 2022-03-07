package array;
import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon1546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] array = new double[sc.nextInt()];
		
		for(int i=0; i<array.length; i++) {
			array[i] = sc.nextInt();
		} sc.close();
		
		double sum = 0;
		Arrays.sort(array);
		
		for(int i=0; i<array.length; i++) {
			sum += ( array[i] / array[array.length-1] ) * 100; 
		}
		
		System.out.println(sum/array.length);
		
	}
}