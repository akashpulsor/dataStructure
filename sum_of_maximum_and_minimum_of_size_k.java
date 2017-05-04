package algoPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class sum_of_maximum_and_minimum_of_size_k {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
	     {
			String [] inputLine = br.readLine().split("\\s");
			int k = Integer.parseInt(br.readLine());
			Integer input[] = new Integer[inputLine.length];
			for(int i =0; i < inputLine.length;i++){
				input[i]= Integer.parseInt(inputLine[i]);
			}
			calculate_maximum_min(k,input);
			calculate_maximum_min_ddeque(k,input);
	
	     }
		

	}
	//time complexity O(n*k)
	public static void calculate_maximum_min(int k,Integer input[]){
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(0);
		int sum = 0;
		while(!stack.isEmpty()){
			int index = stack.pop();
			if(index+k >=input.length ){
				continue;
			}
			int max =0;
			int min =0;
			for(int i = index;i < k;i++){
				if(input[i] > max){
					max =input[i];
				}
				if(input[i] < min){
					min =input[i];
				}
				
			}
			stack.push(index+1);
			sum =  sum + max+min;
		}
		System.out.println(sum);
	}
	
	
public static void calculate_maximum_min_ddeque(int k,Integer input[]){
		
		Deque<Integer> dequeG = new LinkedList<Integer>();
		Deque<Integer> dequeS = new LinkedList<Integer>();
		
		for(int i =0; i < k ; i++){
			while(!dequeG.isEmpty() && input[dequeG.peek()] <=input[i])
			{
				dequeG.removeFirst();
			}
			while(!dequeS.isEmpty() && input[dequeS.peek()] >=input[i])
			{
				dequeS.removeFirst();
			}
		
			dequeG.addLast(i);
			dequeS.addLast(i);
		}
		int sum =0;
		for(int i =k ; i < input.length;i++){
			sum += input[dequeG.peekFirst()] + input[dequeS.peekFirst()];
			while(!dequeS.isEmpty() && dequeS.peekFirst() <= i-k){
				dequeS.removeFirst();
			}
			while(!dequeS.isEmpty() && input[dequeS.peekLast()] >= input[i] ){
				dequeS.removeLast();
			}
			while(!dequeG.isEmpty() && dequeG.peekFirst() <= i-k){
				dequeG.removeFirst();
			}
			while(!dequeG.isEmpty() && input[dequeG.peekLast()] <= input[i] ){
				dequeG.removeLast();
			}
			dequeG.addLast(i);
			dequeS.addLast(i);
		}
		sum += input[dequeG.peekFirst()] + input[dequeS.peekFirst()];
		System.out.println(sum); 
	}
}
