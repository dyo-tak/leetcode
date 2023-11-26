class MyQueue {
    int bottom = -1;
    int top = -1;
    int[] stack = new int[];
    
    public MyQueue() {
        
    }
    
    public void push(int x) {
        if (top == -1 && bottom == -1) {
            bottom++;
        }
        stack[++top] = x;
    }
    
    public int pop() {
        if (bottom == -1) {
            return -1;
        }

        return stack[bottom++];

    }
    
    public int peek() {
        if (top == -1) {
            return -1;
        }

        return stack[top];
    }
    
    public boolean empty() {
        if (top == bottom) return true;

        return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
