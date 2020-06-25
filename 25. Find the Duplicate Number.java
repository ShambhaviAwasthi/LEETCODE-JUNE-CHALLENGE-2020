// SHAMBHAVI AWASTHI
// LEETCODE JUNE CHALLENGE 2020
// DAY 25: Find the Duplicate Number

class Solution {
    public int findDuplicate(int[] nums) {
        int count[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            count[nums[i]]++;
        }
        for(int i=0;i<count.length;i++){
            if(count[i]>1)
                return i;
        }
        return 0;
    }
}
