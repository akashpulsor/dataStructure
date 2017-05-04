package algoPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Find_Next_Smaller_Of_Next_Greater_In_An_Array {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
	     {
			String [] input1 = br.readLine().split("\\s+");
			int len = input1.length;
			Integer[] input = new Integer[len];
			for(int i=0; i<len;i++){
				int temp = Integer.parseInt(input1[i]);
				input[i] = temp; 
			}
			 /*
			String queryType = br.readLine();
			 if(!queryType.equals("G") && !queryType.equals("S")){
				 System.out.println("ImproperQuery type");
				 return;
			 }
			 */
			 int[] NG = new int[len];
			 int[] NS = new int[len];
			 NG = nextGorS(input,"G");
			 NS = nextGorS(input,"S");
				
			
			for(int j =0;j< len;j++){
				if(NG[j] != 0 && NS[NG[j]] !=0){
					System.out.print(input[NS[NG[j]]] + " ");
				}
				else{
					System.out.print(-1 + " ");
				}
				
			}
	     }
		catch(Exception e){
			System.out.println(e);
		}
	}
	
	public static int[] nextGorS(Integer[] input,String queryType){
		Stack <Integer> stack = new Stack<Integer>();
		int len = input.length;
		int[] NG = new int[len];
		stack.push(input[0]);
		
		for(int i = 1; i < len;i++){
			int next = input[i];
			int element = stack.pop();
			int j= i;
			while(nextGreaterOrNextSmaller(queryType,next,element)){
				NG[j-1] = i;
				if(stack.isEmpty()){
					break;
				}
				element  = stack.pop();
				j--;
			}
			
			if(queryType.equals("G")){
				if(element > next){
					stack.push(element);
				}
			}
			else if(queryType.equals("S")){
				if(element < next){
					stack.push(element);
				}
			}
			
			stack.push(next);
		}
		return NG;
	}
	
	public static Boolean nextGreaterOrNextSmaller(String s,int next, int element){
		if(s.equals("G")){
			if(element < next){
				return true;
			}
		}
		else if(s.equals("S")){
			if(element > next ){
				return true;
			}
		}
		return false;
	}

}
