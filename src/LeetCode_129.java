public class LeetCode_129 {
//    https://leetcode-cn.com/problems/sum-root-to-leaf-numbers/
/*
class Solution {
    public int sumNumbers(TreeNode root) {
        return find(root, 0);
    }
    public int find(TreeNode root, int sum){
        if(root == null) return 0;
        int value = 10 * sum + root.val;
        if(root.left == null && root.right == null){
            return value;
        }else{
            return find(root.left, value) + find(root.right, value);
        }
    }
}
 */
    public static void main (String[] args) {
        System.out.println("LeetCode_239_滑动窗口最大值 看注释咯");
    }
}
