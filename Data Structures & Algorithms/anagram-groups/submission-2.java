class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        var map = new HashMap<String, List<String>>();
        for(String str:strs) {
            var arr=str.toCharArray();
            Arrays.sort(arr);
            var key = new String(arr);
            map.computeIfAbsent(key,k-> new ArrayList<String>()).add(str);
        }
        return new ArrayList<>(map.values()); 
    }
}
