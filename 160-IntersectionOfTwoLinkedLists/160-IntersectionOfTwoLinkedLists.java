// Last updated: 8/13/2025, 10:26:30 AM
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
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a=headA;
        int a1=0;
        int a2=0;
        ListNode b=headB;
        while(a!=b){
            if(a==null){
                a=headB;
            }
            else{
                a=a.next;
            }
            if(b==null){
                b=headA;
            }
            else{
                b=b.next;
            }
        }
        return a;
    }
}