/*
class Solution {
    public int compress(char[] chars) {
        int i = 0, j = 0;
        while(i < chars.length){
            int idx = i; // 相同字符串的结尾
            while(idx < chars.length && chars[i] == chars[idx]) idx++;  // i 是相同字符的起始
            int count = idx - i;  // 相同字符的个数
            chars[j++] = chars[i];  // 把当前字符搬移到上一次 转换后 的最后面（因为字符的真实长度有缩小）
            if(count > 1){
                String num = String.valueOf(count);
                for(int t = 0; t < num.length(); t++){
                    chars[j++] = num.charAt(t);
                }
            }
            i = idx;  // 把这次相同字符的最后一位赋给 i，让 i 继续往后遍历
        }
        return j;
    }
}
 */
public class LeetCode_443 {
    public static void main (String[] args) {
        System.out.println("LeetCode_443_压缩字符串 看注释咯");
    }
}
