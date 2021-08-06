import java.util.Scanner;
/*
https://www.nowcoder.com/discuss/697412
阿里巴巴 2021/08/04 笔试
人机测试是图灵测试的一个基本应用，现有一种人机测试是随机的给出两个三位数（不足三位添加了前导零），然后让用户在三十秒内输入较大的那个，若用户在三十秒内没有输入正确或者输入错误了三次，那就是没有通过测试，否则就算通过。
若用户输入正确之后继续进行输入，请忽略
现在请你写个程序来模拟这个人机测试的流程

第一行一个正整数 T，代表测试数据的组数
每组输入包括 31 行
数据的第一行给出两个以空格分隔的三位数
接下来 30 行，每行一个整数，如果改行为 0，表用户在这一秒没有输入，否则就是用户输入的数字，用户输入的数字为不超过 1000 的正整数
1 ≤ T ≤ 3

如果测试通过则输出 “Y”
如果测试不通过则输出 "N"
 */
public class Alibaba2021_08_04 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        short t = sc.nextShort();
        for(int i = 0; i < t; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int num = Math.max(a, b);
            int count = 0;  // 记录当前是第几次输入数字
            boolean flag = false;
            for(int j = 0; j < 30; j++){
                int tmp = sc.nextInt();
                if(tmp == 0) continue;
                if(tmp == num && count < 3) flag = true;
                else count++;
            }
            if(flag) System.out.println("Y");
            else System.out.println("N");
        }
    }
}
