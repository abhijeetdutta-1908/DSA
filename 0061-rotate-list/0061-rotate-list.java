/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0)
            return head;
        int count = 1;
        ListNode tail = head;
        ListNode curr = head;
        while(tail.next != null)
        {
            count++;
            tail = tail.next;
        }
        k = k % count;
        tail.next = head;
        int steps = count - k;
        for(int i = 1 ; i < steps ; i++){
            curr = curr.next;
        }
        ListNode newHead = curr.next;
        curr.next = null; 
        return newHead;  
    }
}