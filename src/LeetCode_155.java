public class LeetCode_155 {
// https://leetcode-cn.com/problems/min-stack/
/*
class MinStack {
        Deque<Integer> stackData;
        Deque<Integer> stackMin;
public MinStack() {
    stackData = new LinkedList<Integer>();
    stackMin  = new LinkedList<Integer>();
    stackMin.push(Integer.MAX_VALUE);
}

    public void push(int val) {
        stackData.push(val);
        stackMin.push(Math.min(stackMin.peek(), val));
    }

    public void pop() {
        stackData.pop();
        stackMin.pop();
    }

    public int top() {
        return stackData.peek();
    }

    public int getMin() {
        return stackMin.peek();
    }
}
 */
    public static void main (String[] args) {
        System.out.println("LeetCode_155_最小栈 看注释咯");
    }
}
