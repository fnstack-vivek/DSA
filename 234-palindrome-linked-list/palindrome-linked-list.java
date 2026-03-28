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
           ListNode helper(ListNode x){
            if(x ==null|| x.next==null) return x;

           

           ListNode t=helper(x.next);
           x.next.next=x;
           x.next=null;
           return t;
           }

    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        ListNode temp=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;

        }
        ListNode nh=helper(slow);
        while(nh!=null){
            if(nh.val!=temp.val){
                return false;
            }
            nh=nh.next;
            temp=temp.next;
        }
        return true;

        
        
        
       
        
    }
}