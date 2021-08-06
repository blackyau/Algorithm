/*
class Solution {
    public boolean canPartition(int[] nums) {
        int N = nums.length;
        int sum = 0;
        for(int i:nums) sum += i;
        int target = sum / 2;
        if(target * 2 != sum) return false;  // 元素和不为偶数，肯定不能平均分成 2 个
        int[] dp = new int[target + 1];
        for(int i = 0; i < N; i++){
            for(int j = target; j >= 0; j--){
                int no = dp[j];
                int yes = j >=  nums[i] ? dp[j - nums[i]] + nums[i] : 0;
                dp[j] = Math.max(no, yes);
            }
        }
        return dp[target] == target;
    }
}
 */
public class LeetCode_416 {
    public static void main (String[] args) {
        System.out.println("LeetCode_416_分割等和子集 看注释咯");
    }
}
