package algoPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class stack_Sorting_Main {

	public static void main(String[] args) throws Exception {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
	    {
		   String [] input1 = br.readLine().split("\\s+");
		   Stack<Integer>  stack= new Stack<Integer>();
		   stack_Sorting_Iteration stk = new stack_Sorting_Iteration();
		   for(int i =0;i < input1.length;i++){
			   
			   stack.push(Integer.parseInt(input1[i]));
		   }
		   
		   System.out.println("Unsorted: "+ stack);
		   stk.sort_recursion(stack);
		   System.out.println("Sorted: "+ stk.toString());
		   
	    }	

	}

}
