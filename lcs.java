package dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lcs {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
		{
			String[] string1 = br.readLine().split("\\s");
			
			String[] string2 = br.readLine().split("\\s");
			lcsCount(string1,string2);
		}
	}
	
	public static void lcsCount(String[] string1,String[] string2){
		int x = string1.length;
		int y = string2.length;
		int [][] lcs = new int[x][y];
		for(int i = 0; i < x; i++){
			for(int j =0; j < y;j++){
				String s1 = string1[i];
				String s2 = string1[j];
				if(s1.equals(s2)){
					lcs[i+1][j+1] = lcs[i][j] +1; 
				}
				else{
					lcs[i+1][j+1] = Math.max(lcs[i+1][j], lcs[i][j+1]);
				}
			}
		}
		
		System.out.println("LCS length: " + lcs[x][y]);

		while(x > 0 && y > 0){
			
			if(string1[x-1] ==string1[y-1]){
				System.out.print(string1[x-1]);
				x--;
				y--;
			}
			else if(lcs[x-1][y] > lcs[x][y-1]){
				x--;
			}
			else{
				y--;
			}
			
		}
	}

}
