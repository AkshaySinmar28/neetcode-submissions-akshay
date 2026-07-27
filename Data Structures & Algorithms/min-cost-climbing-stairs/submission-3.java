class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int a = cost[0];
        int b = cost[1];
        for(int i = 2; i < cost.length; i++){
            int temp = a;
            a = b; 
            b = Math.min(temp,b) + cost[i];
        }
        return Math.min(a,b);
    }
}
