/*
class Solution {
    public int countArrangement(int n) {
        int mask = 1 << n;  // 创造出 n 个位置
        int [][] dp = new int[n+1][mask];
        dp[0][0] = 1;
        for(int i = 1; i <= n; i++){
            for(int state = 0; state < mask; state++){  // 枚举所有排列的情况
                for(int k = 1; k <= n; k++){  // 枚举第 N 个整数的数
                    if((state >> (k-1) & 1) == 0) continue;  // state 中的第 k 位要是 1
                    if(k % i != 0 && i % k != 0) continue;   // 题目的要求，要能整除
                    dp[i][state] += dp[i-1][state & (~(1<<(k-1)))];  // 把第 k 位置零取得上一步的状态
                }
            }
        }
        return dp[n][mask - 1];
    }
}
 */
public class LeetCode_526 {
    public static void main (String[] args) {
        System.out.println("LeetCode_526_优美的排列 看注释咯");
    }
}
