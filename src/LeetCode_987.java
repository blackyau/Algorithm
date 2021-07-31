public class LeetCode_987 {
//    https://leetcode-cn.com/problems/vertical-order-traversal-of-a-binary-tree/
/*
class Solution {
    HashMap<TreeNode, int[]> map = new HashMap<TreeNode, int[]>();  //  "Node": [row, col, val]
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        map.put(root, new int[]{0, 0, root.val});
        dfs(root);
        List<int[]> list = new ArrayList<>(map.values());
        Collections.sort(list, (a,b)->{
            if(a[1] != b[1]) return a[1] - b[1];
            if(a[0] != b[0]) return a[0] - b[0];
            return a[2] - b[2];
        });
        int n = list.size();
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0; i<n;){
            int j = i;
            List<Integer> tmp = new ArrayList<>();
            while(j < n && list.get(j)[1] == list.get(i)[1]) // 如果 j 在范围内，同时 j 和 i 处于同一列中
                tmp.add(list.get(j++)[2]);
            res.add(tmp);
            i = j;
        }
        return res;
    }
    public void dfs(TreeNode root){
        if (root == null) return ;
        int[] info = map.get(root);
        if (root.left != null) {
            map.put(root.left, new int[]{info[0] + 1, info[1] - 1, root.left.val});
            dfs(root.left);
        }
        if (root.right != null) {
            map.put(root.right, new int[]{info[0] + 1, info[1] + 1, root.right.val});
            dfs(root.right);
        }
    }
}
 */
    public static void main (String[] args) {
        System.out.println("LeetCode_987_二叉树的垂序遍历 看注释咯");
    }
}
