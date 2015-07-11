/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class RemoveNthNodeFromEndofList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
      //  ListNode tem=head;
        if(head==null || n<0) return null;
        ListNode slow= new ListNode(0);
       // ListNode fast=new ListNode(0);
        slow.next=head;
        ListNode sloww=slow;
       // fast.next=head;
       // tem=head;
        while(n>1){
            //fast=tem;
            //tem=tem.next;
            head=head.next;
            n--;
        }
        while(head.next!=null){
            sloww=sloww.next;
           // fast=fast.next;
           head=head.next;
        }
        sloww.next=sloww.next.next;
        return slow.next;
    } 
}
