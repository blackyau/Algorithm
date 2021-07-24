public class LeetCode_1736 {
//    https://leetcode-cn.com/problems/latest-time-by-replacing-hidden-digits/
/*
class Solution {
    public String maximumTime(String time) {
        char[] res = time.toCharArray();
        if(res[0] == '?'){
            if(res[1] >= '4' && res[1] <= '9') res[0] = '1';
            else res[0] = '2';
        }

        if(res[1] == '?'){
            if(res[0] <= '1') res[1] = '9';
            else res[1] = '3';
        }

        if(res[3] == '?'){
            res[3] = '5';
        }

        if(res[4] == '?'){
            res[4] = '9';
        }
        return new String(res);
    }
}
 */
    public static void main (String[] args) {
        System.out.println("LeetCode_1736_替换隐藏数字得到的最晚时间 看注释咯");
    }
}
