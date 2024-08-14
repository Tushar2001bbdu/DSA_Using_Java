You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

 

Example 1:


Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
Example 2:

Input: l1 = [0], l2 = [0]
Output: [0]
Example 3:

Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]
 

Constraints:

The number of nodes in each linked list is in the range [1, 100].
0 <= Node.val <= 9
It is guaranteed that the list represents a number that does not have leading zeros.


Solution:


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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
   if(l1==null || l2==null){
       return null;
   }
   
  ListNode dummy=new ListNode(0);ListNode h=dummy;
 int sum=0,carry=0;
 ListNode t1=l1,t2=l2;
while(t1!=null && t2!=null){
    sum=(t1.val+t2.val+carry)%10;
    carry=(t1.val+t2.val+carry)/10;
    ListNode newnode=new ListNode(sum);
    dummy.next=newnode;
    dummy=dummy.next;
    t1=t1.next;
    t2=t2.next;
}
        while(t1!=null){
        sum=(t1.val+carry)%10; 
    ListNode newnode=new ListNode(sum);
    dummy.next=newnode;
    dummy=dummy.next;
        carry=(t1.val+carry)/10;
        t1=t1.next;
        }
          while(t2!=null){
        sum=(t2.val+carry)%10; 
    ListNode newnode=new ListNode(sum);
    dummy.next=newnode;    
    dummy=dummy.next;
        carry=(t2.val+carry)/10;    
        t2=t2.next;
        }
        if(carry>0){
            ListNode newnode=new ListNode(carry);
    dummy.next=newnode;    
        }
        return h.next;
        
    }
    
}
       
