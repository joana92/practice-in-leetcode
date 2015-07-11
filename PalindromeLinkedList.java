/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null) return true;
        ListNode mid=getMid(head);
        ListNode end=reverselinklist(mid);
        while(end!=null){
            if(end.val!=head.val) return false;
            else{
                end=end.next;
                head=head.next;
            }
        }
        return true;
    }
    public ListNode getMid(ListNode head){
        ListNode slow=new ListNode(0);
        slow.next=head;
        ListNode fast=slow;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        if(fast.next==null) return slow.next;
        else return slow.next.next;
    }
    
    public ListNode reverselinklist(ListNode head){
        if(head==null || head.next==null) return head;
        ListNode pre=head;
        ListNode cur=pre.next;
        ListNode post=cur.next;
        pre.next=null;
        while(post!=null){
            cur.next=pre;
            pre=cur;
            cur=post;
            post=post.next;
        }
        cur.next=pre;
        return cur;
    }
}
