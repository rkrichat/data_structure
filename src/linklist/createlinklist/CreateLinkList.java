package linklist.createlinklist;

import linklist.node.Node;
/**
 * This class for crate Node and connect Node 19/03/2017
 * @author rkritchat
 *
 */
public class CreateLinkList {
	
	/**
	 * This method for create Node :: 19/03/2017
	 * @param head
	 * @return Node
	 */
	protected static Node<Integer> createNode(Node<Integer> head,int obj){
		if(null==head){
			head = new Node<Integer>(0);
		}else{
			Node<Integer> tempNode = new Node<Integer>(obj);
			Node<Integer> cur = head;
			Node<Integer> prev = null;
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
	protected static void showMessage(Node<Integer> head){
		Node<Integer> curr = head;
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
	protected static Node<Integer> initNode(Node<Integer> head,int length){
		for(int index=0;index<length;index++){
			head = createNode(head,index);
		}
		return head;
	}
}
