/*
class Solution {
    public int findComplement(int num) {
        int res = 0;
        for(int i = 31; i >= 0; i--){
            if(((num >> i) & 1) == 1){
                res = i;
                break;
            }
        }
        int ans = 0;
        for(int i = 0; i < res; i++){
            if(((num >> i) & 1) == 0){
                ans |= (1 << i);
            }
        }
        return ans;
    }
}
 */
public class LeetCode_476 {
    public static void main (String[] args) {
        System.out.println("LeetCode_476_数字的补数 看注释咯");
    }
}
