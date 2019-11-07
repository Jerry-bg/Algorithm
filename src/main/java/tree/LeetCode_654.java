package tree;

import model.TreeNode;

public class LeetCode_654 {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return method(nums,0,nums.length);
    }

    private TreeNode method(int[] nums,int s,int e){
        if(s==e) return null;

        int index=getMax(nums,s,e);

        TreeNode root=new TreeNode(nums[index]);
        if(index>=s) root.left=method(nums,s,index);
        if(index+1<e) root.right=method(nums,index+1,e);
        return root;
    }

    private int getMax(int[] nums,int s,int e){
        int r=nums[s],index=s;
        for (int i=s+1;i<e;i++){
            if(r<nums[i]) {
                r = nums[i];
                index = i;
            }
        }
        return index;
    }
}
