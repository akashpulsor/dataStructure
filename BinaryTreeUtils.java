package algoPractice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTreeUtils {
	
	public  static  void PreOrderRecursive(BinaryTreeNode root){
		if(root != null){
			PreOrderRecursive(root.getLeft());
			System.out.println(root.getData());
			PreOrderRecursive(root.getRight());
		}
	}
	
	public  static  ArrayList<Integer> PreOrderIterative(BinaryTreeNode root){
		ArrayList<Integer> res = new ArrayList<Integer>();
		if(root != null){
			return res;
		}
		else{
			Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
			stack.push(root);
			while(!stack.isEmpty()){
				BinaryTreeNode tmp = stack.pop();
				res.add(tmp.getData());
				if(tmp.getRight() != null){
					stack.push(tmp.getRight());
				}
				if(tmp.getRight() != null){
					stack.push(tmp.getLeft());
				}
			}
		}
		return res;
	}
	public  static  ArrayList<Integer> InOrderRecursive(BinaryTreeNode root,ArrayList<Integer> res){	
		if(root != null){
			InOrderRecursive(root.getLeft(),res);
			res.add(root.getData());
			InOrderRecursive(root.getRight(),res);
		}
		return res;
	}
	
	public  static  ArrayList<Integer> InOrderIterative(BinaryTreeNode root){
		ArrayList<Integer> res = new ArrayList<Integer>();
		Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
		BinaryTreeNode currentNode = root;
		boolean done = false;
		while(!done){
			if(currentNode != null){
				stack.push(currentNode);
				currentNode = currentNode.getLeft();
			}
			else{
				if(stack.isEmpty()){
					done = true;
				}
				else{
					currentNode = stack.pop(); 
					res.add(currentNode.getData());
					currentNode = currentNode.getRight();
				}
			}
		}
		return res;
	}
	
	public static ArrayList<Integer>  postOrderRecursive(BinaryTreeNode root,ArrayList<Integer> res){
		if(root != null){
			postOrderRecursive(root.getLeft(),res);
			postOrderRecursive(root.getRight(),res);
			res.add(root.getData());
		}
		return res;
	}
	
	public static ArrayList<Integer>  postOrder(BinaryTreeNode root){
		ArrayList<Integer> res = new ArrayList<Integer>();
		if(root==null){
			return res;
		}
		Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
		stack.push(root);
		BinaryTreeNode prev = null;
		while(!stack.isEmpty()){
			BinaryTreeNode curr = stack.peek();
			if(prev ==null || prev.getLeft() == curr || prev.getRight() == curr){
				if(curr.getLeft() != null){
					stack.push(curr.getLeft());
				}
				else if(curr.getLeft() != null){
					stack.push(curr.getRight());
				}
			}
			else if(curr.getLeft() == prev){
				if(curr.getRight() != null){
					stack.push(curr.getRight());
				}
			}
			else{
				res.add(curr.getData());
				stack.pop();
			}
			prev = curr;
		}
		return res;
	}
	
	public ArrayList<ArrayList<Integer>> levelOrder(BinaryTreeNode root){
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		if(root==null){
			return res;
		}
		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		q.offer(root);
		q.offer(null);
		ArrayList<Integer> curr = new ArrayList<Integer>();
		while(!q.isEmpty()){
			BinaryTreeNode tmp = q.poll();
			if(tmp != null){
				curr.add(tmp.getData());
				if(tmp.getLeft()!= null){
					q.offer(tmp.getLeft());
				}
				if(tmp.getRight()!= null){
					q.offer(tmp.getRight());
				}
			}
			else{
				ArrayList<Integer> c_curr = new ArrayList<Integer>(curr);
				res.add(c_curr);
				curr.clear();
				if(!q.isEmpty()){
					q.offer(null);
				}
			}
			
		}
		return res;
	}
	
}
