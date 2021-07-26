public class LeetCode_1743 {
//    https://leetcode-cn.com/problems/restore-the-array-from-adjacent-pairs/
/*
class Solution {
    public int[] restoreArray(int[][] adjacentPairs) {
        HashMap<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();  // 储存每个数字相邻的数
        for(int[] ap: adjacentPairs){
            int a = ap[0];
            int b = ap[1];

            List<Integer> a_neighbour = map.getOrDefault(a, new ArrayList<>());
            a_neighbour.add(b);
            map.put(a, a_neighbour);

            List<Integer> b_neighbour = map.getOrDefault(b, new ArrayList<>());
            b_neighbour.add(a);
            map.put(b, b_neighbour);
        }
        int start = 0;
        for(int i:map.keySet()){
            List<Integer> list = map.get(i);
            if(list.size() == 1){
                start = i;
                break;
            }
        }
        int[] ans = new int[adjacentPairs.length + 1];  // 两两相对的组合，数组的总长度需要 + 1
        ans[0] = start;
        ans[1] = map.get(start).get(0);
        for(int i = 2; i < ans.length; i++){
            for(int j: map.get(ans[i-1])){
                if(j != ans[i-2]) ans[i] = j;
            }
        }
        return ans;
    }
}
 */
    public static void main (String[] args) {
        System.out.println("LeetCode_1743_从相邻元素对还原数组 看注释咯");
    }
}
