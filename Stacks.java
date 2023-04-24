

public class Stacks 
{
	int Stack[] = new int[10];
	int top = 0;
	
	public void push(int data)
	{
            if(top == 10)
            {
		System.out.println("Stack is full");
            }
		
	else
            {
		Stack[top] = data;
		top++;
            }
	}
	
	public void show()
	{
            for(int n: Stack)
            {
		System.out.print(n + " ");
            }
            System.out.println();
	}
	
	public int pop()
	{
            int data = 0;
            if(isEmpty())
            {
                System.out.println("Stack is empty !");
            }
		
            else
            {
                top--;
                data = Stack[top];
                Stack[top] = 0;
            }
            return data;
	}
	
	public boolean isEmpty()
	{
            return top <= 0;
	}
}