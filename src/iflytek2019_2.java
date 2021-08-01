import java.util.ArrayList;
import java.util.Scanner;

public class iflytek2019_2 {
/*
https://www.cnblogs.com/jlutiger/p/10462724.html
科大讯飞2019暑期实习笔试题
杀手
有n个杀手排成一行，每个杀手都有一个不同的编号（编号为1-n），在每个夜晚，杀手都会行动，
如果某个杀手编号大于他右边的杀手的编号，他就会杀死他右边的杀手，杀手的行动是瞬间的，因此一个人可能某一个演完既杀死了别人，又被别人杀死了，
例如3,2,1这个顺序，在第一个夜晚2会杀死1，同时3会杀死2.显然易见，一段时间之后，就不会有人杀死或者被杀了，平安夜也就来了，请问在平安夜之前有多少个夜晚？
输入：
第一行是一个整数n（1<=n<=100000）,表示杀手的数量。 接下来一行有n个数，是一个1-n的全排列。
输出：
输出包含一个整数，表示平安夜之前经历个多少了夜晚。

示例：
样例输入：
10
10 9 7 8 6 5 3 4 2 1
样例输出：
2
 */
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for(int i = 0; i < n; i++) nums.add(sc.nextInt());
        int count = 0;
        while (nums.size() > 1){
            int size = nums.size();
            for(int i = nums.size() - 1; i > 0; i--){
                if(nums.get(i-1) > nums.get(i)){
                    nums.remove(i);
                }
            }
            if(size != nums.size()){
                count++;
            }else{
                break;
            }
        }
        System.out.println(count);
    }
}
