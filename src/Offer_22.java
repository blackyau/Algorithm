/*
class Solution {
    public ListNode getKthFromEnd(ListNode head, int k) {
        int count = 0;
        ListNode tmp = head;
        while(tmp != null){
            tmp = tmp.next;
            count++;
        }
        tmp = head;
        while(count-- > k){
            tmp = tmp.next;
        }
        return tmp;
    }
}
 */
public class Offer_22 {
    public static void main (String[] args) {
        System.out.println("剑指 Offer 22. 链表中倒数第k个节点 看注释咯");
    }
}
