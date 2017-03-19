package linklist.node;

public class Node {
	private Node next;
	private Object item;
	
	public Node(){
		next = null;
		item = null;
	}
	public Node(Object item){
		next = null;
		this.item=item;
	}
	
	public Node(Object item,Node next){
		this.item = item;
		this.next = next;
	}
	
	//getter
	public Node getNext() {
		return next;
	}
	public Object getItem() {
		return item;
	}
	
	//setter
	public void setNext(Node next) {
		this.next = next;
	}
	public void setItem(Object item) {
		this.item = item;
	}	
}
