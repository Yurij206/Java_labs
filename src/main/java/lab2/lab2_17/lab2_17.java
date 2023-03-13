package lab2.lab2_17;

public class lab2_17 {
    public static void main(String[] args)
    {
        Queue q = new Queue();
        q.add("a");
        Queue.Iterator iter = q.iterator();
        while(iter.hasNext())
            System.out.printf("%S", iter.next().item);
        System.out.printf("\n");
        q.add("b");
        q.add("c");
        iter = q.iterator();
        while(iter.hasNext())
            System.out.printf("%S", iter.next().item);
        System.out.printf("\n");

        q.remove();
        iter = q.iterator();
        while(iter.hasNext())
            System.out.printf("%S", iter.next().item);
        System.out.printf("\n");
        q.remove();
        q.remove();
        iter = q.iterator();
        while(iter.hasNext())
            System.out.printf("%S", iter.next().item);
    }
}
