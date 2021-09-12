/*
class Solution {
    public boolean checkValidString(String s) {
        int min = 0, max = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                min++;
                max++;
            }else if(s.charAt(i) == ')'){
                min--;
                max--;
            }else{
                min--;
                max++;
            }
            min = Math.max(min, 0);
            if(min > max) return false;
        }
        if(min == 0) return true;
        else return false;
    }
}
 */
public class LeetCode_678 {
    public static void main (String[] args) {
        System.out.println("LeetCode_678_有效的括号字符串 看注释咯");
    }
}
