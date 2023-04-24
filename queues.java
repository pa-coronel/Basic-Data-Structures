
public class queues {
    private int queueSize = 10;
    private int[] objects = new int[queueSize];
    private int front = -1;
    private int rear = -1;
    private int count = 0;
    private int[] poper = new int[queueSize];
    
    public void push(int data){
        if((front+1) >= queueSize)
            resize();
        objects[++front] = data;
        count++;
    }
    
    public int pop(){
        for(int x = 0; x < count; x++){
            objects[x] = objects[x+1];
        }
        objects[count-1] = 0;
        return 0;
    }
    
    public boolean isEmpty(){
        return front <= rear;
    }
    
    private void resize(){
        int[] temp = objects;
        queueSize = queueSize * 2;
        objects = new int[queueSize];
        
        for(int i = 0; i <= front; i++){
            objects[i] = temp[i]; 
        }
    }
    
    public void show(){
        for(int i = 0; i < count; i++){
            System.out.print(objects[i] + " ");
        }
        System.out.println();
    }
    
    public int recursion(int fact)
    {
        if (fact <= 1)
            return 1;
        else    
            return fact * recursion(fact-1);
    }
}

