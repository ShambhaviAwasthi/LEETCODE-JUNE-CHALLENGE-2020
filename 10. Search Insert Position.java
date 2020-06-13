// Shambhavi Awasthi
// LEETCODE JUNE CHALLENGE
// DAY 10: Search Insert Position
class Solution {
    public int searchInsert(int[] nums, int target) {
        if(target>nums[nums.length-1]){
        return nums.length;
    }
        int start=0;
        int end=nums.length-1;
        while(start<end){
            int m=start+(end-start)/2;
            if(target>nums[m])
                start=start+1;
            else
                end=m;
        }
        return start;
    }
}
