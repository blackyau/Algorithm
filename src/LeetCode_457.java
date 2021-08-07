/*
class Solution {
    public boolean circularArrayLoop(int[] nums) {
        if(nums.length == 0) return false;
        for(int i = 0; i < nums.length; i++){
            int fast, slow, lastFast, lastSlow;
            fast = slow = i;
            while(true){
                lastSlow = slow;
                slow = next(nums, slow);
                if(check(nums, slow, lastSlow) || lastSlow == slow){
                    setZero(nums, i);
                    break;
                }

                lastFast = fast;
                fast = next(nums, fast);
                if(check(nums, fast, lastFast) || lastFast == fast){
                    setZero(nums, i);
                    break;
                }

                lastFast = fast;
                fast = next(nums, fast);
                if(check(nums, fast, lastFast) || lastFast == fast){
                    setZero(nums, i);
                    break;
                }

                if(fast == slow) return true;
            }
        }
        return false;
    }
    public static int next(int[] nums, int i){
        return (i + nums[i] + 1000*nums.length) % nums.length;  // 保证返回值在 [0, nums.length) 之间
    }
    public static boolean check(int[] nums, int i, int j){
        // System.out.println("i:"+i+" j:"+j);
        if(nums[i] == 0 || nums[i] * nums[j] < 0) return true;
        else return false;
    }
    private void setZero(int[] nums, int i){
        int j;
        while (true) { // !(nums[j] == 0 || nums[i]*nums[j]<0)
            j = (i + nums[i] + 1000*nums.length) % nums.length;
            if (nums[j] == 0 || nums[i]*nums[j]<0) {
                nums[i] = 0;
                break;
            }
            nums[i] = 0;
            i = j;
        }
    }
}
 */
public class LeetCode_457 {
    public static void main(String[] args){
        System.out.println("LeetCode_457_环形数组是否存在循环 看注释咯");
    }
}