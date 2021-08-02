public class LeetCode_743 {
/*
class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        HashMap<Integer, List<int[]>> map = new HashMap<>();  // Key为源节点，value为[目标节点, 权值]
        for(int[] t:times)
            // computeIfAbsent() 如果t[0]有对应的value，那么就会返回它的value，不存在就会添加
            // 后面的add()就是利用了它的返回值，这一个源节点可以去往多个节点，所以要在ArrayList()里面添加int[]也就是二维数组咯
            map.computeIfAbsent(t[0], value -> new ArrayList<>()).add(new int[]{t[1], t[2]});

        int[] dis = new int[n + 1];  // 从起始顶点到每个顶点的距离
        Arrays.fill(dis, Integer.MAX_VALUE);  // 默认情况下，它到每一个顶点的距离都为无穷大
        boolean[] vis = new boolean[n + 1];  // 这个节点有没有走过

        dis[k] = 0;  // k为起始顶点，所以它的距离要设置为0
        dis[0] = 0;  // 0顶点没有参与运算，所以也要把它排除了

        // 最小堆，按照 dis 升序排列
        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> dis[a] - dis[b]);
        queue.offer(k);  // 把起点放进去

        while(!queue.isEmpty()){
            Integer poll = queue.poll();
            if(vis[poll]) continue;  // 如果节点被访问过，就直接跳过
            vis[poll] = true;
            // // 获取这个节点的邻居，如果没有邻居的话就返回空列表。这个空列表不会消耗空间，降低空间复杂度。
            List<int[]> list = map.getOrDefault(poll, Collections.emptyList());
            for(int[] arr : list){  // 遍历邻居
                int next = arr[0];
                if(vis[next]) continue;  // 如果这个邻居访问过了就跳过
                // 更新起始节点到这个邻居的最短距离
                // dis[next] 一开始就是原本的距离
                // dis[poll] + arr[1] 是起始节点 -> poll节点 -> next(正在被遍历的这个邻居节点)，这一整距离的和
                dis[next] = Math.min(dis[next], dis[poll] + arr[1]);
                queue.offer(next);
            }
        }
        int res = Arrays.stream(dis).max().getAsInt();  // 把 Arrays 转换成集合流，获取它的最大值后转换成int
        return res == Integer.MAX_VALUE ? -1 : res;
    }
}
 */
    public static void main (String[] args) {
        System.out.println("LeetCode_743_网络延迟时间 看注释咯");
    }
}
