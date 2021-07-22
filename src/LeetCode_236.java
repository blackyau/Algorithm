public class LeetCode_236 {
//    https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-tree/
/*
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null)
            return null;
        if(root == p || root == q)
            return root;
        TreeNode left =  lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if(left == null)   return right;
        if(right == null)  return left;
        if(left != null && right != null)  return root;  // p和q在两侧
        return null; // 必须有返回值
    }
};
 */
    public static void main (String[] args) {
        System.out.println("LeetCode_239_滑动窗口最大值 看注释咯");
    }
}
