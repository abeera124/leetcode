class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            // If token is an operator
            if (token.equals("+") || token.equals("-") || 
                token.equals("*") || token.equals("/")) {
                int b = stack.pop();
                int a = stack.pop();
                int result = 0;
                switch (token) {
                    case "+":
                        result = a + b;
                        break;
                    case "-":
                        result = a - b;
                        break;
                    case "*":
                        result = a * b;
                        break;
                    case "/":
                        result = a / b;   // Java already truncates toward zero
                        break;
                }
                stack.push(result);
            } 
            else {
                // Token is a number → push to stack
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}
