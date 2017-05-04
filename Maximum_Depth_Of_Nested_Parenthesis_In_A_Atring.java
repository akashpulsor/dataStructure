package algoPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/*
 * Solution 1
 * Time Complexity O(N)
 * Auxillary space O(N)
 * 
 * Solution 2
 * Time Complexity O(N)
 * Auxillary space O(1)
 *    
 * 
 * */

public class Maximum_Depth_Of_Nested_Parenthesis_In_A_Atring {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
	     {
			String [] inpuLine = br.readLine().split("\\s");
			int out1 = stackImplementation(inpuLine);
			System.out.println(out1);
			int out2 = nonStackImplementation(inpuLine);
			System.out.println(out2);
	     }

	}
	
	public static int stackImplementation(String [] Input){
		Stack<String> stk = new Stack<String>();
		int currentDepth = 0;
		int maximumDepth = 0;
		Boolean popFlag= false;
		Boolean betweenFlag = false;
		for(int i =0 ; i < Input.length -1 ;i++){
			if(Input[i].equals("(")){
				stk.push(Input[i]);
				if(popFlag==true){
					popFlag=false;
					currentDepth=0;
				}
			}
			else if(Input[i].equals(")")){
				if(stk.isEmpty()){
					stk.push(")");
				}
				else{
					stk.pop();
					currentDepth++;
					popFlag=true;
				}
				
			}
			if(popFlag==true){
				if(currentDepth > maximumDepth){
					maximumDepth = currentDepth;
				}
			}
		}
		
		if(Input[Input.length -1].equals(")") && stk.pop().equals("(")){
			maximumDepth = maximumDepth+1;
		}
		if(!stk.isEmpty()){
			return -1;
		}
		return maximumDepth;
	}
	
	public static int nonStackImplementation(String [] Input){
		
		int currentMax = 0;
		int max = 0;
		for(int i =0; i < Input.length; i++){
			if(Input[i].equals("(")){
				currentMax++;
				if(currentMax > max){
					max = currentMax; 
				}
			}
			else if(Input[i].equals(")")){
				if(currentMax > 0){
					currentMax--;
				}
				else{
					return -1;
				}
			}
		}
		if(currentMax != 0){
			return -1;
		}
		return max;
	}

}
