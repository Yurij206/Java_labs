package lab2.lab2_17;

class Queue
{
    static class Node
    {
        Node next, prev;
        String item;
        Node(Node prev, Node next, String item)
        {
            this.prev = prev;
            this.next = next;
            this.item = item;
        }
    }
    Node head, tail;
    class Iterator
    {
        Node node;
        Iterator()
        {
            this.node = head;
        }
        Node next()
        {
            Node ret = node;
            node = node.next;
            return ret;
        }
        boolean hasNext()
        {
            return node != null;
        }
    }
    public Iterator iterator()
    {
        return new Iterator();
    }
    public Queue()
    {
        head = tail = null;
    }
    Queue add(String str)
    {
        Node last = new Node(tail, null, str);
        if (tail != null)
            tail.next = last;
        tail = last;
        if (head == null)
            head = last;
        return this;
    }
    Queue remove()
    {
        head = head.next;
        return this;
    }
}
