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
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next !=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode secondPart = reverse(slow.next);
        slow.next = null;
        ListNode firstPart = head;
        while(secondPart != null){
            ListNode temp1 = firstPart.next;
            ListNode temp2 = secondPart.next;
            firstPart.next = secondPart;
            secondPart.next = temp1;
            firstPart = temp1;
            secondPart = temp2;
        } 

    }
    private ListNode reverse(ListNode head){
        ListNode temp = null;
        while(head != null){
            ListNode next = head.next;
            head.next = temp;
            temp = head;
            head = next;
        }
        return temp;
    }
}
