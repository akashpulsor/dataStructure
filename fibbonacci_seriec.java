package dynamicProgramming;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class fibbonacci_seriec {
	
		public static void main(String[] args) throws Exception {	
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
	     {
			int input = Integer.parseInt(br.readLine());
			fib2(input);
	     }
	}
	
	
	public static void fib2(int n){
		BigInteger a = new BigInteger("0");
		BigInteger b =new BigInteger("1");;
		BigInteger  sum = new BigInteger("0");
		for(int i =0; i < n+1;i++){
			sum = a.add(b);
			a =b;
			b = sum;
		}
		System.out.println(sum + " ");
	}
}
