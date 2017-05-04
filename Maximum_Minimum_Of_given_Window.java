package algoPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Maximum_Minimum_Of_given_Window {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			String [] input1 = br.readLine().split("\\s+");
			int windowSize = Integer.parseInt(br.readLine());
			int tempWindowSize = 1;
			Stack<Integer> stack = new Stack<Integer>();
			for(int i =0; i< input1.length;i++){
				if(tempWindowSize==windowSize-1){
					
				}
				else{
					stack.push(Integer.parseInt(input1[i]));
				}
			}
		}
	}
	
	
	
	
	

}
