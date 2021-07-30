public class LeetCode_1104 {
//    https://leetcode-cn.com/problems/path-in-zigzag-labelled-binary-tree/
/*
class Solution {
    public List<Integer> pathInZigZagTree(int label) {
        List<Integer> list = new ArrayList<Integer>();
        int depth = (int)(Math.log(label) / Math.log(2));
        while(label > 1){
            list.add(label);
            label = (int)(3 * Math.pow(2, --depth) - label / 2 - 1);
        }
        list.add(1);
        Collections.reverse(list);
        return list;
    }
}
 */
    public static void main (String[] args) {
        System.out.println("LeetCode_1104_二叉树寻路 看注释咯");
    }
}
