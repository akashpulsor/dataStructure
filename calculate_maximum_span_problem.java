package algoPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class calculate_maximum_span_problem {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
	     {
			 String [] inpuLine = br.readLine().split("\\s");
				//time complexity --O(N)
				//Space  complexity --O(n)
			 Integer[] s = calculateSpan(inpuLine);
			 for(int i =0;i <s.length;i++){
				 System.out.print(s[i] + " ");
			 }
	     }
	}
	
	public static Integer[] calculateSpan(String [] inpuLine){
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(0);
		Integer[] s = new Integer[inpuLine.length];
		s[0] = 1;
		for(int i =1;i<inpuLine.length;i++){
		 while(!stack.isEmpty() &&
				 Integer.parseInt(inpuLine[stack.peek()])<= Integer.parseInt(inpuLine[i])){
			 stack.pop();
			 }
		 	s[i] = (stack.isEmpty())? (i+1): (i - stack.peek());
		 	stack.push(i);
		}
		
		return s;
		
	}
}
