public class LeetCode_802 {
/*
class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        int[] flag = new int[n];  // 0:该节点未被访问，1节点位于递归栈中或者在某个环上，2节点搜索完毕是个安全节点
        List<Integer> ans = new ArrayList<Integer>();
        for(int i = 0; i < n; ++i){
            if(safe(graph, flag, i)){
                ans.add(i);
            }
        }
        return ans;
    }
    public boolean safe(int[][] graph, int[] flag, int x){
        if(flag[x] > 0) return flag[x] == 2;
        flag[x] = 1;
        for(int y : graph[x]){
            if(!safe(graph, flag, y)){
                return false;
            }
        }
        flag[x] = 2;
        return true;
    }
}
 */
    public static void main (String[] args) {
        System.out.println("LeetCode_802_找到最终的安全状态 看注释咯");
    }
}
