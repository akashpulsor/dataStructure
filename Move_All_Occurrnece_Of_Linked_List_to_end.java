package algoPractice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Move_All_Occurrnece_Of_Linked_List_to_end {

	public static void main(String[] args) throws Exception {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
        {
        	String[] input1 = br.readLine().split("\\s");
        	int  key= Integer.parseInt(br.readLine());
        	int N = input1.length;
        	linkedList ll = new linkedList();
        	
        	for(int i =0; i < N; i++){
        		
        		ll.insert(Integer.parseInt(input1[i]), i);
        	}
        	System.out.println("Original contents of ll: " + ll);
        	LinkNode head = ll.getHead();
        	ArrayList<LinkNode> ll2 = new ArrayList<LinkNode>();
        	LinkNode previousNode;
        	while(head.getNext() != null){
        		previousNode =head.getNext(); 
        		if(head.getData() != key){
        			head = head.getNext(); 
        		}
        		else{
        			ll2.add(previousNode);
        			ll.removeMatched(previousNode);
        		}
        	}
        	System.out.println("Original contents of ll--after: " + ll);
        	
        	System.out.println("Original contents of ll2--Akash: " + ll2);
        	int index = 0;
        	while(ll2.listIterator().hasNext()){
        		head.next =  ll2.get(index);
        		index++;
        	}
        	
        	System.out.println("Original contents of ll: " + ll);
        	
        	
        	System.out.println("After contents of ll: " + ll2);
        }
	}
}
