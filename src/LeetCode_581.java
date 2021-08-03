public class LeetCode_581 {
/*
class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        // // left 初值比 right 大1就行了，1000和999都行，因为如果是升序数组，需要返回0.如果不是升序数组，left和right肯定会被赋值。
        int left = 0, right = -1;
        for(int i = 0, j = nums.length - 1; i < nums.length; i++, j--){
            if(nums[i] >= max) max = nums[i];
            else right = i;

            if(nums[j] <= min)  min = nums[j];
            else left = j;
        }
        return right - left + 1;
    }
}
 */
    public static void main (String[] args) {
        System.out.println("LeetCode_581_最短无序连续子数组 看注释咯");
    }
}
