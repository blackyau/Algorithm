/*
class Solution {
    public String reverseVowels(String s) {

        int head = 0, tail = s.length() - 1;
        char[] arr = s.toCharArray();
        String target = "aeiouAEIOU";
        while(head < tail){
            char heada = arr[head];
            char taila = arr[tail];
            while(target.indexOf(String.valueOf(heada)) == -1 && head < tail){
                head++;
                heada = arr[head];
            }
            while(target.indexOf(String.valueOf(taila)) == -1 && head < tail){
                tail--;
                taila = arr[tail];
            }
            char tmp = arr[head];
            arr[head] = arr[tail];
            arr[tail] = tmp;
            head++;
            tail--;
        }
        return String.valueOf(arr);
    }
}
 */
public class LeetCode_345 {
    public static void main (String[] args) {
        System.out.println("LeetCode_345_反转字符串中的元音字母 看注释咯");
    }
}
