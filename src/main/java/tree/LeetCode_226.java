package tree;

import model.TreeNode;

/*
翻转二叉树
 */
public class LeetCode_226 {
    public TreeNode invertTree(TreeNode root){
        if(root==null) return null;

        TreeNode leftTree=root.left;
        root.left=invertTree(root.right);
        root.right=invertTree(leftTree);

        return root;
    }
}
