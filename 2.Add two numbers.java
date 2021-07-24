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
    ListNode H = new ListNode(0);           //creating the dummy head
    ListNode m = l1, n = l2, curr = H;
    int carry = 0;                          //initially no carry
    while (m != null || n != null) {        // loop runs untill m or n has atleast one node
        int x = (m != null) ? m.val : 0;    //assigning x with m
        int y = (n != null) ? n.val : 0;    //assigning y with n
        int sum = carry + x + y;            //defination of sum 
        carry = sum / 10;                   //Getting carry value
        curr.next = new ListNode(sum % 10); 
        curr = curr.next;
        if (m != null) m = m.next;
        if (n != null) n = n.next;
    }
    if (carry > 0) {
        curr.next = new ListNode(carry); // making carry to be next node
    }
    return H.next; 
    }
}