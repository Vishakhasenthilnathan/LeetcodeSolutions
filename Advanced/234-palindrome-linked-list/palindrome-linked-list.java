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
    public boolean isPalindrome(ListNode head) {
        //find middle
        ListNode slow = head, fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        //reverse second half
        ListNode secondHalf = slow;
        ListNode prev = null;
        while(secondHalf!=null){
            ListNode next = secondHalf.next;
            secondHalf.next = prev;
            prev = secondHalf;
            secondHalf = next;
        }
        //compare first half with second half
        while(prev!=null){
            if(head.val!=prev.val) return false;
            head = head.next;
            prev = prev.next;
        }
        return true;
    }
}