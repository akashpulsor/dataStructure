package algoPractice;

public class LinkNode {
	    int data;
		LinkNode next;
		
	    public LinkNode getNext() {
			return next;
		}
	    
		public void setNext(LinkNode next) {
			this.next = next;
		}
		public LinkNode(int item) { 
	       data = item;
	    }
		
		public int getData() {
			return data;
		}
		public void setData(int data) {
			this.data = data;
		}

}
