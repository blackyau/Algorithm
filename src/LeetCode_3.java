public class LeetCode_3 {
//    https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/
/*
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) return 0;
        int maxLen = 0; // 当前最大子串长度
        int left = 0; // 滑动窗口的左边
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i=0; i<s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                left = Math.max(left, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);
            maxLen = Math.max(maxLen, i - left + 1);
        }
        return maxLen;
    }
}
 */
    public static void main (String[] args) {
        System.out.println("LeetCode_3_无重复字符的最长子串 看注释咯");
    }
}
