import java.util.Scanner;

public class UVa133 {
//    https://onlinejudge.org/external/1/133.pdf
//    https://onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=3&page=show_problem&problem=69
//    2021-07-23 13:32:40 Accepted， Run Time: 0.080
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int m = sc.nextInt();
            if(n==0 && k==0 && m==0)break;
            else fun(n ,k, m);
        }

    }
    public static void fun(int n, int k, int m){
        int[] list = new int[21];  // 0 位置不用编号从 1 开始
        list[0] = -1;  // 0 位置直接标记为已经走过
        int k_now = 0, m_now = n+1, count = 0;
        while(count++ != n){
            k_now = go(list, n, k_now, k, 1);
            m_now = go(list, n, m_now, m, -1);
            System.out.printf("%3d", k_now);
            list[k_now] = -1;
            if(k_now != m_now){
                count++;
                list[m_now] = -1;
                System.out.printf("%3d", m_now);
            }
            if(count != n) System.out.print(",");
        }
        System.out.println();
    }
    public static int go(int[] list, int n, int now, int step_all, int step){  // 返回刚刚走了哪一步
        while(step_all-- != 0){
            do{
                now = (now + step + n + 1) % (n+1);  // 括号里面的 +n+1 是为了顺时针转的所用的，因为从 0 再 -1 的话就要回到 n 才行
            }while(list[now] == -1);
        }
        return now;
    }
}
