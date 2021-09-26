/*
class Solution {
    public int getSum(int a, int b) {
        int ans = 0;
        for(int i = 0, t = 0; i < 32; i++){
            int n1 = (a >> i) & 1, n2 = (b >> i) & 1;
            if(n1 == 1 && n2 == 1){
                ans |= (t << i);
                t = 1;
            }else if(n1 == 1 || n2 == 1){
                ans |= ((1 ^ t) << i);
            }else{
                ans |= (t << i);
                t = 0;
            }
        }
        return ans;
    }
}
 */
public class LeetCode_371 {
    public static void main (String[] args) {
        System.out.println("LeetCode_371_两整数之和 看注释咯");
    }
}
