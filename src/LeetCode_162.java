/*
// 遍历
class Solution {
    public int findPeakElement(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            boolean ok = true;
            if(i - 1 >= 0){
                if(nums[i-1] >= nums[i]) ok = false;
            }
            if(i + 1 < nums.length){
                if(nums[i+1] >= nums[i]) ok = false;
            }
            if(ok) return i;
        }
        return -1;
    }
}
 */
/*
// 二分
class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length == 1) return 0;
        int l = 0, r = nums.length - 1;
        while(l < r){
            int mid = l + r + 1 >> 1;
            if(nums[mid] > nums[mid-1]){
                l = mid;
            }else{
                r = mid - 1;
            }
        }
        return r;
    }
}
 */
public class LeetCode_162 {
    public static void main (String[] args) {
        System.out.println("LeetCode_162_寻找峰值");
    }
}
