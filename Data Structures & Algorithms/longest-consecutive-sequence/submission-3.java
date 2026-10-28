class Solution {
    public int longestConsecutive(int[] nums) {
        int l = 0;
        int maxLen = 0;
        Set<Integer> numSet = new HashSet<>();
        for(int num: nums){
            numSet.add(num);
        }
        for(int num: numSet){
            if(!numSet.contains(num-1)){
                int length =1;
                while(numSet.contains(num + length)){
                    length++;
                }
                maxLen = Math.max(maxLen,length);
            }
        }
        return maxLen;
    }
}
