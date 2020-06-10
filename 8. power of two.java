// Shambhavi Awasthi
// LEETCODE MAY CHALLENGE
// DAY 8: power of 2

class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1 || n==2)
            return true;
        if(n<=0)
            return false;
        while(n>1){
            int r=n%2;
            if(r!=0)
                return false;
            n=n/2;
        }
        return true;
    }
}