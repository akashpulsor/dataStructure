package algoPractice;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Monk_And_Welcome_Problem {
	public static void main(String args[]) throws Exception
    {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
        {
        	String inpuLine = br.readLine();
        	int N = Integer.parseInt(inpuLine);
        	String[] input1 = br.readLine().split("\\s");
        	if(input1.length > N || input1.length==0){
        		System.out.println("out of bound Exception--Array1");
        		return;
        	}
        	String[] input2 = br.readLine().split("\\s");
        	if(input2.length > N || input2.length==0){
        		System.out.println("out of bound Exception--Array2");
        		return;
        	}
        	
        	for(int i =0; i< N;i++){
        		int temp = Integer.parseInt(input1[i]) + Integer.parseInt(input2[i]);
        		System.out.print(temp + " ");
        	} 
        }
    }

}
