package algoPractice;

public class kStack_Implementation implements KStack{
	private int top[];
	private int next[];
	private int free;
	private int [] arr;
	
	public kStack_Implementation(int k,int total){
		arr = new int[total];
		top = new int[k];
		next = new int[total];
		
		for(int i =0; i < k;i++){
			top[i] = -1;
		}
		free=0;
		for(int i =0 ;i < total;i++){
			next[i]= i+1;
		}
		next[total-1]= -1;
	}
	

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		if(this.free==-1){
			return true;
		}
		return false;
	}

	@Override
	public void push(int item, int sn) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int pop(int sn) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty(int sn) {
		// TODO Auto-generated method stub
		if(this.top[sn]==-1){
			return true;
		}
		return false;
	}

}
