package com.stack.custom;

public class StackMain {
    public static void main(String[] args) {
        MinStack obj = new MinStack(5);
        obj.push(2);
        obj.getSize();
        obj.push(3);
        obj.getSize();
        obj.printStack();
        System.out.println("Min is: "+obj.getMin());
        obj.getSize();
        obj.push(5);
        obj.push(4);
        obj.push(1);
        obj.getSize();
        obj.printStack();
        System.out.println();
        System.out.println("Min is: "+obj.getMin());
        obj.pop();


        obj.getSize();
        obj.printStack();
        System.out.println();
        System.out.println("Min is: "+obj.getMin());

        System.out.println("Peek Item: "+obj.peek());


        //obj.pop();
        //int param_3 = obj.top();
        //int param_4 = obj.getMin();
    }
}
