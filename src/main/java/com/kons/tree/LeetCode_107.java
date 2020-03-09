package tree;

import model.TreeNode;

import java.util.*;

public class LeetCode_107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> lists=new ArrayList<>();
        if(root==null) return lists;
        StringBuilder sb=new StringBuilder();
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);

        boolean isTurn=false;
        while (!queue.isEmpty()){
            int len=queue.size();
            List<Integer> list=new ArrayList<>(len);
            for (int i=0;i<len;i++) {
                TreeNode treeNode = queue.poll();
                list.add(treeNode.val);
                if (treeNode.left != null)
                    queue.add(treeNode.left);
                if (treeNode.right != null)
                    queue.add(treeNode.right);
            }
            if(isTurn){
                List<Integer> temp=new ArrayList<>();
                for (int i=list.size()-1;i>=0;i--)
                    temp.add(list.get(i));
                list=temp;
            }
            isTurn=isTurn?false:true;
            lists.add(list);
        }
        return lists;
    }
}
