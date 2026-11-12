class Solution {
    public int[] twoSum(int[] nums, int target) {
        var set = new HashMap<Integer,Integer>();
        for(int i = 0; i < nums.length; i++){
            int complimentry = target - nums[i]; 
            if(set.containsKey(complimentry)){
                return new int[]{set.get(complimentry),i};
            }
            set.put(nums[i],i);
        }
        return new int[]{-1,-1};
        
    }
}
