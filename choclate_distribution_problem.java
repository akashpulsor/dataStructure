package algoPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class choclate_distribution_problem {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
	     {
			String [] inputLine = br.readLine().split("\\s");
			int windowSize = Integer.parseInt(br.readLine());
			int [] input = new int[inputLine.length];
			for(int i =0; i < inputLine.length;i++){
				input[i]= Integer.parseInt(inputLine[i]);
			}
			choclate(input,windowSize);
	     }
	}
	
	public static void choclate(int [] inputLine,int windowSize){
		
		if(windowSize >  inputLine.length){
			return;
		}
		if(windowSize ==0 || inputLine.length ==0){
			return;
		}
		Arrays.sort(inputLine);
		int minDiff = Integer.MAX_VALUE;
		for(int i =0; i + windowSize -1 < inputLine.length; i++ ){
		 int diff =inputLine[i+windowSize-1] - inputLine[i];
		 if(diff < minDiff){
			 minDiff =  diff;
		 }
		}
		System.out.println(minDiff);
	
	}

}
