package mergeLink;

/**
 * @package: mergeLink
 * @className: MergeLink
 * @description:合并两个排序链表
 * @author: Shuyu.Wang
 * @date: 2019-06-09 17:06
 * @since: 0.1
 **/

public class MergeLink {

	/**
	 * @Description:
	 * @author: shuyu.wang
	 * @date: 2019/6/9 17:08
	 * @param: fLinkHead  第一个链表的头结点
	 * @param: sLinkNode  第二个链表的头结点
	 * @return: mergeLink.LinkNode  合并后的链表
	 */
	public static LinkNode mergeLink(LinkNode fLinkHead, LinkNode sLinkNode) {
		//预防空指针，增强代码鲁棒性
		if (fLinkHead == null) {
			return sLinkNode;
		} else if (sLinkNode == null) {
			return fLinkHead;
		}
		//合并后的链表
		LinkNode mergeedLink = null;
		//判断值大小，递归循环
		if (fLinkHead.data < sLinkNode.data) {
			mergeedLink = fLinkHead;
			mergeedLink.next = mergeLink(fLinkHead.next, sLinkNode);
		} else {
			mergeedLink = sLinkNode;
			mergeedLink.next = mergeLink(fLinkHead, sLinkNode.next);
		}
		return mergeedLink;
	}


    /**
     * @Description: 打印
     * @author: shuyu.wang
     * @date: 2019/6/9 17:19
     * @param: null
     * @return: null
    */
	public static String getPrintNodes(LinkNode headNode)
	{
		if (headNode == null)
		{
			return null;
		}
		StringBuilder sbNodes = new StringBuilder();
		while(headNode != null)
		{
			sbNodes.append(headNode.data);
			headNode = headNode.next;
		}
		return sbNodes.toString();
	}


	public static void main(String[] args) {
		LinkNode head1 = new LinkNode(1);
		LinkNode  head2 = new LinkNode(3);
		LinkNode  head3 = new LinkNode(5);
		LinkNode  head4 = new LinkNode(7);
		LinkNode  head5 = new LinkNode(9);
		head1.next=head2;
		head2.next=head3;
		head3.next=head4;
		head4.next=head5;


		LinkNode headS1 = new LinkNode(2);
		LinkNode  headS2 = new LinkNode(4);
		LinkNode  headS3 = new LinkNode(6);
		LinkNode  headS4 = new LinkNode(8);
		LinkNode  headS5 = new LinkNode(10);
		headS1.next=headS2;
		headS2.next=headS3;
		headS3.next=headS4;
		headS4.next=headS5;

		System.out.println(getPrintNodes(mergeLink(head1,headS1)));
	}


}
