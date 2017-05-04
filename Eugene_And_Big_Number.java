package algoPractice;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Eugene_And_Big_Number {
	public static void main(String args[]) throws Exception
	{
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
		{
			int  T = Integer.parseInt(br.readLine());
			for(int i = 1;i < T ;i++ ){
				String [] line = br.readLine().split("\\s");
				int  A = Integer.parseInt(line[0]);
				int  N = Integer.parseInt(line[1]);
				int  M = Integer.parseInt(line[2]);
				int cnt = number(A);
				int s = 0 ;
				for(int j=1;j<N;j++){
					int num =  (int) Math.pow(10,cnt);
					A = A * num + A;
					cnt = number(A);
				}
				
				int result = A % M;
				System.out.println(result);
			}
		}
	}
	 public static int number(int  A){
		 int cnt =0;
		 while(A !=0){
			 A = A / 10;
			 cnt++;
			 			 
		 }
		 
		 return cnt;
	 }

}
