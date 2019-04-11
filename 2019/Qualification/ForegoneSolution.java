import java.util.*;
import java.io.*;
	
public class ForegoneSolution {
	public static void main(String args[]) throws FileNotFoundException {
		Scanner in = new Scanner(new File("./input.txt"));
//		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));	
		
		int T;
		String N;
		String A, B;
		
		T = in.nextInt();
		for(int testCase=1; testCase<=T; testCase++) {
			N = in.next();
			A = "";
			B = "";
			
			for(int i=0; i<N.length(); i++) {
				if(N.charAt(i) == '4') {
					A += N.charAt(i) - '0' - 1;
					B += '1';
				} else {
					A += N.charAt(i);
					if(B.length() > 0) B += '0';
				}
			}
			
			System.out.println("Case #" + testCase + ": " + A + " " + B);
		}
		
		in.close();
	}
}
