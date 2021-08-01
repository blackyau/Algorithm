import java.util.Scanner;

public class iflytek2020_1 {
/*
https://www.nowcoder.com/discuss/479259
d[0] = 0
d[1] = 3
d[2] = d[0] + d[1]
一只铁杆顶端，有一只蜗牛。第一天先滑落当前距离的一半，再滑落3米，第二天先滑落当前距离的一半，再滑落3米，第三天先滑落当前距离的一半，再滑落6米，
第四天先滑落当前距离的一半，再滑落9米，第五天先滑落当前距离的一半，再滑落15米。
以此内推，直至滑落到地面。给定滑落到地面的天数，求铁杆的最大高度（不会大于4G）。
输入描述：一个数字，表明滑落至地面的天数，小于36
输出描述：一个数字，表明铁杆最大的高度
 */
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int[] d = new int[day + 1];
        d[1] = 3;
        for(int i = 2; i < day + 1; i++){
            d[i] = d[i-1] + d[i-2];
        }
        long res = d[day];
        for(int i = day; i > 0; i--){
            res *= 2;
            res += d[day - i];
        }
        System.out.println(res);
    }
}
