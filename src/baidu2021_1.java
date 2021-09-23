import java.util.HashMap;
import java.util.Scanner;
// 100% 通过
public class baidu2021_1 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] nums = sc.nextLine().split(" ");
        HashMap<Integer, Integer> map= new HashMap<Integer, Integer>();
        for (String i:nums){
            int a = Integer.parseInt(i);
            map.put(a, map.getOrDefault(a, 0) + 1);
        }
        int max = Integer.MIN_VALUE, max_value = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE, min_value = Integer.MAX_VALUE;
        for(int i: map.keySet()){
            int value = map.get(i);
            if(value >= max){  // 次数最多的数
                if(value == max && i > max_value){  // 取值最大的
                    max = value;
                    max_value = i;
                }
                if(value != max){
                    max = value;
                    max_value = i;
                }
            }
            if(value <= min){  // 次数最少的数
                if(value == min && i < min_value){  // 取值最小的
                    min = value;
                    min_value = i;
                }
                if(value != min){
                    min = value;
                    min_value = i;
                }
            }
        }
        System.out.println(max_value-min_value);
    }
}
