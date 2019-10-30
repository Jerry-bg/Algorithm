package tree;

/*
二叉树的最大深度
*/

import model.TreeNode;

public class LeetCode_104 {
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }
}
