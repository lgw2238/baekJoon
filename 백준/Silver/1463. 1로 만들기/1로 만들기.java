import java.io.*;

public class Main {
	
	public static void main(String[] args) throws  IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		System.out.println(bottomUp(n));
	}
	
    /* % method */
	static int bottomUp(int num) {
		int[] dp = new int[num+1];
		
		for(int i=2; i<num+1; i++) {
			dp[i] = dp[i-1]+1; // -1 
			if(i%2==0) {
				dp[i] = Math.min(dp[i], dp[i/2]+1);
			}
			if(i%3==0) {
				dp[i] = Math.min(dp[i], dp[i/3]+1);
			}
		}
		return dp[num];
	}
}