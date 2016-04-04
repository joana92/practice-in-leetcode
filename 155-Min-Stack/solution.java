class MinStack {
    private Stack<Integer> stack = new Stack<> ();
    private Stack<Integer> minStack = new Stack<>();
    //private int minCurr=Integer.MAX_VALUE;
    public void push(int x) {
        stack.push(x);
        if(minStack.empty() || x<minStack.peek())
        {minStack.push(x);
        //minCurr = x;
        }
        else
        minStack.push(minStack.peek());
        
    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int top() {
       return ( stack.peek());
      // return(minStack.peek());
    }

    public int getMin() {
        return minStack.peek();
    }
}
