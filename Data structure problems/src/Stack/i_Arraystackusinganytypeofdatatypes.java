package Stack;

public class i_Arraystackusinganytypeofdatatypes<T>
{
        int MAX_SIZE =20;
        T[] arr=(T[]) new Object[MAX_SIZE];
        int top; //it should be int bcoz any type of datatype the ondex should be integer
        i_Arraystackusinganytypeofdatatypes()//constructor
        {
           top=-1;
        }

        void push(T val)
        {
            if(top==MAX_SIZE-1)
            {
                throw new IndexOutOfBoundsException("Stack overflow");
            }
            arr[++top]=val;
        }

        T pop()
        {
            if(top==-1)
            {
                throw new IndexOutOfBoundsException("Stack underflow");
            }
            return arr[top--];
        }
        boolean isEmpty()
        {
            return top==-1;
        }

        T peek()
        {
            return arr[top];
        }

        public static void main(String args[])
        {
            i_Arraystackusinganytypeofdatatypes<String> stack=new i_Arraystackusinganytypeofdatatypes<>();
            stack.push("Ackshaya");
            stack.push("is");
            stack.push("a");
            stack.push("Beautiful");
            System.out.println(stack.isEmpty());
            System.out.println("poped element:"+stack.pop());
            System.out.println(stack.peek());
        }
    }
