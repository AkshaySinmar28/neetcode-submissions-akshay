
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] res = new int[n];
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = n - 1; i >= 0; i--) {

            // Remove all smaller or equal temperatures
            while (!stack.isEmpty() && 
                   temperatures[stack.peek()] <= temperatures[i]) {
                stack.pop();
            }

            // If stack not empty → next warmer day exists
            if (!stack.isEmpty()) {
                res[i] = stack.peek() - i;
            }

            // Push current index
            stack.push(i);
        }

        return res;
    }
}