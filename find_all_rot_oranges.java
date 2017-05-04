package algoPractice;

import java.util.LinkedList;
import java.util.Queue;

public class find_all_rot_oranges {
	public static int b=3;
	public static int c=5;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		find_all_rot_oranges data = new find_all_rot_oranges();
		int arr[][] = {{2, 1, 0, 2, 1},{1, 0, 1, 2, 1},{1, 0, 0, 2, 1}};
		
		timeTorot(arr,data);
	}
	
	public static void timeTorot(int[][] matrix, find_all_rot_oranges data){
		Queue<element> q =  new LinkedList<element>();
		for(int i =0;i < b;i++){
			for(int j =0 ; j < c; j++){
				if(matrix[i][j] == 2){
					find_all_rot_oranges.element temp = data.new element();
					temp.x=i;
					temp.y = j;
					q.offer(temp);
				}
			}
		}
		
		// creating delimitter -1, -1
		find_all_rot_oranges.element temp = data.new element();
		temp.x=-1;
		temp.y = -1;
		q.offer(temp);
		int ans =0;
		while(!q.isEmpty()){
			boolean timeFlag= false;
			
			while(!isDelimiter(q.peek())){
				element temp1 = q.peek();
				if(isValid(q.peek().x+1,q.peek().y) && matrix[q.peek().x+1][q.peek().y]==1){
					if(timeFlag==false){
						ans++;
					}
					matrix[q.peek().x+1][q.peek().y]=2;
				
					element temp2 = temp1;
					temp2.x= temp1.x + 1;
					temp2.y= temp1.y;
					q.peek().x = temp1.x -1;
					q.peek().y = temp1.y;
					q.offer(temp2);
				}
				if(isValid(q.peek().x-1,q.peek().y) && matrix[q.peek().x-1][q.peek().y]==1){
					if(timeFlag==false){
						ans++;
					}
					matrix[q.peek().x-1][q.peek().y]=2;
					element temp2 = data.new element();
					temp2.x= temp1.x - 1;
					temp2.y= temp1.y;
					q.peek().x = temp1.x +1;
					q.peek().y = temp1.y;
					q.offer(temp2);
				}
				if(isValid(q.peek().x,q.peek().y-1 ) && matrix[q.peek().x][q.peek().y-1]==1){
					if(timeFlag==false){
						ans++;
					}
					matrix[q.peek().x][q.peek().y-1]=2;
					element temp2 = data.new element();
					temp2.x= temp1.x ;
					temp2.y= temp1.y-1;
					q.peek().x = temp1.x;
					q.peek().y = temp1.y+1; 
							
					q.offer(temp2);
				}
				if(isValid(q.peek().x,q.peek().y+1 ) && matrix[q.peek().x][q.peek().y+1]==1){
					if(timeFlag==false){
						ans++;
					}
					matrix[q.peek().x][q.peek().y+1]=2;
					element temp2 = data.new element();
					temp2.x= temp1.x ;
					temp2.y= temp1.y+1;
					q.peek().x = temp1.x;
					q.peek().y = temp1.y -1;
					q.offer(temp2);
				}
				q.poll();
			}
			q.poll();
		}
		
		int res = checkAll(matrix)? -1 :  ans;
		System.out.println(res);
		
	}
	public static boolean checkAll(int[][] matrix){
		if(matrix != null){
			for(int i=0; i < b;i++){
				for(int j =0;j < c;j++){
					if(matrix[i][j]==1){
						return true;
					}
				}
			}
		}
		else{
			return true;
		}
		return false;
	}
	public static boolean  isValid(int i, int j){
		if(i >=0 && j >=0 && i < b && j < c){
			return true;
		}
		return false;
	}
	
	private class element{
		int x;
		int y;
	}
	public static boolean isDelimiter(element node){
		if(node.x == -1 && node.y == -1){
			return true;
		}
		return false;
	}
}
