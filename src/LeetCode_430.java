/*
class Solution {
    public Node flatten(Node head) {
        Node a = new Node(0);
        a.next = head;
        while(head != null){
            if(head.child == null){
                head = head.next;
            }else{
                Node tmp = head.next;
                Node chead = flatten(head.child);
                head.next = chead;
                chead.prev = head;
                head.child = null;
                while(head.next != null)
                    head = head.next;
                head.next = tmp;
                if(tmp != null)
                    tmp.prev = head;
                head = tmp;
            }
        }
        return a.next;
    }
}
 */
public class LeetCode_430 {
    public static void main (String[] args) {
        System.out.println("LeetCode_430_扁平化多级双向链表 看注释咯");
    }
}
