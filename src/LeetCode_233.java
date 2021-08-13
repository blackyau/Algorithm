/*
class Solution {
    public int countDigitOne(int n) {
        int high = n; // 高位
        int low  = 0; // 低位
        int count = 0; // 多少个 1
        int cur = 0; // 当前位置
        int num = 1; // 现在是第几位
        while(high != 0 || cur != 0){
            cur = high % 10;  // 获取当前位
            high /= 10;  // 更新高位
            if(cur == 0) count += high * num;
            else if(cur == 1) count += high * num + low + 1;
            else count += (high + 1) * num;
            low = cur * num + low;  // 一趟结束,更新低位
            num *= 10;
        }
        return count;
    }
}
 */
public class LeetCode_233 {
    public static void main (String[] args) {
        System.out.println("LeetCode_233_数字 1 的个数 看注释咯");
    }
}
