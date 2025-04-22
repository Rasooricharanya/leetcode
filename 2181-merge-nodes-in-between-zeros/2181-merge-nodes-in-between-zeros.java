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
    public ListNode mergeNodes(ListNode head) {
        head = head.next; // Skip the initial zero
    if (head == null) {
        return null;
    }

    int sum = 0;
    ListNode curr = head;

    // Accumulate until we reach the next zero
    while (curr.val != 0) {
        sum += curr.val;
        curr = curr.next;
    }

    ListNode newNode = new ListNode(sum);
    newNode.next = mergeNodes(curr); // Recursive call from the next zero
    return newNode;
 
    
}
}