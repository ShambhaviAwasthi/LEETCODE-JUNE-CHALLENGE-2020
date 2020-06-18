// Shambhavi Awasthi
// LEETCODE JUNE CHALLENGE
// DAY 18: H-index

class Solution {
    public int hIndex(int[] citations) {
        int l=citations.length;
        int h=0;
        for(int i=l-1;i>=0;i--){
            int count=l-i;
            if(citations[i]>=count)
                h=count;
            else
                break;
        }
        return h;
    }
}