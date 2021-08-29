/*
// 暴力
class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int ans = 0;
        // 从 0 开始遍历1、3、5..奇数长度的子数组
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j <= arr.length; j += 2) {
                // 判断不越界
                if (i + j - 1 < arr.length) {
                    for (int k = 0; k < j; k++) {
                        ans += arr[i + k];
                    }
                }
            }
        }
        return ans;
    }
}
 */
/*
// 前缀和
class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int ans  = 0;
        int[] sum = new int[arr.length + 1];
        for(int i = 1; i <= arr.length; i++)
            sum[i] = sum[i-1] + arr[i-1];
        for(int len = 1; len <= arr.length; len += 2){
            for(int l = 0; l + len - 1 < arr.length; l++){
                int r = l + len - 1;
                ans += sum[r + 1] - sum[l];
            }
        }
        return ans;
    }
}
 */
public class LeetCode_1588 {
    public static void main (String[] args) {
        System.out.println("LeetCode_1588_所有奇数长度子数组的和 看注释咯");
    }
}
