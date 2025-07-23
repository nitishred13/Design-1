// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
class MinStack {

   StackNode headnode;
    // Time Complexity :  O(1)
    // Space Complexity : O(1)
    public MinStack() {
     headnode = new StackNode(-1, Integer.MAX_VALUE);
    }
    
    // Time Complexity :  O(1)
    // Space Complexity : O(1)
    // Calculate Min for the current node, before creating.
    public void push(int val) {
        StackNode temp;
        if(val<headnode.minhead)
        {
           temp = new StackNode(val,val);
        }
        else
        {
          temp = new StackNode(val,headnode.minhead);
        }
           temp.next = headnode;
           headnode = temp;
    }
    
    // Time Complexity :  O(1)
    // Space Complexity : O(1)
    public void pop() {
        StackNode temp = headnode.next;
        headnode.next = null;
        headnode = temp;
    }
    
    // Time Complexity :  O(1)
    // Space Complexity : O(1)
    public int top() {
        return headnode.val;
    }
    
    // Time Complexity :  O(1)
    // Space Complexity : O(1)
    public int getMin() {
        return headnode.minhead;
    }
}

class StackNode{
    //MinStack is made of special node. This Node has value and min value.
    //Min value represents minimum value found till the node inserted.
    int val;
    int minhead;
    StackNode next;
    StackNode(int val,int minhead){
        this.val = val;
        this.minhead = minhead;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
