package Stacks.InDetails;

public class DynamicStack extends CustomStack {

    public DynamicStack(){
        super();   //it will call custom stack
    }

    public DynamicStack(int size) {
        super(size); // Calls the parameterized constructor of CustomStack
    }

    @Override
    public boolean push(int item) {
        if (this.isFull()){
            //double the size of array
            int[] temp = new int[data.length * 2];

            //copy all previous item in new data
            for (int i=0;i<data.length;i++){
                temp[i]=data[i];

            }
            data=temp;

        }
        return  super.push(item);
    }
}
