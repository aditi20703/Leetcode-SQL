/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> preorder (TreeNode root){
        List<Integer>l=new ArrayList<>();
        if(root == null){
            l.add(null);
        return l;
        }
        l.add(root.val);
        l.addAll(preorder(root.left));
        l.addAll(preorder(root.right));
        return l;

    }


    public boolean isSameTree(TreeNode p, TreeNode q) {
        return preorder(p).equals(preorder(q));

        
    }
}