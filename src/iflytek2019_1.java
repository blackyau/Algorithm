import java.util.Arrays;
import java.util.Scanner;

public class iflytek2019_1 {
/*
https://www.cnblogs.com/jlutiger/p/10462724.html
科大讯飞2019暑期实习笔试题
改成绩
华老师的n个学生参加了一次模拟测验，考出来的分数很糟糕，但是华老师可以将成绩修改为[0,100]中的任意值，所以他想知道，如果要使所有人的成绩的平均分不少于X分，至少要改动多少个人的分数？
输入:
第一行一个数T，共T组数据（T≤10）
接下来对于每组数据：
第一行两个整数n和X。（1≤n≤1000, 0≤X≤100）
第二行n个整数，第i个数Ai表示第i个学生的成绩。（0≤Ai≤100）
输出：
共T行，每行一个整数，代表最少的人数。

样例输入：
2
5 60
59 20 30 90 100
5 60
59 20 10 10 100
样例输出：
1 2
*/
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int[] nums = new int[n];
            for(int j = 0; j < n; j++) nums[j] = sc.nextInt();
            Arrays.sort(nums);
            f(nums, x);
        }
    }
    public static void f(int[] nums, int x){
        int sum = 0;
        for(int i : nums){
            sum += i;
        }
        int target = x * nums.length - sum;
        int i = 0;
        while(target > 0){
            target = target - (100 - nums[i]);
            i++;
        }
        System.out.println(i);
    }
}
