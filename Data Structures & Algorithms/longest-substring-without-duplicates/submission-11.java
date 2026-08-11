class Solution {
    public int lengthOfLongestSubstring(String s) {
        var map = new HashMap<Character,Integer>();
        int left =0;
        int res =0;
        for(int right=0; right < s.length(); right++){
            char ch = s.charAt(right);
            if(map.containsKey(ch)){
                left = Math.max(left,map.get(ch)+1);
            }
            map.put(ch,right);
            res = Math.max(res, right-left+1);
        }
        return res;
        
    }
}
