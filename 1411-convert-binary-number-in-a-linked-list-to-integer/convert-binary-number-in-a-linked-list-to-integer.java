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
    public int getDecimalValue(ListNode head) {
        ListNode curr=head;
        int decimal=0;
        int count=0;
        while(curr!=null){
            count++;
            curr=curr.next;
        }
        int a=count-1;
        curr=head;
        while(curr!=null){
            if(curr.val==1){
                decimal += Math.pow(2, a);

            }
            a--;
            curr=curr.next;


        }
        return decimal;
        
    }
}