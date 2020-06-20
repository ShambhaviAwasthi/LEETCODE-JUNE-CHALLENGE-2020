// Shambhavi Awasthi
// LEETCODE JUNE CHALLENGE
// DAY 20: Kth permutation of the String

class Solution {
    
    public String getPermutation(int n, int k) {
        ArrayList<Integer> al=new ArrayList<Integer>();
        
        // array list storing numbers from 1-n ; length of array is n
        for(int i=1;i<n+1;i++)
            al.add(i);
            
        
        // finding mod
        int mod=1;
        for(int i=1;i<n+1;i++)
            mod=mod*i;         
         // i=1 mod=1
        //  i=2 mod=2
        // i= 3 mod=6
        
        k=k-1; // decreasing k by 1 to make it index, k was 3 , now its 2
        
        String ans=""; // to store result
        
        for(int i=0;i<n;i++){
            mod=mod/(n-i);
            int idx= k/mod;
            k=k%mod;
            ans+=al.get(idx);
            al.remove(idx);
        }
        
        
        // i=0   mod=6/(3-0)=2  idx=2/2=1   k=2%2=1    ans="2"     al={1,3}
        // i=1  mod=2/(3-1)=1  idx=1/1=1   k=1%1=0 ans="21"     al={3}
        // i=2  mod=1/(3-2)=1  idx=0   k=0   ans="213"     al={}
        return ans;
    }
}