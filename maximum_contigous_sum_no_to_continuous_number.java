package dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class maximum_contigous_sum_no_to_continuous_number {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
		{
			String[] string1 = br.readLine().split("\\s");
			int input[] = new int[string1.length+1];
			for(int i =0; i < string1.length;i++ ){
				input[i] = Integer.parseInt(string1[i]); 
			}
			maximum_no2_continuous_sum(input);
		}
	}
	
	public static void maximum_no2_continuous_sum(int input[]){
		
	}

}
