// Shambhavi Awasthi
// LEETCODE MAY CHALLENGE
// DAY 4: Reverse a string

class Solution {
    public void reverseString(char[] s) {
        int l=s.length;
        int a=0;
        int b=l-1;
            while(a<b){
                char ch=s[a];
                s[a]=s[b];
                s[b]=ch;
                a++;
                b--;
            }
        
    }
}