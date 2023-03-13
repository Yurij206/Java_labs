package lab2.lab2_15;

public class lab2_15 {
        public static void main(String[] args)
        {
            Invoice mylnvoice = new Invoice();
            Invoice.Item newltem = new Invoice.Item ("Blackwell Toaster", 2, 19.95);
            mylnvoice.add(newltem);
            mylnvoice.print();
        }
}
