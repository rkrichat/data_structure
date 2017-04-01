package doublylinklist.deletedoublylinklist;

import doublylinklist.createdoublylinklist.CreateDoublyLinkList;
import doublylinklist.doublelink.DoubleLink;

/**
 * This Class for deelte Node from Links List :: 25/03/2017
 * @author rkritchat
 *
 */
public class DeleteDoublyLinkList extends CreateDoublyLinkList{
	public static void main(String[] args){
		DoubleLink head = null;
		String[] data = {"First","Second","Third"};
		head = initNode(head,data);
		head = deleteLinkList(head,"Second");
		showMessage(head);
	}
	
	/**
	 * This method for delete Node from doubly LinksList :: 25/03/2017
	 * @param head
	 * @param target
	 * @return head
	 */
	private static DoubleLink deleteLinkList(DoubleLink head, String target){
		DoubleLink curr = head;
		DoubleLink prev = null;
		DoubleLink nextNode = null;
		if(target.equals(head.getItem())){
			curr = head.getNext();
			prev = head;
			prev.setNext(null);
			curr.setPrecede(null);
			head = curr;
		}else{
			while(curr!=null){
				if(target.equals(curr.getItem()) && null!=curr.getNext()){
					nextNode = curr.getNext();
					prev.setNext(nextNode);
					nextNode.setPrecede(prev);
					curr.setNext(null);
					curr.setPrecede(null);
					break;
				}else if(target.equals(curr.getItem())){
					prev.setNext(null);
					curr.setPrecede(null);
				}
				prev = curr;
				curr = curr.getNext();
			}
		}
		return head;
	}
}
