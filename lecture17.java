package cipherschools;

class MinStack 
{
    class Node
    {
        int value;
        int min;
        Node next;

        Node(int value, int min)
        {
            this.value = value;
            this.min = min;
            next = null;
        }
    }
    Node head;


    void push(int x)
    {
        if (head == null)
        {
            Node n = new Node(x, x);
            head = n;
        }
        else
        {
            Node n = new Node(x, Math.min(x, head.min));
            n.next = head;
            head = n;
        }
    }


    void pop()
    {
        if (head != null)
        {
            head = head.next;
        }
    }


    int top()
    {
        if (head != null)
        {
            return head.value;
        }

        return -1;
    }


    int getMin() 
    {
        if (head != null)
        {
            return head.min;
        }

        return -1;
    }


    public static void main(String args[]) 
    {
        MinStack s = new MinStack();
        s.push(2);
        s.push(10);
        s.push(12);
        s.push(5);
        s.push(18);

        System.out.println(s.getMin());
    }
}
