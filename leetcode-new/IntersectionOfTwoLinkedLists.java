/*
Write a program to find the node at which the intersection of two singly linked 
lists begins.


For example, the following two linked lists:

A:          a1 �� a2
                   �K
                     c1 �� c2 �� c3
                   �J            
B:     b1 �� b2 �� b3
begin to intersect at node c1.


Notes:

If the two linked lists have no intersection at all, return null.
The linked lists must retain their original structure after the function 
returns.
You may assume there are no cycles anywhere in the entire linked structure.
Your code should preferably run in O(n) time and use only O(1) memory.
 */
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
public class IntersectionOfTwoLinkedLists {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode cur = headA;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = headB;
        ListNode cur1 = headA.next;
        ListNode cur2 = headA.next.next;
        while (cur1 != cur2) {
            cur1 = cur1.next;
            cur2 = cur2.next.next;
        }
    }

}
