package algoPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class interleaving_queue {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
	     {
			String [] inputLine = br.readLine().split("\\s");
			Queue<Integer> q = new LinkedList<Integer>();
			for(int i =0; i < inputLine.length;i++){
				q.add(Integer.parseInt(inputLine[i]));
			}
			interLeavingQueue(q);
	     }
	}
	
	public static  void interLeavingQueue(Queue<Integer> q){
		int size = q.size();
		int half = size / 2; ;
		
		Integer []  arr = new Integer[half]; 
		for(int i =0; i < half;i++){
			arr[i] = q.remove(); 
		}
		for(int i =0;i < arr.length;i++ ){
			q.add(arr[i]);
			q.add(q.remove());
		}
		
		while(!q.isEmpty()){
			System.out.print(q.remove() + " ");
		}
		
	}
}
