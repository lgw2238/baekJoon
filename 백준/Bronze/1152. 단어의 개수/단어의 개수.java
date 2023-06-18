import java.util.Scanner;
import java.util.StringTokenizer;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
 
		String inLine = in.nextLine();
		in.close();
 
		// inLine 에 공백을 기준으로 나눈 토큰들을 StringToken 에 저장한다
		StringTokenizer StringToken = new StringTokenizer(inLine," ");
		
		// countTokens() 는 토큰의 개수를 반환한다
		System.out.println(StringToken.countTokens());	
		
	}
 
}