package algoPractice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

class Micro_And_Array_Update {
	  
	public static void main(String args[]) throws Exception
    {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
        {
           String inpuLine = br.readLine(); 
           int T = Integer.parseInt(inpuLine);
           for(int i =0; i<= T; i++){
        	   String[] qry = br.readLine().split("\\s");
               int sizeOfArray = Integer.parseInt(qry[0]);
               int topVal = Integer.parseInt(qry[1]);
               String[] integerList = br.readLine().split("\\s");
               int[] array = new int[sizeOfArray];
               for(int j = 0 ;  j < sizeOfArray;j++){
            	   array[j] = Integer.parseInt(integerList[j]); 
               }
               
               HashMap<Integer,Boolean> map = new HashMap<Integer,Boolean>();
               long startSeconds = System.currentTimeMillis() / 1000l;
               for(int k =0 ; k <integerList.length;k++ ){
            	   if(array[k]<topVal){
            		   ++array[k];
            		   map.put(k,false);
            	   }
            	   else{
            		   map.put(k,true);
            	   }
            	   if(k == integerList.length -1){
            		    if(map.containsValue(false)){
            		    	k=-1;
            		    }
            	   }
               }
               long endSeconds = System.currentTimeMillis() / 1000l;
               long timeSpent = endSeconds - startSeconds;  
               System.out.println(timeSpent);
           }
           
        }
    }
}