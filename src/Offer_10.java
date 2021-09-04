/*
class Solution {
    public int fib(int n) {
        if(n < 2) return n;
        int a = 0, b = 1;
        for(int i = 2; i <= n; i++){
            int c = a + b;
            c %= (int)1e9+7;
            a = b;
            b = c;
        }
        return b;
    }
}
 */
public class Offer_10 {
    public static void main (String[] args) {
        System.out.println("剑指 Offer 10- I. 斐波那契数列 看注释咯");
    }
}
