/*
class Solution {
    public int balancedStringSplit(String s) {
        int ans = 0, d = 0;
        for (int i = 0; i < s.length(); ++i) {
            char ch = s.charAt(i);
            if (ch == 'L') {
                ++d;
            } else {
                --d;
            }
            if (d == 0) {
                ++ans;
            }
        }
        return ans;
    }
}
 */
public class LeetCode_1221 {
    public static void main (String[] args) {
        System.out.println("LeetCode_1221_分割平衡字符串 看注释咯");
    }
}
