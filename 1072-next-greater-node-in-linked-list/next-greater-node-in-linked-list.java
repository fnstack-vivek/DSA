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
    public int[] nextLargerNodes(ListNode head) {
        
        int length = 0;
        ListNode temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }

        
        int[] arr = new int[length];
        temp = head;
        for (int i = 0; i < length; i++) {
            arr[i] = temp.val;
            temp = temp.next;
        }

        
        int[] res = new int[length];
        Stack<Integer> st = new Stack<>(); 

        
        for (int i = 0; i < length; i++) {
            while (!st.isEmpty() && arr[st.peek()] < arr[i]) {
                res[st.pop()] = arr[i];
            }
            
            st.push(i);
        }

        
        return res;
    }
}