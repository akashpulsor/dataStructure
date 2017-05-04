package algoPractice;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class main {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
	    {
			MyStack s = new MyStack();
			String [] input1 = br.readLine().split("\\s+");
			int len = input1.length;
			for(int i=0; i<len;i++){
				int temp = Integer.parseInt(input1[i]);
				 
				s.push(temp);
			}
			
			System.out.println(s.getS());
			
			while(!s.getS().isEmpty()){
				s.getMin();
				s.pop();
			}
		}
	 }
}
