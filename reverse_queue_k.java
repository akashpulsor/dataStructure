package algoPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverse_queue_k {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
	    {
			String [] inputLine = br.readLine().split("\\s");
			int k = Integer.parseInt(br.readLine());
			Queue<Integer> q = new LinkedList<Integer>();
			for(int i =0; i < inputLine.length;i++){
				q.add(Integer.parseInt(inputLine[i]));
			}
			reverseQueueFirstKElements(k,q);
	    }
	}
	
	public static void reverseQueueFirstKElements(int k ,Queue<Integer> q ){
		if(q == null || k > q.size()){
			throw new IllegalArgumentException();
		}
		else if(k > 0){
			Stack<Integer> stack = new Stack<Integer>();
			for(int i =0; i < k; i++){
				stack.push(q.remove());
			}
			while(!stack.isEmpty()){
				q.add(stack.pop());
			}
			for(int i =0; i < q.size() - k;i++){
				q.add(q.remove());
			}
		}
		while(!q.isEmpty()){
			System.out.print(q.remove()+ " ");
		}
	}
}
