package subtree;

/**
 * @package: subtree
 * @className: SubTree
 * @description: 判断B树是否是A的子结构
 * @author: Shuyu.Wang
 * @date: 2019-06-09 19:25
 * @since: 0.1
 **/

public class SubTree {

	public static Boolean hasSubTree(TreeNode t1,TreeNode t2){
		boolean result=false;
		if (t1!=null&&t2!=null){
			if (t1.data==t2.data){
				result=doesTree1HaveTree2(t1,t2);
			}
			if (!result){
				result=hasSubTree(t1.leftTree,t2);
			}
			if (!result){
				result=hasSubTree(t1.rightTree,t2);
			}
		}
		return result;
	}

	public static boolean doesTree1HaveTree2(TreeNode t1,TreeNode t2){
		if (t1==null){
			return true;
		}
		if (t2==null){
			return true;
		}
		if (t1.data!=t2.data){
			return false;
		}
		return doesTree1HaveTree2(t1.leftTree,t2.leftTree)&&doesTree1HaveTree2(t1.rightTree,t2.rightTree);
	}

	public static void main(String[] args) {
		TreeNode treeNode9=new TreeNode(9);
		TreeNode treeNode2=new TreeNode(2);

		TreeNode treeNode8=new TreeNode(8);
		TreeNode treeNode7=new TreeNode(7);
		TreeNode root=new TreeNode(8);

		treeNode8.leftTree=treeNode9;
		treeNode8.rightTree=treeNode2;

		root.leftTree=treeNode8;
		root.rightTree=treeNode7;

		TreeNode treeNodeB9=new TreeNode(9);
		TreeNode treeNodeB2=new TreeNode(2);
		TreeNode rootB=new TreeNode(8);
		rootB.leftTree=treeNodeB9;
		rootB.rightTree=treeNodeB2;

		System.out.println(hasSubTree(root,rootB));

	}
}
