/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null)
        return null;
        ListNode tem= new ListNode(0);
        ListNode pre = null;
        while(head!=null)
        {
            tem= head.next;
            head.next=pre;
            pre=head;
            head = tem;
        }
      return pre;  
    }
}