
Write an algorithm to determine if a number n is happy.

A happy number is a number defined by the following process:

Starting with any positive integer, replace the number by the sum of the squares of its digits.
Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
Those numbers for which this process ends in 1 are happy.
Return true if n is a happy number, and false if not.


Solution:

class Solution {
    public boolean isHappy(int n) {
        int s;
        Set<Integer> set=new HashSet<>();
        while(set.add(n))
        {
            s=0;
            while(n>0)
            {
                int r=n%10;
                s+=r*r;
                n=n/10;
            }
            if(s==1)
                return true;
            else
                n=s;
        }
        return false;
    }
}
