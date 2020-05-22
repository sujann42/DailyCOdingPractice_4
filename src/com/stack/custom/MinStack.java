package com.stack.custom;

public class MinStack {

    int maxSize;
    int count;
    int arr[];
    public MinStack(int n) {
        maxSize = n;
        arr = new int[maxSize];
        count = 0;
    }

    public boolean isStackEmpty(){
        if(arr.length == 0){
            return true;
        }
        return false;
    }

    public void push(int x) {
        if(count < maxSize){
            arr[count] = x;
            count++;
        }else{
            System.out.println("Stack Overflow.");
        }
    }

    public void pop() {
        if(count != 0){
            int temp = this.peek();
            arr[count-1] = 0;
            count--;
        }
    }

    public int peek() {
        if(count>0){
            return arr[count-1];
        }
        return -1;
    }

    public int getMin() {
        int min = arr[0];
        for (int i = 1; i < count; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    public void getSize(){
        System.out.println("Size of stack: "+count);
    }

    void printStack(){
        System.out.print("Stack: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

}
