/*
class Solution {
    public String findLongestWord(String s, List<String> dictionary) {
        Collections.sort(dictionary, (a,b)->{
            if(a.length() != b.length()) return b.length() - a.length();
            return a.compareTo(b);
        });
        for(String str : dictionary){
            int i = 0, j = 0;
            while(i < s.length() && j < str.length()){
                if(s.charAt(i) == str.charAt(j)) j++;
                i++;
            }
            if(j == str.length()) return str;
        }
        return "";
    }
}
 */
public class LeetCode_524 {
    public static void main (String[] args) {
        System.out.println("LeetCode_524_通过删除字母匹配到字典里最长单词 看注释咯");
    }
}
