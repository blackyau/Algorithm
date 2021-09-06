/*
class Solution {
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while(l <= r){
            int mid = (l + r) / 2;
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] > target)
                r = mid - 1;
            else
                l = mid + 1;
        }
        return -1;
    }
}
 */
public class LeetCode_704 {
    public static void main (String[] args) {
        System.out.println("LeetCode_704_二分查找 看注释咯");
    }
}
