package Stacks.InDetails;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE= 10;

    int ptr=-1;

    public CustomStack(){
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size){
        this.data=new int[size];
    }

    public boolean push(int item){

        if (isFull()){
            return false;
        }
        ptr++;
        data[ptr]=item;
        return true;
    }

    public int pop() throws StackCustomException{
        if (isEmpty()){
            throw new StackCustomException("Can not open from empty stack");
        }
        int removed=data[ptr];
        ptr--;
        return removed;

    }

    public int peak() throws StackCustomException{
        if (isEmpty()){
            throw new StackCustomException("Can not open peek from empty stack");
        }
        return data[ptr];
    }

    public boolean isFull() {
        return ptr==data.length-1;  //ptr is at last index
    }

    private boolean isEmpty() {
        return ptr==-1;  //ptr is at first index
    }
}
