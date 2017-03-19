package linklist.createlinklist;

import linklist.node.Node;
/**
 * This class for crate Node and connect Node 19/03/2017
 * @author rkritchat
 *
 */
public class createLinkList {
	public static void main(String[] args){
		Node head=null;
		for(int index=0;index<10;index++){
			head = createNode(head,index);
		}
		showMessage(head);
	}
	
	/**
	 * This method for create Node :: 19/03/2017
	 * @param head
	 * @return Node
	 */
	private static Node createNode(Node head,Object obj){
		if(null==head){
			head = new Node(0);
		}else{
			Node tempNode = new Node(obj);
			Node cur = head;
			Node prev = cur;
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
	private static void showMessage(Node head){
		Node prev = head;
		while(prev!=null){
			System.out.println(prev.getItem());
			prev = prev.getNext();
		}
	}
}
