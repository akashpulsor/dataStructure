package dynamicProgramming;

import java.io.BufferedReader;
import java.io.InputStreamReader;
//Time Complexity O(n2)
//Space Complexity O(n)
public class catlan_numbers {
	public static int[] c2;
	public static void main(String[] args) throws  Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int line = Integer.parseInt(br.readLine());
		c2 = new int[line+1];
		int result = catlanNumbers(line);
		System.out.println(result);
	}
	
	public static int catlanNumbers(int n){
		c2[0] =c2[1]=1;
		
		for(int i =2; i <=n; i++){
			
			for(int j =0;j<i;j++){
				c2[i] += c2[j] * c2[i-j-1]; 
			}
		}
		return c2[n]; 
	}

}
