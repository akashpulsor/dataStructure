package algoPractice;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Mark_The_Answer {

	public static void main(String[] args) throws Exception {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
        {
        	String[] input1 = br.readLine().split("\\s");
        	if(input1.length==0){
        		System.out.println("out of bound Exception--Array1");
        		return;
        	}
        	int N = Integer.parseInt(input1[0]);
        	int X = Integer.parseInt(input1[1]);
        	String[] input2 = br.readLine().split("\\s");
        	if(input2.length > N || input2.length==0){
        		System.out.println("out of bound Exception--Array2");
        		return;
        	}
        	int skipSteps = 1;
        	int marks=0;
        	for(int i =0; i< N;i++){
        		int temp = Integer.parseInt(input2[i]);
        		if(temp > X ){
        			if(skipSteps==1){
        				skipSteps++;
        				continue;
            		}
        			else{
        				break;
        			}
        			
        		}
        		marks++;
        		
        	} 
        	System.out.print(marks);
        }

	}

}
