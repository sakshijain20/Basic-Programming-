Question : Given the head of a singly linked list, return true if it is a palindrome.
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
    public boolean isPalindrome(ListNode head) {
        
        ListNode temp = head;
        boolean p = true;
        Stack<Integer> stack = new Stack<Integer>();
 
        while (temp != null)
        {
            stack.push(temp.val);
            temp=temp.next;
        }
 
        while (head != null) 
        {
 
            int i = stack.pop();
            if (head.val == i)
            {
                p = true;
            }
            else 
            {
                p = false;
                break;
            }
            head = head.next;
        }
        return p;
    
    }
}
