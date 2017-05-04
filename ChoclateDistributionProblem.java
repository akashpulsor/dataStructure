package algoPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChoclateDistributionProblem {
	
	
	
	private ArrayList<Integer> choclate= new  ArrayList<Integer>();

	public ArrayList<Integer> getChoclate() {
		return choclate;
	}

	public void setChoclate(ArrayList<Integer> choclate) {
		this.choclate = choclate;
	}
	

	
	
	public void printArray(ArrayList<Integer> choclate, int i,int subsetSize,ArrayList<ArrayList<Integer>> powerSet){
		
		if(i == choclate.size()-subsetSize-1){
			return;
		}
		
		int k= i+1;
		int j = k+1;
		printPowerset(choclate,i,k,j,powerSet);
		printArray(choclate,++i,subsetSize,powerSet);
		
	}
	
	public void printPowerset(ArrayList<Integer> choclate, int i,int k,int j,ArrayList<ArrayList<Integer>> powerSet){
		
		
	}
	
	public  static void main(String[] args){
		
		ChoclateDistributionProblem solution = new ChoclateDistributionProblem();
		solution.setChoclate(new ArrayList<Integer>(
			    Arrays.asList(7,3,2,4,9,12,56)));
		ArrayList<ArrayList<Integer>> powerSet = new ArrayList<ArrayList<Integer>>();
		solution.printArray(solution.getChoclate(),0,2,powerSet);
		
		for(ArrayList<Integer> data : powerSet){
			for(int element :data){
				System.out.print(element+",");
				
			}
			//System.out.print("}");
			System.out.println();
		}
	} 
}
