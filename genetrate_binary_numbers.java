package algoPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class genetrate_binary_numbers {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
        int n = Integer.parseInt(input);
        Queue<String> q = new LinkedList<String>();
        ArrayList<String> list = new ArrayList<String>();
        q.offer("1");
        while(n != 0){
        	String s1 = q.poll();
        	list.add(s1);
        	q.offer(s1.concat("0"));
        	String s2 = s1; 
        	q.offer(s2.concat("1"));
        	n--;
        }
        for(int i =0 ; i < list.size();i++){
        	System.out.println(list.get(i));
        }
	}

}
