import java.util.Scanner;
// 82%通过
public class baidu2021_2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        if(!in.contains("0") || !in.contains("1")){
            System.out.println(0);
            System.exit(0);
        }
        int len = in.length();
        int[][] dp = new int[len][len];
        for(int i = 0; i < len; i++){
            dp[i][i] = 1;
        }
        for(int i = len - 1; i >= 0; i--){
            for(int j = i + 1; j < len; j++){
                if(in.charAt(i) == in.charAt(j)){
                    dp[i][j] = dp[i + 1][j - 1] + 2;
                }else{
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                }
            }
        }
        System.out.println(dp[0][len - 1]);
    }
}