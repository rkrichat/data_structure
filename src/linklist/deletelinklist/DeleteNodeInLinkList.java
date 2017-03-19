package linklist.deletelinklist;

import linklist.createlinklist.CreateLinkList;
import linklist.node.Node;
/**
 * This class for delete object from Node 20/03/2017
 * @author rkritchat
 *
 */
public class DeleteNodeInLinkList extends CreateLinkList{
	public static void main(String[] args){
		Node head=null;
		head = initNode(head,5);
		head = deleteNode(head,2); //delete item == 2
		showMessage(head);
	}
	
	/**
	 * This method for deleteNode from single link list
	 * @param head
	 * @param item
	 * @return head
	 */
	private static Node deleteNode(Node head, Object item){
		Node cur = head;
		Node prev = null;
		while(cur!=null){
			if(cur.getItem()==item && cur==head){
				head = cur.getNext();
				cur.setNext(null);
				break;
			}else if(cur.getItem()==item){
				prev.setNext(cur.getNext());
				cur.setNext(null);
				break;
			}else{
				prev = cur;
				cur = cur.getNext();
			}
		}//end loop
		return head;
	}
}
