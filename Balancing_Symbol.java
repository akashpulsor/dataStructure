package algoPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Balancing_Symbol {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
	     {
			String [] inpuLine = br.readLine().split("\\s");
			//time complexity --O(N)
			//Space  complexity --O(n)
	     	Stack<String> stack = new Stack<String>();
	     	for(int i = 0;i< inpuLine.length;i++){
	     		String temp = inpuLine[i]; 
	     		if((temp.equals("{")) || (temp.equals("(")) || (temp.equals("["))) {
	     			stack.push(inpuLine[i]);
	     		}
	     		else{
	     			if(inpuLine[i].equals("}")){
	     				if(stack.peek().equals("{")){
	     					stack.pop();
	     				}
	     				
	     			}
	     			else if(inpuLine[i].equals(")")){
	     				if(stack.peek().equals("(")){
	     					stack.pop();
	     				}
	     				
	     			}
	     			else if(inpuLine[i].equals("]")){
	     				if(stack.peek().equals("[")){
	     					stack.pop();
	     				}	
	     			}
	     			
	     		}
	     		
	     	}  	
	     	if(stack.empty()){
     			System.out.println("Statement is balanced");
     		}
     		else{
     			System.out.println("Statement is not balanced");
     		}
	     }

	}

}
