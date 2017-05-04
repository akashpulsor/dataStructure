package algoPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class check_For_Duplicate_Paranthesis {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
	     {
			String [] input1 = br.readLine().split("\\s+");
			
			Stack <String> stack = new Stack<String>();
			for(int i =0;i < input1.length;i++){
				if(input1[i].equals(")")){
					String Top = stack.pop();
					
					if(Top.equals("(")){
						System.out.println("Duplicate paranthesis exixts");
						return;
					}
					else{
						while(!Top.equals("(")){
							Top = stack.pop(); 
						}
					}
				}
				else{
					stack.push(input1[i]);
				}
			}
			br.close();
	     }
		System.out.println("No Duplicate paranthesis exixts");
		return;
		
	}

}
