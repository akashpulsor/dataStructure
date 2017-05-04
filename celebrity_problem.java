package algoPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class celebrity_problem {

	public static boolean[][] accountnceMatrix={{false, false, true, false},
			 {false, false, true, false},
			 {false, false, false, false},
			 {false, false, true, false}};
;
	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub
		
		StackSolutions(fillStack());
	}
	
	public static boolean knows(int a,int b){
		return accountnceMatrix[a][b];
	}
	
	public static void StackSolutions(Stack<Integer> stack){
		
		int A = stack.pop();
		int B = stack.pop();
		while(stack.size() > 1){
			if(knows(A,B)){
				A = stack.pop();
			}
			else {
				B = stack.pop();
			}
		}
		
		int C = stack.pop();
		if(knows(C,B)){
			 C = B;
		}
		if(knows(C,A)){
			 C = A;
		}
		
		for(int i = 0;i < accountnceMatrix.length;i++){
			if((i != C)&& (knows(C,i) || !knows(i,C))){
				System.out.println("No celebirity" );
				return ;
			}
		}
		System.out.println(C);
	}
	
	public static Stack<Integer> fillStack(){
		Stack<Integer> stack= new Stack<Integer>();
		for(int i = 0;i < accountnceMatrix.length;i++){
			stack.push(i);
		}
		return stack;
	}
	public static void recursionSolutions(int j, Stack<Integer> stack){
		recursionSolutions(j,stack);

	}
}
