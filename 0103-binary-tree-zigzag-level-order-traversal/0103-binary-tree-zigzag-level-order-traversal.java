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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        ArrayList<List<Integer>> list = new ArrayList<>();
        levelorder(list, root, 0);
        return list;
    }
    public static void levelorder(ArrayList<List<Integer>> list, TreeNode root, int level){
        if(root==null){
            return;
        }
        if(list.size()<=level){
            LinkedList<Integer> newlevel = new LinkedList<>();
            list.add(newlevel);
        }
        if(level%2==0){
            list.get(level).add(root.val);
        }
        else{
            list.get(level).add(0,root.val);
        }
        levelorder(list,root.left,level+1);
        levelorder(list,root.right,level+1);
    }
}