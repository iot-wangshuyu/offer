package tree;/**
 * 应用模块名称<p>
 * 代码描述<p>
 * Copyright: Copyright (C) 2019 XXX, Inc. All rights reserved. <p>
 * Company公司<p>
 *
 * @author wang_
 * @since 2019/4/13 20:36
 */

/**
 * @package:tree
 * @className:
 * @description:
 * @author:Shuyu.Wang
 * @date:2019-04-13 20:36
 * @version:V1.0
 **/

public class Solution {
    public static TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        if (pre.length == 0 || in.length == 0) {
            return null;
        }
        return constructBinaryTree(pre, 0, pre.length - 1, in, 0, in.length - 1);
    }

    /**
     * @author:shuyu.wang
     * @description:
     * @date: 2019/4/13 20:40
     * @param: pre 前序遍历顺序
     * ps 前序遍历开始下标
     * pe 前序遍历结束下标
     * @param: in 中序遍历顺序
     * is 中序遍历开始下标
     * ie 中序遍历结束下标
     * @return: null
     */
    public static TreeNode constructBinaryTree(int[] pre, int ps, int pe, int[] in, int is, int ie) {
        if (ps > pe || is > ie) {
            return null;
        }
        //二叉树根节点
        TreeNode root = new TreeNode(pre[ps]);
        for (int i = is; i <= ie; i++) {
            //找到中序遍历中等于根节点的位置，分出左子树和右子树，然后递归
            if (in[i] == pre[ps]) {
                root.left = constructBinaryTree(pre, ps + 1, ps + i - is, in, is, i - 1);
                root.right = constructBinaryTree(pre, ps + i - is + 1, pe, in, i + 1, ie);
                break;
            }
        }
        return root;
    }

    public static void main(String[] args) {
        // 二叉树的先序序列
        int[] preOrder = {1, 2, 4, 7, 3, 5, 6, 8};
        // 二叉树的中序序列
        int[] inOrder = {4, 7, 2, 1, 5, 3, 8, 6};
        TreeNode root = reConstructBinaryTree(preOrder, inOrder);

        PrintTree.printTree(root); // 后序打印二叉树
    }
}
