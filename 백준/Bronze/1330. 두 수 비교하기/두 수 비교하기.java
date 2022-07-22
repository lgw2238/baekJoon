import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
		double A = in.nextInt();
		double B = in.nextInt();
        
		in.close();
        if(A > B){
            System.out.println(">");
        }else if(A < B){
            System.out.println("<");
        }else if(A == B){
            System.out.println("==");
        }

	}
}