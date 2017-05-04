package algoPractice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class longest_Valid_Substring {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			String [] input1 = br.readLine().split("\\s+");
			Stack<String> stack = new Stack<String>();
			int cnt =0;
			for(int i =0;i < input1.length;i++){
				String s = input1[i]; 
				if(s.equals("(")){
					stack.push(s);
				}
				else if(s.equals(")")){
					if(!stack.isEmpty() && stack.pop().equals("(")){
						cnt += 2;
					}
					
				}
			}
			System.out.print(cnt);
		}
	}
	
	public void lengthOfSubString(Stack<String> stack){
		
	}

}
