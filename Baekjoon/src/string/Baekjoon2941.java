package string;

import java.util.Scanner;

public class Baekjoon2941 {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		/*
		 크로아티아 알파벳
		 
		 예전 운영체제에서는 크로아티아 알파벳을 입력할  수가 없어서 다음과 같이 크로아티아 알파벳을 변경해서 입력했다.
		 
		 크로아티아 알파벳	변경
					č	c=
					ć	c-
					dž	dz=
					đ	d-
					lj	lj
					nj	nj
					š	s=
					ž	z=
		
		  예를들어 ljes=njak은 크로아티아 알파벳 6개(lj, e, š, nj, a, k)로 이루어져 있다.
		  단어가 주어졌을 때, 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.
		  
		  dž, li, nj는 한 글자씩 센다.
		  */
		//extracted1();
		extracted2();
		

		
	}
	//다른 사람이 푼 방법 -> 어떻게 이런 생각을 할 수 있을까 대단하다
	private static void extracted2() {
		String str = sc.nextLine();
		int count = 0;
		
		for(int i=0; i<str.length(); i++) {
			
			char ch = str.charAt(i);
			
			if(ch == 'c') {		//만약 ch가 c 인경우
				if(i < str.length() - 1) {
					if(str.charAt(i+1) == '=') {	//c 다음문자가 = 면 č 문자가 된다.
						//i+1까지가 하나의 문자이므로 다음 문자를 건너 뛰기 위해 1을 증가시킨다
						i++;
					}
					else if(str.charAt(i+1) == '-') {
						i++;
					}
				}
			}//č, ć 구하는법
			
			else if(ch == 'd') {
				if(i < str.length() - 1) {
					if(str.charAt(i+1)=='z') {
						if(i < str.length() - 2) {
							if(str.charAt(i+2)=='=') {		//dz= 일경우 dž
								i += 2;
							}//dž 구하는법			
						}
					}
					else if(str.charAt(i+1)=='-') {		//d- 일경우 đ
						i++;
					}//đ 구하는법				
				}
			}//dž, đ 구하는법
			else if(str.charAt(i) == 'l') {
				if(i < str.length() - 1) {
					if(str.charAt(i+1) == 'j') {
						i++;
					}			
				}
			}
			else if(str.charAt(i) == 'n') {
				if(i < str.length() - 1) {	
					if(str.charAt(i+1) == 'j') {
						i++;
					}
				}
			}
			else if(str.charAt(i) == 's') {
				if(i < str.length() - 1) {
					if(str.charAt(i+1) == '=') {
						i++;
					}			
				}
			}
			else if(str.charAt(i) == 'z') {
				if(i < str.length() - 1) {
					if(str.charAt(i+1) == '=') {
						i++;
					}		
				}
			}
			
			count++;
			
		}//for
		
		System.out.println(count);
		
	}

	//내가 푼 방법
	private static void extracted1() {
		String[] croatianAlphabet = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		String input = sc.nextLine();
		
		for(int i=0; i<croatianAlphabet.length; i++) {
			input = input.replace(croatianAlphabet[i], "0");
		}
		System.out.println(input.length());
	}

}















































