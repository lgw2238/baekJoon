import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
		double A = in.nextInt();
		double B = in.nextInt();
        double C = A/B;
		in.close();
        System.out.println(C);
	}
}