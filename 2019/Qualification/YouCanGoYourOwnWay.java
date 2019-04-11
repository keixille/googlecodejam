import java.util.*;
import java.io.*;
	
public class YouCanGoYourOwnWay {
	public static void main(String args[]) throws FileNotFoundException {
		Scanner in = new Scanner(new File("./input.txt"));
//		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));	
		
		int T;
		int N;
		String P;
		
		T = in.nextInt();
		for(int testCase=1; testCase<=T; testCase++) {
			N = in.nextInt();
			P = in.next();
			
			System.out.print("Case #" + testCase + ": ");
			for(int i=0; i<(2*N - 2); i++) {
				if(P.charAt(i) == 'E') System.out.print('S');
				else System.out.print('E');
			}
			System.out.println();
		}
		
		in.close();
	}
}
