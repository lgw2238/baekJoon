import java.util.Scanner;

public class Main  {
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int sum = 0;
		int parameter = sc.nextInt();		
         for(int i = 1; i <= parameter; i++){
             sum = sum + i;     
         }
		System.out.println(sum);

	}

}