public class LeetCode_232 {
/*
https://leetcode-cn.com/problems/implement-queue-using-stacks/
class MyQueue {
    Deque<Integer> stack1;
    Deque<Integer> stack2;
public MyQueue() {
    stack1 = new LinkedList<Integer>();
    stack2  = new LinkedList<Integer>();
}

    public void push(int x) {
        stack1.push(x);
    }

    public int pop() {
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public int peek() {
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    public boolean empty() {
        if(stack1.isEmpty() && stack2.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}
 */
    public static void main (String[] args) {
        System.out.println("LeetCode_232_用栈实现队列 看注释咯");
    }
}
