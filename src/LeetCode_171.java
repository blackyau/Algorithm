public class LeetCode_171 {
//    https://leetcode-cn.com/problems/excel-sheet-column-number/
/*
class Solution {
    public int titleToNumber(String columnTitle) {
        int num = 0;
        int deep = 1;
        for(int i=columnTitle.length() - 1; i>=0; i--){
            num += deep * (int)(columnTitle.charAt(i) - 'A' + 1);
            deep *= 26;
        }
        return num;
    }
}
 */
    public static void main (String[] args) {
        System.out.println("LeetCode_171_Excel表列序号 看注释咯");
    }
}
