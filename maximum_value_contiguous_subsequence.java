package dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class maximum_value_contiguous_subsequence {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
		{
			String[] string1 = br.readLine().split("\\s");
			int input[] = new int[string1.length+1];
			for(int i =0; i < string1.length;i++ ){
				input[i] = Integer.parseInt(string1[i]); 
			}
			mcs(input);
			mcs1(input);
			mcs2(input);
		}
	}
	// complexity O(n3)
	public static void mcs(int input[]){
		int maxSum =0;
		
		for(int i =0; i <input.length;i++){
			for(int j =i; j < input.length;j++){
				int currentSum=0;
				for(int k =i ; k <= j; k++){
					currentSum += input[k]; 
				}
				if(currentSum > maxSum){
					maxSum = currentSum;
				}
			}
		}
		System.out.println("Maximum Sum :" +maxSum );
	}
	// complexity O(n2)
		public static void mcs1(int input[]){
			int maxSum =0;
			
			for(int i =0; i <input.length;i++){
				int currentSum=0;
				for(int j =i; j < input.length;j++){
						currentSum += input[j]; 
					
					if(currentSum > maxSum){
						maxSum = currentSum;
					}
				}
			}
			System.out.println("Maximum Sum :" +maxSum );
	}
		
		// complexity O(n)
	public static void mcs2(int input[]){
		int maxSum =input[0];
		int sum =0;			
		for(int i =0; i <input.length;i++){
			sum = Math.max(sum + input[i], input[i]);
			maxSum = Math.max(sum , maxSum);
		}
		System.out.println("Maximum Sum :" +maxSum );
	}

}
