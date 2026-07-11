class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        var list = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for(int i=0; i< nums.length -2; i++) {
            int a = nums[i];
            if(i > 0 && a == nums[i-1]) continue;
            int j=i+1;
            int k=nums.length-1;
            while(j < k){
              int sum = a + nums[j] + nums[k];
              if(sum == 0){
                list.add(List.of(a, nums[j],nums[k]));
                while(j < k && nums[k] == nums[k-1]){
                    k--;
                }
                while(j < k && nums[j] == nums[j+1]){
                    j++;
                }
                j++;
                k--;
              } else if (sum > 0) {
                k--;
              }else{
                j++;
              }
            }
        }
        return list;
    }
}
