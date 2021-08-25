/*
class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> cur = new ArrayList<>();
    int[][] g;
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        g = graph;
        cur.add(0);  // 把 0 放入当前节点
        dfs(0);
        return ans;
    }
    void dfs(int u){
        if(u == g.length - 1){  // 当 n - 1 被添加到了路径中，说明这是一个可行解
            ans.add(new ArrayList<>(cur));
            return;
        }
        for(int i : g[u]){
            cur.add(i);
            dfs(i);
            cur.remove(cur.size() - 1);
        }
    }
}
 */
public class LeetCode_797 {
    public static void main (String[] args) {
        System.out.println("LeetCode_797_所有可能的路径 看注释咯");
    }
}
