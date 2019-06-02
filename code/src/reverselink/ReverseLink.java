package reverselink;

/**
 * @package: reverselink
 * @className: ReverseLink
 * @description: 链表翻转
 * @author: Shuyu.Wang
 * @date: 2019-06-02 19:52
 * @since: 0.1
 **/

public class ReverseLink {

	public static LinkNode reverseLink(LinkNode linkNode){
		//翻转后的头结点
		LinkNode reversedHead=null;
		//当前结点
		LinkNode pNode=linkNode;
		//当前结点的前一个结点
		LinkNode preNode=null;
        //当前结点不为空
		while (pNode!=null){
			//下一个结点
			LinkNode pNext=pNode.next;
			if (pNext==null){
				//下一个结点为空，说明当前结点是链表的最后一个结点
				reversedHead=pNode;
			}

			preNode=pNode;
			//将下一个结点赋值给当前结点，相当于链表后移
			pNode=pNext;

		}
		return reversedHead;
	}

	public static void main(String[] args) {
		LinkNode head1 = new LinkNode(1);
		LinkNode  head2 = new LinkNode(2);
		LinkNode  head3 = new LinkNode(3);
		LinkNode  head4 = new LinkNode(4);
		LinkNode  head5 = new LinkNode(5);
		head1.next=head2;
		head2.next=head3;
		head3.next=head4;
		head4.next=head5;

		LinkNode reverseLink = reverseLink(head1);
		System.out.println(reverseLink.data);
	}
}
