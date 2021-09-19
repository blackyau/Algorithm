/*
class Solution {
    public int minSteps(int n) {
        if(n == 1) return 0;
        return dfs(n, 1, 0);
    }
    // 要达到 n 个 'A'
    // 记事本已有 have 个 'A'
    // 当前粘贴板已有 paste 个 'A'
    private static int dfs(int n, int have, int paste){
        if(have == n) return 0;
        if(have > n) return 0x3f3f3f3f;
        int a, b;
        if(have != paste){  // 如果剪贴板和已有的不一样，这一步就可以复制
            a = 1 + dfs(n, have, have);  // 复制后步数要 + 1
        }else{
            a = 0x3f3f3f3f;
        }
        if(paste > 0){  // 如果剪贴板里面有内容，就可以粘贴
            b = 1 + dfs(n, have + paste, paste);  // 注意粘贴修改的 have
        }else{
            b = 0x3f3f3f3f;
        }
        return Math.min(a, b);
    }
}
 */
public class LeetCode_650 {
    public static void main (String[] args) {
        System.out.println("LeetCode_650_只有两个键的键盘");
    }
}
