/*
class Solution {
    public int numberOfBoomerangs(int[][] points) {
        int ans = 0;
        for(int i = 0; i < points.length; i++){
            Map<Integer, Integer> map = new HashMap<>();
            for(int j = 0; j < points.length; j++){
                if(i == j) continue;
                int x = points[i][0] - points[j][0], y = points[i][1] - points[j][1];
                int dist = x*x + y*y;
                map.put(dist, map.getOrDefault(dist, 0) + 1);
            }
            for(int dist : map.keySet()){
                int cnt = map.get(dist);
                ans += cnt * (cnt - 1);
            }
        }
        return ans;
    }
}
 */
public class LeetCode_447 {
    public static void main (String[] args) {
        System.out.println("LeetCode_447_回旋镖的数量 看注释咯");
    }
}
