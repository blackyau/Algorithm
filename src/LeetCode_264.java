/*
class Solution {
    public int nthUglyNumber(int n) {
        int[] nums = {2,3,5};
        Set<Long> set = new HashSet<Long>();
        Queue<Long> q = new PriorityQueue<Long>();
        set.add(1L);
        q.add(1L);
        for(int i = 1; i <= n; i++){
            long x = q.poll();
            if(i == n) return (int)x;
            for(int j : nums){
                long tmp = j * x;
                if(!set.contains(tmp)){
                    set.add(tmp);
                    q.add(tmp);
                }
            }
        }
        return -1;
    }
}

class Solution {
    public int nthUglyNumber(int n) {
        int[] ans = new int[n+1];
        ans[1] = 1;
        int p2 = 1, p3 = 1, p5 = 1;
        for(int i = 2; i <= n; i++){
            int t = Math.min(ans[p2] * 2, Math.min(ans[p3] * 3, ans[p5] * 5));
            if(t == ans[p2] * 2) p2++;
            if(t == ans[p3] * 3) p3++;
            if(t == ans[p5] * 5) p5++;
            ans[i] = t;
        }
        return ans[n];
    }
}
 */
public class LeetCode_264 {
    public static void main (String[] args) {
        System.out.println("LeetCode_264_丑数 II 看注释咯");
    }
}
