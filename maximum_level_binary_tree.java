package algoPractice;

import java.util.LinkedList;
import java.util.Queue;

public class maximum_level_binary_tree {

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
		System.out.println(maximumLevel(tree));
	}
	
	public static int maximumLevel(BinaryTreeNode tree){
		int sum = tree.getData();
		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		q.offer(tree);
		while(!q.isEmpty()){
			int queueSize = q.size();
			int tempSum =0;
			while(queueSize!=0){
				BinaryTreeNode curr = q.remove();
				int leftData=0;
				int rightData=0;
				
				if(curr.getLeft() != null){
					BinaryTreeNode left = curr.getLeft();
					leftData = left.getData();
					tempSum += leftData;
					q.offer(left);
				}
				if(curr.getRight() != null){
					BinaryTreeNode right = curr.getRight();
					rightData = right.getData();
					tempSum += rightData;
					q.offer(right);
				}
				
				queueSize--;
			}
			if(tempSum > sum){
				sum = tempSum; 
			}
			
		}
		return sum;
	}

}
