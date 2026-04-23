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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry =0;
        var l = new ListNode();
        var temp = l;
        while(l1 !=null || l2 !=null || carry > 0) {
            int a = l1!=null ? l1.val : 0;
            int b = l2!=null ? l2.val : 0;
            int sum = a + b + carry;
            carry =sum/10;
            sum%=10;
            l.next = new ListNode(sum);
            l = l.next;
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }
        return temp.next;
    }
}
