package linklist.createlinklist;

import linklist.node.Node;
/**
 * This class for crate Node and connect Node 19/03/2017
 * @author rkritchat
 *
 */
public class CreateLinkList {
	public static void main(String[] args){
		Node head=null;
		head = initNode(head,5);
		showMessage(head);
	}
	
	/**
	 * This method for create Node :: 19/03/2017
	 * @param head
	 * @return Node
	 */
	protected static Node createNode(Node head,Object obj){
		if(null==head){
			head = new Node(0);
		}else{
			Node tempNode = new Node(obj);
			Node cur = head;
			Node prev = null;
			while(null!=cur){
				prev = cur;
				cur = cur.getNext();
			}
			prev.setNext(tempNode);
		}
		return head;
	}
	
	/**
	 * Show message from Node :: 19/03/2017
	 * @param head
	 */
	protected static void showMessage(Node head){
		Node curr = head;
		while(curr!=null){
			System.out.println(curr.getItem());
			curr = curr.getNext();
		}
	}
	
	/**
	 * initialize Node.
	 * @param head
	 * @param length
	 * @return Node
	 */
	protected static Node initNode(Node head,int length){
		for(int index=0;index<length;index++){
			head = createNode(head,index);
		}
		return head;
	}
}
