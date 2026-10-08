class Solution {
    public int[] productExceptSelf(int[] nums) {
        int lproduct = 1;
        int rproduct = 1;
        int n = nums.length;
        int li = nums.length - 1;
        int[] res = new int[nums.length];
        Arrays.fill(res, 1);
        for (int i = 0; i < n; i++) {
            res[i] *= lproduct;
            lproduct *= nums[i];
            res[li - i] *= rproduct;
            rproduct *= nums[li - i];
        }
        return res;
    }
}
