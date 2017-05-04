package algoPractice;

import java.io.*;
import java.util.*; 

class GFG {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] line3 = br.readLine().split("\\s");
        int len = line3.length; 
        if(len==0){
            System.out.println("Array is empty");
            return;
        }
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        for(int i =0; i < len-1; i++){
        	String temp = line3[i].toLowerCase();
            if(!map.isEmpty() && map.containsKey(temp)){
                int value =map.get(temp);
                if(value==2){
                	System.out.println("Fist duplicate value is " + line3[i]);                
                    return;
                }
                else{
                    map.put(temp,++value);
                }
            }
            else{
                map.put(temp,1);
            }
        }
        
	}
}