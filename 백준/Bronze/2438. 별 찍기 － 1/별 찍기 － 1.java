import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
        /* 스캐너 선언 */
		Scanner in = new Scanner(System.in);
     
		int N = in.nextInt();
		in.close();
 
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}