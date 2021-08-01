import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
/*
https://www.nowcoder.com/discuss/694762
科大讯飞 2022届 秋招 测试类 笔试 编程题

 */
public class iflytek2021_1 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        List<int[]> jin = new ArrayList<int[]>(m);
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < m; i++){
            jin.add(i, new int[]{sc.nextInt(), sc.nextInt()});
        }
        Arrays.sort(a); // 28.57% 超时
        jin.sort((i, j) -> {
            if (i[1] != j[1]) return j[1] - i[1];
            if (i[0] != j[0]) return j[0] - i[0];
            return 0;
        });
        for (int i = 0; i < jin.size(); i++){  // 使用第 i 个锦囊
            int count = jin.get(i)[0];
            int value = jin.get(i)[1];
            if(value < a[0]) break;
            boolean flag = false;  // 本次循环有没有使用锦囊
            for(int j = 0; j < count; j++){  // 锦囊可以修改 j 个元素
                for(int k = 0; k < a.length; k++){  // 遍历数组
                    if(a[k] < value){
                        a[k] = value;
                        flag = true;
                        break;
                    }
                }
                if(!flag) break;  // 38.1% 超时
            }
            Arrays.sort(a);  // 95.24% 超时
        }
        long sum = 0;
        for(int i = 0; i < a.length; i++){
            sum += a[i];
        }
        System.out.println(sum);
    }
}
