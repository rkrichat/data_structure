package doublylinklist.insertdoublylinklist;

import doublylinklist.createdoublylinklist.CreateDoublyLinkList;
import doublylinklist.doublelink.DoubleLink;
/**
 * This class for insert Double Link List :: 23/03/2017
 * @author rkritchat
 *
 */
public class InsertDoubleLinkList extends CreateDoublyLinkList {
	public static void main(String[] args){
		DoubleLink head=null;
		String[] data = {"First","Second","Fourth"};
		head = initNode(head,data);
		String item = "Third", traget = "";	
		head = insertItem(head,item,traget);
		showMessage(head);
	}
	
	/**
	 * Insert Double Link list :: 23/03/2017
	 * @param head
	 * @param item
	 * @param traget
	 * @return
	 */
	protected static DoubleLink insertItem(DoubleLink head,String item,String traget){
		if(head==null){
			head = new DoubleLink(item);
		}else{
			DoubleLink nodeTemp = new DoubleLink(item);
			DoubleLink curr = head;
			DoubleLink nextNode = curr.getNext();
			while(curr!=null){
				if(traget.equals(curr.getItem()) && curr==head){
					curr.setNext(nodeTemp);
					nodeTemp.setPrecede(curr);
					break;
				}else if(traget.equals(curr.getItem())){
					curr.setNext(nodeTemp);
					nodeTemp.setPrecede(curr);
					if(null!=nextNode){
						nodeTemp.setNext(nextNode);
						nextNode.setPrecede(nodeTemp);
					}
					break;
				}else{
					if(null == nextNode){
						curr.setNext(nodeTemp);
						nodeTemp.setPrecede(curr);
						break;
					}
				}
				curr = nextNode;
				nextNode = nextNode.getNext();
			}
		}
		return head;
	}
}
