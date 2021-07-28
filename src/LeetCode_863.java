public class LeetCode_863 {
//    https://leetcode-cn.com/problems/all-nodes-distance-k-in-binary-tree/
/*
class Solution {
    HashMap<Integer, TreeNode> map = new HashMap<Integer, TreeNode>();  // 节点值为 Key 的节点，value 为父节点
    List<Integer> res = new ArrayList<Integer>();
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
            fillMap(root);
            dfs(target, null, k, 0);
            return res;
    }
    public void fillMap(TreeNode node){
        if (node.left != null) {
            map.put(node.left.val, node);
            fillMap(node.left);
        }
        if (node.right != null) {
            map.put(node.right.val, node);
            fillMap(node.right);
        }
    }
    public void dfs(TreeNode target, TreeNode from, int k, int n){
        if(target == null) return;
        if(n == k){
            res.add(target.val);
            return;
        }
        if(target.left != from){  // 正在向左边搜索，不能又搜索回去了
            dfs(target.left, target, k, n+1);
        }
        if(target.right != from){
            dfs(target.right, target, k, n+1);
        }
        if(map.get(target.val) != from){
            dfs(map.get(target.val), target, k, n+1);
        }
    }
}
 */
    public static void main (String[] args) {
        System.out.println("LeetCode_863_二叉树中所有距离为 K 的结点 看注释咯");
    }
}
