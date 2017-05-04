package algoPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Tower_Of_hanaoi {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			String [] input1 = br.readLine().split("\\s+");
			Stack<Integer> from = new Stack<Integer>();
			Stack<Integer> aux = new Stack<Integer>();
			Stack<Integer> to = new Stack<Integer>();
			for(int i =0;i < input1.length;i++){
				from.push(Integer.parseInt(input1[i]));
			}
			;
			TOH_Recursion(4,from,aux,to);
			System.out.println(to);
			
		}
	}
	
	public static void TOH_Recursion(int ND, Stack<Integer> from,Stack<Integer> aux,Stack<Integer> to){
		if(ND <= 0){
			return;
		}
		
		TOH_Recursion(ND-1,from,aux,to);
		int temp = from.pop();
		to.push(temp);
		TOH_Recursion(ND-1,aux,to,from);
	}

}
