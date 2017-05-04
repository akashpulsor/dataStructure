package algoPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class postfix_evalutaion {
	public static void main(String[] args) throws IOException {
		
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
		{
			String[] input1 = br.readLine().split("\\s");
			Stack<Integer> stk = new Stack<Integer>();
			for(int i =0 ;i<input1.length;i++){
				
					if(input1[i].equals("+")){
						int temp1 = stk.pop();
						int temp2 = stk.pop();
						int sum = temp1 + temp2;
						stk.push(sum);
					}
					else if(input1[i].equals("-")){
						int temp1 = stk.pop();
						int temp2 = stk.pop();
						int sum = temp2 - temp1;
						stk.push(sum);
					}
					else if(input1[i].equals("*")){
						int temp1 = stk.pop();
						int temp2 = stk.pop();
						int sum = temp1 * temp2;
						stk.push(sum);
					}
					else if(input1[i].equals("/")){
						int temp1 = stk.pop();
						int temp2 = stk.pop();
						int sum = temp1 / temp2;
						stk.push(sum);
					}
					else if(input1[i].equals("%")){
						int temp1 = stk.pop();
						int temp2 = stk.pop();
						int sum = temp1 % temp2;
						stk.push(sum);
					}
				 
				else{
					stk.push(Integer.parseInt(input1[i]));
				}
			}
			
			System.out.println(stk.pop());
		}
	}
}
