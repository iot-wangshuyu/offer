package mirrortree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @package: mirrortree
 * @className: MirrorTreeNode
 * @description:
 * @author: Shuyu.Wang
 * @date: 2019-06-30 13:47
 * @since: 0.1
 **/

public class MirrorTreeNode {

	public static BinaryTreeNode mirror(BinaryTreeNode node){
        //空值判断
		if (node==null||(node.left==null&&node.right==null)){
			return node;
		}
		BinaryTreeNode temp=node.left;
		node.left=node.right;
		node.right=temp;
		if (node.left!=null){
			mirror(node.left);
		}
		if (node.right!=null){
			mirror(node.right);
		}
		return node;
	}



	/**
	 * @Description: 自上而下，自左到右打印二叉树
	 * @author: shuyu.wang
	 * @date: 2019/6/30 14:13
	 * @param null
	 * @return null
	*/
	public static void printFromTopToBottom(BinaryTreeNode pTreeRoot){
		Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
		queue.offer(pTreeRoot);
		while(!queue.isEmpty()){
			BinaryTreeNode treeNode = queue.poll();
			if(treeNode.left!=null){
				queue.offer(treeNode.left);
			}
			if(treeNode.right!=null){
				queue.offer(treeNode.right);
			}
			System.out.println(treeNode.value);
		}

	}

	public static void main(String[] args) {
		BinaryTreeNode root=new BinaryTreeNode(1);
		BinaryTreeNode left1=new BinaryTreeNode(4);
		BinaryTreeNode right1=new BinaryTreeNode(5);
		BinaryTreeNode left=new BinaryTreeNode(3);
		left.left=left1;
		left.right=right1;
        root.left=left;

		BinaryTreeNode left2=new BinaryTreeNode(6);
		BinaryTreeNode right2=new BinaryTreeNode(9);
		BinaryTreeNode right=new BinaryTreeNode(7);

		right.left=left2;
		right.right=right2;
		root.right=right;

		printFromTopToBottom(mirror(root));

	}


}
