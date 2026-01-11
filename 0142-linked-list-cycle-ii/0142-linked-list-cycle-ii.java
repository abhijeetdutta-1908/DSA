/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
import java.util.HashSet;

public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> visited = new HashSet<>();

        ListNode current = head;
        while (current != null) {
            if (visited.contains(current)) {
                return current; // cycle start
            }
            visited.add(current);
            current = current.next;
        }
        return null; // no cycle
    }
}
