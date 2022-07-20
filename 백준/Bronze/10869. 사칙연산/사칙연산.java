import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
		int A = in.nextInt();
		int B = in.nextInt();
        
        int answerPlus = A+B;
        int answerMinus = A-B;
        int answerMulti = A*B;
        int answerDivide = A/B;
        int answerRest = A%B;
    System.out.println(answerPlus);
    System.out.println(answerMinus);
    System.out.println(answerMulti);
    System.out.println(answerDivide);
    System.out.println(answerRest);
    
    }
}