/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null )
        return head;
        int len = getLength(head);
        k = k % len;
        if (k==0)
        return head;
        int newEnd,newStart;
        ListNode newTrail, newHead,trail;
        newEnd = len - k ;
        newStart = newEnd +1;
        newTrail = head;
        int i = 1;
        while(i<newEnd && newTrail!=null)
        {
            newTrail = newTrail.next;
            i++;
        }
        newHead=newTrail.next;
        trail = getTrail(head);
        newTrail.next=null;
        trail.next=head;
        return newHead;
    }
    public int getLength(ListNode head)
    {
        int len=0;
        while(head!=null)
        {
            len++;
            head=head.next;
        }
        return len;
    }
    public ListNode getTrail(ListNode head)
    {
        while(head!=null && head.next!=null)
        {
            head=head.next;
        }
        return head;
    }
    
}