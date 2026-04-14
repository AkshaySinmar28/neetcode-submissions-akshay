class Solution {
    public int evalRPN(String[] tokens) {
        var stack = new ArrayDeque<Integer>();
        for(String token: tokens){
            switch(token) {
                case "+" -> stack.push(stack.pop() +stack.pop());
                case "*" -> stack.push(stack.pop() * stack.pop());
                case "-" ->{
                    int a= stack.pop();
                    stack.push(stack.pop() - a);
                    }
                case "/" -> {
                    int a= stack.pop();
                    stack.push(stack.pop() / a);
                    }
                default -> stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
        
    }
}
