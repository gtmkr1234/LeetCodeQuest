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
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList <Integer> res = new ArrayList<>();
        dfs(root,res);
        return res;
    }
    private void dfs(TreeNode root, List<Integer> list){
        if(root==null){
            return ;
        }
        list.add(root.val);
        dfs(root.left,list);
        dfs(root.right,list);
    }
}