public class LeetCode_113 {
//    https://leetcode-cn.com/problems/path-sum-ii/
/*
class Solution {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        dfs(root, targetSum);
        return res;
    }
    public void dfs(TreeNode root, int sum){
        if(root == null) return;
        sum = sum - root.val;
        path.add(root.val);
        if(root.left == null && root.right == null && sum == 0){
            res.add(new ArrayList<Integer>(path));
            path.remove(path.size() - 1);
            return;
        }
        dfs(root.left, sum);
        dfs(root.right, sum);
        path.remove(path.size() - 1);
    }
}

 */
    public static void main (String[] args) {
        System.out.println("LeetCode_113_路径总和II 看注释咯");
    }
}
