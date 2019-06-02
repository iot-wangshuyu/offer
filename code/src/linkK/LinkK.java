package linkK;

import removelink.ListNode;

/**
 * @package: linkK
 * @className: LinkK
 * @description: 链表倒数第K个节点
 * @author: Shuyu.Wang
 * @date: 2019-06-02 12:20
 * @since: 0.1
 **/

public class LinkK {

	public static LinkNode getReciprocalK(LinkNode linkNode,int k){
		//头指针
		LinkNode head=linkNode;
		//与头指针相隔k的尾指针
		LinkNode behind=null;
		//让头指针与尾指针相隔距离为k
        for (int i=0;i<k-1;i++){
        	head=head.next;
		}
        behind=linkNode;
        //头指针和尾指针一同向下遍历，只到头指针到达链表尾节点
        while (head.next!=null){
        	head=head.next;
        	behind=behind.next;
		}
        return behind;
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

		LinkNode reciprocalK = getReciprocalK(head1, 4);
		System.out.println(reciprocalK.data);

	}
}
