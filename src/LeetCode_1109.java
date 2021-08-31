/*
class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] ans = new int[n];
        for(int[] i : bookings){
            ans[i[0] - 1] += i[2];
            if(i[1] < n)
                ans[i[1]] -= i[2];
        }
        for(int i = 1; i < ans.length; i++){
            ans[i] += ans[i - 1];
        }
        return ans;
    }
}
 */
public class LeetCode_1109 {
    public static void main (String[] args) {
        System.out.println("LeetCode_1109_航班预订统计 看注释咯");
    }
}
