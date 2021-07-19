public class LeetCode_239 {
// https://leetcode-cn.com/problems/sliding-window-maximum/
/*
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
            int len = nums.length;
            if(len==0) return nums;
            LinkedList<Integer> qmax = new LinkedList<Integer>();
            int[] res = new int[len - k + 1];
            int index = 0;
            for(int i = 0; i < len; i++){
                while(!qmax.isEmpty() && nums[qmax.peekLast()] <= nums[i]){
                    qmax.pollLast();
                }
                qmax.addLast(i);
                if(qmax.peekFirst() == i - k){
                    qmax.pollFirst();
                }
                if(i >= k - 1){
                    res[index++] = nums[qmax.peekFirst()];
                }
            }
            return res;
    }
}
 */
    public static void main (String[] args) {
        System.out.println("LeetCode_239_滑动窗口最大值 看注释咯");
    }
}
