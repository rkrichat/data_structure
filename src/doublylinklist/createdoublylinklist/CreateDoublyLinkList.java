package doublylinklist.createdoublylinklist;

import doublylinklist.doublelink.DoubleLink;
/**
 * This class for create Doubly Link list. :: 20/03/2017
 * @author rkritchat
 *
 */
public class CreateDoublyLinkList {
	public static void main(String[] agrs){
		DoubleLink head = null;
		String[] data = {"First","Second","Third","Fourth","fifth"};
		head = initNode(head, data);
		showMessage(head);
	}
	/**
	 * This method for crate and connect Doubly Link List. :: 20/03/2017
	 * @param head
	 * @param item
	 * @return
	 */
	protected static DoubleLink createDoubleLink(DoubleLink head,Object item){
		DoubleLink curr = head;
		DoubleLink prev = null;
		if(null == head){
			head = new DoubleLink(item);
		}else{
			DoubleLink temp = new DoubleLink(item);
			while(curr!=null){
				prev = curr;
				curr = curr.getNext();
			}
			prev.setNext(temp);
			temp.setPrecede(prev);
		}
		return head;
	}
	
	/**
	 * This method for initialize Doubly Link List. :: 20/03/2017 
	 * @param head
	 * @param data
	 * @return head
	 */
	protected static DoubleLink initNode(DoubleLink head, String[] data){
		for(int index=0;index<data.length;index++){
			head = createDoubleLink(head, data[index]);
		}
		return head;
	}
	
	/**
	 * This method for show Doubly Link list. :: 20/03/2017
	 * @param head
	 */
	protected static void showMessage(DoubleLink head){
		DoubleLink curr = head;
		String war = "|";
		while(curr!=null){
			System.out.println();
			showBox(curr.getPrecede(),war);
			System.out.print(curr.getItem() + war);
			showBox(curr.getNext(),war);
			System.out.println();
			curr=curr.getNext();
		}
	}
	
	/**
	 * This method for show precede's value or next's value with war |. :: 20/03/2017
	 * @param node
	 * @param war
	 */
	private static void showBox(DoubleLink node,String war){
		if(null != node){
			System.out.print(node.getItem() + war);
		}else{
			System.out.print("NULL" + war);
		}
	}
}
