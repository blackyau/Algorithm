/*
// 递归写法
class Solution {
    int[] ans = new int[38];
    public int tribonacci(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        if(n == 2) return 1;
        if(ans[n] != 0) return ans[n];
        ans[n] = tribonacci(n-1) + tribonacci(n-2) + tribonacci(n-3);
        return ans[n];
    }
}

// 动态规划写法
class Solution {
    public int tribonacci(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        if(n == 2) return 1;
        int a = 0, b = 1, c = 1, d = 0;
        for(int i = 3; i <= n; i++){
            d = a + b + c;
            a = b;
            b = c;
            c = d;
        }
        return c;
    }
}
 */
public class LeetCode_1137 {
    public static void main (String[] args) {
        System.out.println("LeetCode_1137_第 N 个泰波那契数 看注释咯");
    }
}
