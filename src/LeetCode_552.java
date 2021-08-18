/*
class Solution {
    int[][][] cache;
    int mod = (int)1e9+7;
    public int checkRecord(int n) {
        cache = new int[n+1][2][3];
        for(int[][] i: cache){
            for(int[] j: i){
                Arrays.fill(j, -1);
            }
        }
        return dfs(n, 0, 0);
    }
    int dfs(int last, int acount, int lcount){
        if(acount >= 2) return 0;
        if(lcount >= 3) return 0;
        if(last == 0) return 1;
        if(cache[last][acount][lcount] != -1) return cache[last][acount][lcount];
        int ans = 0;
        ans += dfs(last - 1, acount + 1, 0) % mod;  // 下一步放A，因为题目要求的是连续，所以决定放了 A 的话 L 就是 0 了
        ans = (ans + dfs(last - 1, acount, lcount + 1)) % mod;  // 下一步放L
        ans = (ans + dfs(last - 1, acount, 0)) % mod;  // 下一步放P，因为题目要求的是连续，所以决定放了 P 的话 L 就是 0 了
        cache[last][acount][lcount] = ans;
        return ans;
    }
}
 */
public class LeetCode_552 {
    public static void main (String[] args) {
        System.out.println("LeetCode_552_学生出勤记录 II 看注释咯");
    }
}
