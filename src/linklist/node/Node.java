package linklist.node;
/**
 * This class for prepare Node :: 19/03/2017
 * @author rkritchat
 *
 */
public class Node {
	private Node next;
	private Object item;
	
	public Node(){
		next = null;
		item = null;
	}
	public Node(Object item){
		this.item=item;
		next = null;
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
