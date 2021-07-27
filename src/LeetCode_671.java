public class LeetCode_671 {
//    https://leetcode-cn.com/problems/second-minimum-node-in-a-binary-tree/
/*
class Solution {
    int[] min_list = new int[2];  // 左边是根节点，右边是寻找的目标节点
    public int findSecondMinimumValue(TreeNode root) {
        if(root.left == null) return -1;
        min_list[0] = root.val;
        min_list[1] = -1;
        f(root);
        if(min_list[0] == min_list[1]) return -1;
        else return min_list[1];
    }
    public void f(TreeNode root){
        if(root == null) return;
        if(min_list[1] != -1 && root.val > min_list[1]) return;
        if(root.val > min_list[0]) min_list[1] = root.val;
        f(root.left);
        f(root.right);
    }
}
 */
    public static void main (String[] args) {
        System.out.println("LeetCode_671_二叉树中第二小的节点 看注释咯");
    }
}
