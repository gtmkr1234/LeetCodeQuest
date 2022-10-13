class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> lst = new ArrayList<>();
        fun(root, lst);
        return lst;
    }
    public static void fun(TreeNode root, ArrayList<Integer> lst){
        if(root==null)
        return;
        fun(root.left,lst);
        lst.add(root.val);
        fun(root.right, lst);
    }  
}
