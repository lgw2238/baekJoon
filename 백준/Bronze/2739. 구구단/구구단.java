import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);	
        /* 입력값 받을 변수(int) 선언 */
		int a = in.nextInt();		
		in.close();		
		
        /* 구구단 for문 */
		for(int i = 1; i<10;i++) {
			System.out.println(a+" * "+i+" = "+(a*i));
		}
	}
}