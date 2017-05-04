package algoPractice;

public interface KStack {

	
	
	public boolean  isFull();
	 
    // To push an item in stack number 'sn' where sn is from 0 to k-1
    public void push(int item, int sn);
 
    // To pop an from stack number 'sn' where sn is from 0 to k-1
    public int pop(int sn);
 
    // To check whether stack number 'sn' is empty or not
    public boolean isEmpty(int sn);
}
