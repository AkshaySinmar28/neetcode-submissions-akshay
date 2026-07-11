class Solution {
    public int maxArea(int[] heights) {
        int left =0;
        int right = heights.length -1;
        int maxWater = 0;
        while(left < right){
            int leftHeight = heights[left];
            int rightHeight = heights[right];
            int currWater = Math.min(leftHeight, rightHeight) * (right - left);
            maxWater = Math.max(maxWater, currWater);
            if(leftHeight < rightHeight){
                left++;
            }else{
                right--;
            }
        }
        return maxWater;
    }
}
