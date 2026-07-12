class Solution {
    public boolean isValid(String s) {
        var bracket = Map.of(')','(',']','[','}','{');
        var stack = new ArrayDeque<Character>();
        for(char ch : s.toCharArray()){
            if(bracket.containsKey(ch)) {
                if(stack.isEmpty()) return false;
                else{
                    if(stack.pop() != bracket.get(ch)) return false;
                }    
            }else{
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }
}
