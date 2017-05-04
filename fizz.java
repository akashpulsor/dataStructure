package algoPractice;


/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
 */
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility  classes
import java.util.*;


public  class fizz {
    public static void main(String[] args) throws Exception {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
        {
            String inpuLine = br.readLine();
        	int N = Integer.parseInt(inpuLine);
        	String[] input1 = br.readLine().split("\\s");
        	if(input1.length==0){
        		System.out.println("out of bound Exception--Array1");
        		return;
        	}
        	
        	
        	for(int i =0; i< N;i++){
        		int temp = Integer.parseInt(input1[i]);
        		for(int j =1;j<=temp;j++){
        			if(j % 3 ==0 && j % 5 ==0){
        				System.out.println("FizzBuzz");
        			}
        			else if(j % 3 ==0){
        		        System.out.println("Fizz");
        		    }
        		    else if(j % 5 ==0) {
        		        System.out.println("Buzz");
        		    }
        		    else{
        		        System.out.println(j);
        		    }
        		}
        		
        		
        	} 
        }
    }
}