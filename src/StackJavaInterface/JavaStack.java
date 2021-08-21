package StackJavaInterface;

import LinkedListImpl.LinkedList;
import StackImpl.StackInterface;
import StackImpl.StackUsingArray;

import java.util.Stack;

public class JavaStack {
    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//        stack.push(4);
//        stack.push(5);
//        stack.push(3);
//        stack.push(7);
//        stack.pop();
//        System.out.println(stack.pop());
//        System.out.println(stack.isEmpty());
//        System.out.println(stack.peek());
//        System.out.println(stack.pop());


//        StackInterface mystack = new StackUsingArray(1);
//
//        System.out.println(mystack.isEmpty());
//        mystack.push(5);
//        mystack.push(3);
//        mystack.push(7);
//        mystack.print();


        LinkedList list = new LinkedList();
        list.insert(4, list);
        list.insert(5, list);
        list.insert(8, list);
        list.insert(1, list);
        list.printList(list);
        list.deleteByKey(list,5);
        list.printList(list);
        list.insert(7, list);
        list.deleteByPosition(list,0);
        list.printList(list);
        list.deleteByPosition(list, 2);
        list.printList(list);




        //array ll q dynamic array
    }
}
