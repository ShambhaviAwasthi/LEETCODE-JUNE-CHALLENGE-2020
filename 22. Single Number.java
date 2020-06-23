// Shambhavi Awasthi
// June Challenge 2020
// Day 22 - Single number

class Solution {
    public int singleNumber(int[] nums) {
        int result=0;
        int x,sum;
        for(int i=0;i<32;i++){
            sum=0;
            x=1<<i;
            for(int j=0;j<nums.length;j++){
                if((nums[j]&x)==0){
                    sum++;
                }
            }
            if ((sum % 3) == 0) 
            result |= x; 
        }
        return result;
    }
}
