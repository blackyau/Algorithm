/*
class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long max = 0;
        for(int j : chalk) max += j;
        k = (int)(k % max);
        for(int i = 0; i < chalk.length; i++){
            k -= chalk[i];
            if(k < 0) return i;
        }
        return -1;
    }
}
 */
public class LeetCode_1894 {
    public static void main (String[] args) {
        System.out.println("LeetCode_1894_找到需要补充粉笔的学生编号 看注释咯");
    }
}
