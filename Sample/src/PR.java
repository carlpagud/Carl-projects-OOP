void main () {
    Scanner sc = new Scanner(System.in);

    System.out.print("Customer: ");
    String name  = sc.nextLine();

    System.out.print("Product: ");
    String pro = sc.nextLine();

    System.out.print("Price: ");
    double price = sc.nextDouble();

    System.out.print("Quantity: ");
    byte quantity = sc.nextByte();

    double total = price * quantity;
    System.out.printf("Subtotal: %,.2f" , total);

    System.out.print("Enter percentage of discount: ");
    double discount = sc.nextDouble();

    double pertotal = total - discount;


}