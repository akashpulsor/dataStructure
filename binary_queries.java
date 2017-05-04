package algoPractice;

import java.io.*;
import java.util.*; 

class binary_queries {
	
	public static void main (String[] args) throws IOException {
		binary_queries bq = new binary_queries(); 
        String [] line3 = bq.input();
        int len = line3.length; 
        if(len==0){
            System.out.println("Array is empty");
            return;
        }
        
        ArrayList<Integer> tempArray = new ArrayList<Integer>();
       
        for(int i = 0; i < len;i++){
        	
       
        	ArrayList<Integer> temp = bq.convertTobinary(Integer.parseInt(line3[i]));
        	int tempLength = temp.size(); 
        	if(tempLength == 0){
        		System.out.println("invalid Inout while parsing");
        	}
        	else{
        		for(int j =tempLength-1;j >=0;j--){
        			tempArray.add(temp.get(j)); 
        		}
        	}
        	
        }
        
        int [] binaryArray = new int[tempArray.size()];
        for(int i =0;i<tempArray.size();i++){
        	binaryArray[i] = tempArray.get(i);
        }
        System.out.println("Insert Query 1");
        
        String [] line4 = bq.input();
        int lenline4 = line3.length; 
        if(lenline4==0){
            System.out.println("Query id empty");
            return;
        }
        int [] flippedArray = bq.runQuery(binaryArray,line4);
        int lenflippedArray = line3.length; 
        if(lenflippedArray==0){
            System.out.println("Fllped array is empty");
            return;
        }
       
        String [] line5 = bq.input();
        int lenline5 = line5.length; 
        if(lenline5==0){
            System.out.println("Query id empty");
            return;
        }
        int [] rangeArray = bq.runQuery(flippedArray,line4);
        if(rangeArray[0]%2 ==0){
        	System.out.println("Even");
        }
        else{
        	System.out.println("Odd");
        }
	}
	
	public ArrayList<Integer> convertTobinary(int num){
		
		ArrayList<Integer> arr =  new ArrayList<Integer>();
		if(num != 0){
			int cnt=0;
			while (num != 0)
			{
			   int d = num % 2;
			   arr.add(d);
			   num /= 2;
			   cnt++;
			 } 
		}
		return arr;
	} 
	
	public String [] input() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] line = br.readLine().split("\\s");
        int len = line.length; 
        if(len==0){
            System.out.println("Array is empty");
            return null;
        }
		return line;
	}
	
	public int[] runQuery(int[] binaryArray, String[] line4) throws IOException{
		int query = Integer.parseInt(line4[0]);
        if(query==1){
        	int flipInt = Integer.parseInt(line4[1]);
        	if(flipInt > binaryArray.length){
        		System.out.println("out pf bound excetion");
        		return null;
        	}
        	if(binaryArray[flipInt]==0){
        		binaryArray[flipInt]= 1;
        	}
        	else if(binaryArray[flipInt]==1){
        		binaryArray[flipInt]= 0;
        	}
        	else{
        		System.out.println("Wrong Query");
        		return null;
        	}
        	return binaryArray; 
        }
        else if(query==0){
        	int startRange = Integer.parseInt(line4[1]);
        	int endRange = Integer.parseInt(line4[4]);
        	if(endRange > binaryArray.length){
        		System.out.println("out pf bound excetion");
        		return null;
        	}
        	int[] newArray = Arrays.copyOfRange(binaryArray, startRange, endRange);
        	return newArray;
        }
        
		return binaryArray;
        
	}
}