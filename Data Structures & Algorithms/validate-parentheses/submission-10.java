class Solution {
    public boolean isValid(String s) {
        ArrayDeque<Character> st = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            switch (c) {
                case '(' -> st.push(')');
                case '{' -> st.push('}');
                case '[' -> st.push(']');
                default -> {
                    if (st.isEmpty() || st.pop() != c) return false;
                }
            }
        }
        return st.isEmpty();
    }
}
