/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class IntersectionofTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null) return null;
        int lena=getlength(headA);
        int lenb=getlength(headB);
        int len;
        ListNode cura=headA;
        ListNode curb=headB;
        if(lena>lenb){
            len=lena-lenb;
            while(len>0){
                cura=cura.next;
                len--;
            }
        }
        if(lena<lenb){
            len=lenb-lena;
            while(len>0){
                curb=curb.next;
                len--;
            }
        }
        while(cura!=null){
            if(cura==curb) return cura;
            else{
                cura=cura.next;
                curb=curb.next;
            }
        }
        return null;
    }
    public int getlength(ListNode head){
        if(head==null) return 0;
        if(head.next==null) return 1;
        int len=1;
        while(head.next!=null){
            len++;
            head=head.next;
        }
        return len;
    }
}
