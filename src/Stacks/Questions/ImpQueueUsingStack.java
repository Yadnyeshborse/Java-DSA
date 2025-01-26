package Stacks.Questions;

import java.util.Stack;
//https://leetcode.com/problems/implement-queue-using-stacks/description/?envType=problem-list-v2&envId=stack
//https://leetcode.com/problems/implement-stack-using-queues/description/

public class ImpQueueUsingStack {
    private Stack<Integer> first;
    private Stack<Integer> second;

    public ImpQueueUsingStack(){
        first=new Stack<>();
        second=new Stack<>();
    }

    public void add(int item){
        first.push(item);
    }

    public int removed(){
        while (second.isEmpty()){
            second.push(first.pop());
        }
        int resulto=second.pop();
        while (!second.isEmpty()){
            first.push(second.pop());
        }
        return resulto;
    }

    public int peek(){
        while (!first.isEmpty()){
            second.push(first.pop());
        }
        int peeko=second.peek();
        while (!second.isEmpty()){
            second.push(first.pop());
        }
        return peeko;
    }

    public boolean isEmpty(){
        return first.isEmpty();
    }

}
