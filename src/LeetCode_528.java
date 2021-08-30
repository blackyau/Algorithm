/*
class Solution {
    int[] sum;
    public Solution(int[] w) {
        sum = new int[w.length + 1];
        for(int i = 1; i <= w.length; i++)
            sum[i] = sum[i - 1] + w[i - 1];
    }

    public int pickIndex() {
        int num = (int)(Math.random() * sum[sum.length - 1]) + 1;
        int l = 1, r = sum.length - 1;
        while(l < r){
            int mid = l + r + 1 >> 1;
            if(sum[mid] < num){
                l = mid;
            }else{
                r = mid - 1;
            }
        }
        return sum[r] < num ? r : r - 1;
    }
}
 */
public class LeetCode_528 {
    public static void main (String[] args) {
        System.out.println("LeetCode_528_按权重随机选择 看注释咯");
    }
}
