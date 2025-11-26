class MinStack {
    Stack<Integer> mainStack;
    Stack<Integer> minStack;
    public MinStack() {
        mainStack = new Stack<>();
        minStack = new Stack<>();
    }
    public void push(int val) {
        mainStack.push(val);
        // Push to min stack if it is empty OR val is <= current min
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }
    public void pop() {
        int removed = mainStack.pop();
        // If removed element is equal to minStack top, remove from minStack also
        if (removed == minStack.peek()) {
            minStack.pop();
        }
    }
    public int top() {
        return mainStack.peek();
    }
    public int getMin() {
        return minStack.peek();
    }
}
