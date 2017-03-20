package linklist.insertlinklist;

import linklist.createlinklist.CreateLinkList;
import linklist.node.Node;
/**
 * This class for insert node on first,middle or last on Link list :: 20/03/2017
 * @author rkritchat
 *
 */
public class InsertNodeInLinkList extends CreateLinkList{
	public static void main(String[] args){
		Node<Integer> head = null;
		head = initNode(head,5);
		Node<Integer> newLinkList = new Node<Integer>(99);
		head = insertLinkList(head,newLinkList,2); //insert before item is 2 or last.
		showMessage(head);
	}
	
	/**
	 * Insert link list on item or on last. :: 20/03/2017
	 * @param head
	 * @param newNode
	 * @param item
	 * @return head
	 */
	protected static Node<Integer> insertLinkList(Node<Integer> head,Node<Integer> newNode,Object item){
		Node<Integer> cur = head;
		Node<Integer> prev = null;
		boolean found=false;
		while(cur!=null){
			if(cur.getItem()==item && cur==head){
				newNode.setNext(cur);
				head = newNode;
				found=true;
				break;
			}else if(cur.getItem()==item){
				prev.setNext(newNode);
				newNode.setNext(cur);
				found=true;
				break;
			}else{
				prev = cur;
				cur = cur.getNext();
			}
		}
		
		if(!found){ // add new node to last Link list
			prev.setNext(newNode);
		}
		return head;
	}
}
