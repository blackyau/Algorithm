/*
class Solution {
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        for(int i = 0; i < s.length(); i += 2*k){
            int j = i + k - 1;
            reverse(arr, i, Math.min(j, s.length() - 1));
        }
        return String.valueOf(arr);
    }
    void reverse(char[] arr, int i, int j){
        while(i<j){
            char tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
            i++;
            j--;
        }
    }
}
 */
public class LeetCode_541 {
    public static void main (String[] args) {
        System.out.println("LeetCode_541_反转字符串 II 看注释咯");
    }
}
