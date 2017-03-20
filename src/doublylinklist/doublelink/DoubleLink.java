package doublylinklist.doublelink;
/**
 * This class for prepare Doubly Link List. :: 20/03/2017
 * @author rkritchat
 *
 */
public class DoubleLink {
	private DoubleLink next = null;;
	private DoubleLink precede = null;;
	private Object item = null;;
	
	public DoubleLink(Object item){
		this.item = item;
		this.precede = null;
		this.next = null;
	}
	
	public DoubleLink(Object item, DoubleLink precede, DoubleLink next){
		this.item = item;
		this.precede = precede;
		this.next = next;
	}
	
	//getter
	public DoubleLink getNext() {
		return next;
	}
	public DoubleLink getPrecede() {
		return precede;
	}
	public Object getItem() {
		return item;
	}
	
	//setter
	public void setNext(DoubleLink next) {
		this.next = next;
	}
	public void setPrecede(DoubleLink precede) {
		this.precede = precede;
	}
	public void setItem(Object item) {
		this.item = item;
	}
}
