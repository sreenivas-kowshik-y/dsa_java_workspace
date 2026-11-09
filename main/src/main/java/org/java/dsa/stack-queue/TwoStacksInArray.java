// Implement Two Stacks in a Single Array
public class TwoStacksInArray {
    private int[] arr;
    private int top1;
    private int top2;
    private int capacity;

    public TwoStacksInArray(int n) {
        capacity = n;
        arr = new int[n];
        top1 = -1;
        top2 = n;
    }

    public void push1(int x) throws Exception {
        if (top1 < top2 - 1) {
            arr[++top1] = x;
        } else {
            throw new Exception("Stack Overflow in Stack 1");
        }
    }

    public void push2(int x) throws Exception {
        if (top1 < top2 - 1) {
            arr[--top2] = x;
        } else {
            throw new Exception("Stack Overflow in Stack 2");
        }
    }

    public int pop1() throws Exception {
        if (top1 >= 0) {
            return arr[top1--];
        } else {
            throw new Exception("Stack Underflow in Stack 1");
        }
    }

    public int pop2() throws Exception {
        if (top2 < capacity) {
            return arr[top2++];
        } else {
            throw new Exception("Stack Underflow in Stack 2");
        }
    }
}
