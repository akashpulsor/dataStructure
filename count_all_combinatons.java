package dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class count_all_combinatons {
	public static int [] Combination = new int[6];
	public static void main(String[] args) throws  Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int line = Integer.parseInt(br.readLine());
		int  cnt=0;
		for(int i = 1; i <=6;i++){
			printDecomposition(i,cnt);
			cnt++;
		}
		for(int i =7; i <= line;i++){
			int count = Combination[0] + Combination[1] + Combination[2] + Combination[3]+Combination[4]
					+Combination[5];
			Combination[0] = Combination[1];
			Combination[1] = Combination[2];
			Combination[2] = Combination[3];
			Combination[3] = Combination[4];
			Combination[4] = Combination[5];
			Combination[5] = count;
		}
		if(line > 6){
			System.out.println(Combination[5]);
		}
		else{
			System.out.println(Combination[line-1]);
		}
	}
	
	public static void printDecomposition(int n,int check){
		if(n==0){
			Combination[check]= Combination[check]+1; 
		}
		else if(n > 0){
			
			for(int k =1;k <= 3 ; k++ ){
				printDecomposition(n-k,check);
			}
		}
	}
	
	
	
	
}
