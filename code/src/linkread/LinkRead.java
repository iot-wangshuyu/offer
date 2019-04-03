package linkread;

import java.util.Stack;

/**
 * @package:PACKAGE_NAME
 * @className:
 * @description:
 * @author:Shuyu.Wang
 * @date:2019-04-03 16:12
 * @version:V1.0
 **/

public class LinkRead {

    public static void readLinkReverse(LinkNode linkNode) {
        if (linkNode == null) {
            System.out.println("link is null");
        }
        if (linkNode.next == null) {
            System.out.println(linkNode.data);
        }
        Stack<Integer> stack = new Stack<>();
        stack.push(linkNode.data);
        LinkNode temp = linkNode.next;
        while (temp != null) {
            stack.push(temp.data);
            temp = temp.next;
        }

        while (!stack.empty() && stack.peek() != null) {
            if (!stack.empty()) {
                System.out.println(stack.peek());
                stack.pop();
            }
        }
    }

    public static void main(String[] args) {
        LinkNode linkNode = new LinkNode(2);
        linkNode.next = new LinkNode(4);

        LinkNode linkNode2 = new LinkNode(6);
        linkNode2.next = linkNode;

        readLinkReverse(linkNode2);
    }

}
