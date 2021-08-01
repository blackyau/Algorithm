public class LeetCode_1337 {
/*
https://leetcode-cn.com/problems/the-k-weakest-rows-in-a-matrix/
class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        List<int[]> tmp = new ArrayList<int[]>();
        for(int i = 0; i < mat.length; i++){
            int count = 0;
            for(int j: mat[i]){
                if(j == 1){
                    count++;
                }else{
                    break;
                }
            }
            tmp.add(new int[]{i, count});
        }
        tmp.sort((i, j) ->{
            if(i[1] != j[1]) return i[1] - j[1];
            return 0;
        });
        int[] ans = new int[k];
        for(int i = 0; i < k; i++){
            ans[i] = tmp.get(i)[0];
        }
        return ans;
    }
}
 */
    public static void main (String[] args) {
        System.out.println("LeetCode_1337_矩阵中战斗力最弱的 K 行 看注释咯");
    }
}
