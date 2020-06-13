// Shambhavi Awasthi
// LEETCODE MAY CHALLENGE
// DAY 3: Two City Scheduling

class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int sumA=0;
        int diff[]=new int[costs.length];
        for(int i=0;i<costs.length;i++){
            sumA=sumA+costs[i][0];
            diff[i]=costs[i][1]-costs[i][0];
            }
        Arrays.sort(diff);
        for(int i=0;i<costs.length/2;i++){
            sumA=sumA+diff[i];
        }
        return sumA;
    }
}