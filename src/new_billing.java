import java.util.Scanner;
public class new_billing {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter the Quantity of food: ");
        int items = sn.nextInt();
        sn.nextLine();
        double total = 0;
        for (int i = 1; i <= items; i++) {
            System.out.print("Enter name of the  food " );
            String Name = sn.nextLine();
            System.out.print("Enter the quantity of food  " );
            int quantity = sn.nextInt();
            System.out.print("Enter the price  "  );
            double price = sn.nextDouble();
            double Total_item = quantity * price;
            total += Total_item;
            sn.nextLine();
        }
        double vat = total * 0.05;
        double discount = total * 0.10;
        double Total = (total + vat) - discount;
        System.out.println("Total amount is : Rs" + total);
        System.out.println("Total amount after 5% VAT is : Rs" + vat);
        System.out.println("Total amount after 10% Discount is: Rs" + discount);
        System.out.println(" Total amount after discount and vat is: Rs" + Total);

    }
}