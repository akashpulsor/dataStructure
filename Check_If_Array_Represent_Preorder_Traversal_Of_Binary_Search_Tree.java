package algoPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
/*
 * O(N2)
 * 1) Find the first greater value on right side of current node. 
   Let the index of this node be j. Return true if following 
   conditions hold. Else return false
    (i)  All values after the above found greater value are 
         greater than current node.
    (ii) Recursive calls for the subarrays pre[i+1..j-1] and 
         pre[j+1..n-1] also return true. 
 * */

/*
 * O(N) complexity
 * Root = Integer.Min_Value
 * loop through array 
 * */

public class Check_If_Array_Represent_Preorder_Traversal_Of_Binary_Search_Tree {

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
			if(preOrderCheck(input,0,len-1)){
				System.out.println("Is BST-- true");
			}
			else{
				System.out.println("Is BST-- false");
			}
			
			if(preOrderCheckLinearComlplexityCheck(input)){
				System.out.println("Is BST Linear Complexity-- true");
			}
			else{
				System.out.println("Is BST Linear Complexity-- false");
			}
		}
	     
		
	}	
	
	
	public static Boolean AftrenextMax(Integer[] input,int j,int high){
		for(int i =j+1;j<high;j++){
			if(input[i] < input[j]){
					return false;
			}
			
		}
		return true;
	}
	public static int nextMax(Integer[] input,int low ,int high){
		
		for(int i =low;i<high;i++){
			if(input[i] > input[low] ){
				return i;
			}
			
		}
		return low;
	}
	
	public static Boolean preOrderCheck(Integer[] input,int low,int high){
		
		if(low > high){
			return true;
		}
		
		int nextMax = nextMax(input,low,high);
		if(AftrenextMax(input,nextMax,high) && preOrderCheck(input,low+1,nextMax-1) ){
			if(preOrderCheck(input,nextMax+1,high-1)){
				return true;
			}
			
		}
		return false;
	}
	
	public static Boolean preOrderCheckLinearComlplexityCheck(Integer[] input){
		
		int root = Integer.MIN_VALUE;
		Stack<Integer> stack = new Stack<Integer>();
		for(int i =0;i<input.length;i++){
			int temp = input[i];
			if( temp < root){
				return false;
			}
			while(!stack.isEmpty() && stack.peek() < input[i]){
				root = stack.pop();
			}
			
			stack.push(input[i]);
		}
		
		return true;
	}
	
	

}
