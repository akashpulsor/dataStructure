package algoPractice;

import java.util.*;

public class stack_Sorting_Iteration {

	private Stack<Integer> stack ;
	
	public stack_Sorting_Iteration(){
		stack = new Stack<Integer>();
	}
	
	
	public Stack<Integer> sort_Iteration(Stack<Integer> stack){
		if(stack == null || stack.isEmpty()){
			return  stack;
		}
		Stack<Integer> stack2 = new Stack<Integer>();
		stack2.push(stack.pop());
		while(!stack.isEmpty()){	
			int temp2 =stack.pop();
				while(!stack2.isEmpty() && temp2 > stack2.peek() ){
					stack.push(stack2.pop());
				}
				stack2.push(temp2);
			}
		return stack2;
	}
	
	/*
	 * Recursive algorithm time complexity: O(n^2)
	 * Space Complexity : O(n)
	 * */
	public void sort_recursion(Stack<Integer> stack){
		if(stack == null || stack.isEmpty()){
			return;
		}
		int x = stack.pop();
		sort_recursion(stack);
		stackInsert(stack,x);
		this.stack = stack;
	}
	
	public void stackInsert(Stack<Integer> stack,int x){
		if(stack.isEmpty() || x > stack.peek()){
			stack.push(x);
			return;
		}
		
		int temp = stack.pop();
		stackInsert(stack,x);
		
		stack.push(temp);
	}


	@Override
	public String toString() {
		return "stack_Sorting_Iteration [stack=" + this.stack + "]";
	}


	public Stack<Integer> getStack() {
		return stack;
	}

	public void setStack(Stack<Integer> stack) {
		this.stack = stack;
	}
	
	 
}
