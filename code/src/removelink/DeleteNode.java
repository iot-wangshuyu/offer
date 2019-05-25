package removelink;

/**
 * @package: removelink
 * @className: DeleteNode
 * @description:
 * @author: Shuyu.Wang
 * @date: 2019-05-25 11:36
 * @since: 0.1
 **/

public class DeleteNode {

	public static void delNode(ListNode headNode,ListNode delNode){
		if (headNode==null||delNode==null){
			return;
		}
		//判断要删除的节点是不是尾节点
		if (delNode.pNext!=null){
			ListNode temp=delNode.pNext;
			delNode.value=temp.value;
			delNode.pNext=temp.pNext;
			temp=null;
			System.out.println("删除中间节点");
			//链表只有一个节点，要删除头结点
		}else if (headNode==delNode){
            delNode=null;
            headNode=null;
			System.out.println("删除头节点");
		}else {
			System.out.println("删除尾节点");
			ListNode temp=headNode;
			while (temp.pNext!=delNode){
				temp=temp.pNext;
			}
			temp.pNext=null;
			delNode=null;
		}

	}


	public static String GetPrintNodes(ListNode headNode)
	{
		if (headNode == null)
		{
			return null;
		}

		StringBuilder sbNodes = new StringBuilder();
		while(headNode != null)
		{
			sbNodes.append(headNode.value);
			headNode = headNode.pNext;
		}

		return sbNodes.toString();
	}

	public static void main(String[] args) {
		ListNode  head1 = new ListNode(1);
		ListNode  head2 = new ListNode(2);
		ListNode  head3 = new ListNode(3);
		ListNode  head4 = new ListNode(4);
		ListNode  head5 = new ListNode(5);

		head1.pNext = head2;
		head2.pNext = head3;
		head3.pNext = head4;
		head4.pNext = head5;
        delNode(head1,head5);
		System.out.println(GetPrintNodes(head1));
	}
}
