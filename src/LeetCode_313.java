/*
class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int[] ans = new int[n];
        int[] p = new int[primes.length];
        int[] value = new int[primes.length];
        ans[0] = 1;
        for(int i = 1; i < n; i++){
            int t = Integer.MAX_VALUE;
            for(int j = 0; j < p.length; j++){
                value[j] = ans[p[j]] * primes[j];
                t = Math.min(t, value[j]);
            }
            for(int j = 0; j < p.length; j++){
                if(t == value[j]) p[j] +=1;
            }
            ans[i] = t;
        }
        return ans[n-1];
    }
}
 */
public class LeetCode_313 {
    public static void main (String[] args) {
        System.out.println("LeetCode_264_丑数 II 看注释咯");
    }
}
