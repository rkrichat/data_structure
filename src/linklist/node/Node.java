package linklist.node;
/**
 * This class for prepare Node :: 19/03/2017
 * @author rkritchat
 *
 */
public class Node<T> { //Modify for add Generic 20/03/2017
	private Node<T> next;
	private T item;
	
	public Node(){
		next = null;
		item = null;
	}
	public Node(T item){
		this.item=item;
		next = null;
	}
	
	public Node(T item,Node<T> next){
		this.item = item;
		this.next = next;
	}
	
	//getter
	public Node<T> getNext() {
		return next;
	}
	public Object getItem() {
		return item;
	}
	
	//setter
	public void setNext(Node<T> next) {
		this.next = next;
	}
	public void setItem(T item) {
		this.item = item;
	}	
}
