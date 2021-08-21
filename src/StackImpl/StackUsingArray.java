package StackImpl;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class StackUsingArray implements StackInterface {
    int top = -1;
    int data[];

    public StackUsingArray(int SIZE) {
        data = new int[SIZE];
    }

    @Override
    public int pop() {
        if (top == -1) {
            throw new NoSuchElementException();
        }
        return data[top--];
    }

    @Override
    public void push(int element) {
        if (top >= data.length - 1) resize((int) 2 * data.length);
        data[++top] = element;
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public int peek() {
        if (top == -1) {
            throw new NoSuchElementException();
        }
        return data[top];
    }

    @Override
    public void print() {
        Arrays.stream(data).forEach(x -> System.out.println(x));
    }

    private void resize(int newCapacity) {
        int[] newData = new int[newCapacity];
        for (int i = 0; i <= top; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }
}
