public class LeetCode_997 {
// https://leetcode-cn.com/problems/find-the-town-judge/
/*
class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] nums = new int[n + 1];  // nums[i] 这个人被多少人信任
        for(int[] i : trust){
            nums[i[0]]--;
            nums[i[1]]++;
        }
        for(int i = 1 ;i <= n; i++)
            if(nums[i] == n - 1) return i;
        return -1;
    }
}
 */
    public static void main (String[] args) {
        System.out.println("LeetCode_997_找到小镇的法官 看注释咯");
    }
}
