package dynamicProgramming;

import java.util.LinkedList;
import java.util.Queue;

import algoPractice.BinaryTreeNode;

public class nodes_at_a_level {

public static void main(String[] args) {
	// TODO Auto-generated method stub
	BinaryTreeNode tree  = new BinaryTreeNode(1);
	tree.setLeft(new BinaryTreeNode(2));
	tree.setRight(new BinaryTreeNode(3));
	tree.getLeft().setLeft(new BinaryTreeNode(4));
	tree.getLeft().setRight(new BinaryTreeNode(5));
	tree.getRight().setRight(new BinaryTreeNode(8));
	tree.getRight().getRight().setLeft(new BinaryTreeNode(6));
	tree.getRight().getRight().setRight(new BinaryTreeNode(7));
	nodes_at_level(tree);
}

public static void nodes_at_level(BinaryTreeNode tree){
	
	Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
	q.offer(tree);
	int cnt =1;
	System.out.println("level " + cnt + ":");
	System.out.println(tree.getData() + " ");
	while(!q.isEmpty()){
		int queueSize = q.size();
		cnt++;
		Boolean checkFlag=false;
		
		while(queueSize!=0){
			BinaryTreeNode curr = q.remove();
			int leftData=0;
			int rightData=0;
			
			if(curr.getLeft() != null){
				BinaryTreeNode left = curr.getLeft();
				leftData = left.getData();
				if(checkFlag.equals(false)){
					System.out.println("level " + cnt + ":");
				}
				checkFlag=true;
				System.out.print(leftData + " ");
				q.offer(left);
			}
			if(curr.getRight() != null){
				BinaryTreeNode right = curr.getRight();
				rightData = right.getData();
				if(checkFlag.equals(false)){
					System.out.println("level " + cnt + ":");
				}
				checkFlag=true;
				System.out.print(rightData + " ");
				q.offer(right);
			}
			
			queueSize--;
		}
		System.out.println();
		
	}
}

}
