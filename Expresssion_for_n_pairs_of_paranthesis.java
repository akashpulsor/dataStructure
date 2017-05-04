package algoPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Expresssion_for_n_pairs_of_paranthesis {
	 
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		 try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
	     {
			 int r = Integer.parseInt(br.readLine());
			 String[] arr = new String[2 * r]; 
			 if(r > 0){
				 printParantesis(arr,0,r,0,0);
			 }
	     }
	}
	
	//17110097661 - card hot listing
	//17110098133 -smart pay cancellation
	public static void printParantesis(String[] arr,int pos,int count, int open, int close){
		if(close==count){
			
			for(int j =0;j<arr.length;j++){
				System.out.print(arr[j]);
			}
			System.out.println();
			return;
		}
		
		if(open > close){
			
			arr[pos]="}";
			printParantesis(arr,pos+1,count,open,close+1);
		}
		if(open < count){
			
			arr[pos] = "{";
			printParantesis(arr,pos+1,count,open+1,close);
		}
	}
}
