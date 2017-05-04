package algoPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class remove_recurring_instances {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
	     {
			String [] inputLine = br.readLine().split("\\s");
			int [] A = new int[inputLine.length];
			for(int i =0;i< inputLine.length;i++){
				A[i] = Integer.parseInt(inputLine[i]);
			}
			int index = remove_adjacent_duplicates(A);
			System.out.print(" " + index);
			
			for(int i =0; i < index; i++){
				System.out.print(" " + A[i]);
			}
			
	     }
	}
	
	public static int  remove_adjacent_duplicates(int[] A){
		int stkptr = -1;
		int i =0;
		while(i < A.length){
			if(stkptr == -1 || A[stkptr]!=A[i]){
				stkptr++;
				A[stkptr] = A[i];
				i++;
			}
			else{
				while(i < A.length && A[stkptr]==A[i]){
					i++;
				}
				stkptr--;
			}
		}
		return stkptr;
	}
}
