/*
class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        if(nums.length == 1) return 0;
        int ans = 0, diff = nums[1] - nums[0], count = 0;
        for(int i = 2; i < nums.length; i++){
            if(nums[i] - nums[i-1] != diff){
                diff = nums[i] - nums[i-1];
                count = 0;
            }
            else{
                count++;
            }
            ans += count;
        }
        return ans;
    }
}
 */
public class LeetCode_413 {
    public static void main (String[] args) {
        System.out.println("LeetCode_413_等差数列划分 看注释咯");
    }
}
