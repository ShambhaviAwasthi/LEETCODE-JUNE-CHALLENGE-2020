// Shambhavi Awasthi
// LEETCODE JUNE CHALLENGE
// DAY 13: Largest Divisible Subset

class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        
        ArrayList<Integer> al=new ArrayList<Integer>();
        
        if(nums==null || nums.length==0)
            return al;
        Arrays.sort(nums);
        int count[]=new int[nums.length];
        int index[]=new int[nums.length];
        Arrays.fill(count,1);
        Arrays.fill(index,-1);
        int max=0;
        int maxIndex=-1;
        for(int i=0;i<nums.length;i++){
            for(int j=i-1;j>=0;j--){
                if(nums[i]%nums[j]==0 && count[i]<count[j]+1){
                    count[i]=count[j]+1;
                    index[i]=j;
                }
            }
            if(max<count[i])
            {
                max=count[i];
                maxIndex=i;
            }
            
        }
        int k=maxIndex;
        while(k>=0){
            al.add(nums[k]);
            k=index[k];
        }
        return al;
    }
}