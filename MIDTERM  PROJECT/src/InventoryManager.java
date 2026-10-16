import java.util.ArrayList;
import java.util.Scanner;

public class InventoryManager {
    static void main() {

        Scanner scan = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();

        char choice;

        do {
            System.out.println("\n=== Inventory Management System ===");
            System.out.println("A. Add New Product");
            System.out.println("B. Remove Product by Code");
            System.out.println("C. Update Product Stock by Code");
            System.out.println("D. Display All Products");
            System.out.println("E. Exit");
            System.out.print("Choose an option: ");

            choice = Character.toUpperCase(scan.nextLine().charAt(0));

            switch (choice) {

                case 'A':
                   IO.print("Enter product name: ");
                    String name = scan.nextLine();

                    IO.print("Enter product code: ");
                    String code = scan.nextLine();

                    double price;

                    do {
                        IO.print("Enter price: ");
                        price = Double.parseDouble(scan.nextLine());

                        if (price <= 0) {
                            IO.println("Price must be greater than 0.");
                        }

                    } while (price <= 0);

                    int stock;
                    do {
                        IO.print("Enter stock quantity: ");
                        stock = Integer.parseInt(scan.nextLine());

                        if (stock < 0) {
                            IO.println("Stock quantity cannot be negative.");
                        }

                    } while (stock < 0);

                    Product product = new Product(name, code, price, stock);
                    products.add(product);

                    IO.println("Product added successfully.");
                    break;

                case 'B':
                   IO.print("Enter product code to remove: ");
                    String removeCode = scan.nextLine();

                    Product productToRemove = null;

                    for (Product p : products) {
                        if (p.getProductCode().equalsIgnoreCase(removeCode)) {
                            productToRemove = p;
                            break;
                        }
                    }

                    if (productToRemove != null) {
                        products.remove(productToRemove);
                        IO.println("Product removed successfully.");
                    } else {
                        IO.println("Product not found.");
                    }

                    break;

                case 'C':
                    IO.print("Enter product code to update: ");
                    String updateCode = scan.nextLine();

                    Product productToUpdate = null;

                    for (Product p : products) {
                        if (p.getProductCode().equalsIgnoreCase(updateCode)) {
                            productToUpdate = p;
                            break;
                        }
                    }

                    if (productToUpdate != null) {

                        int newStock;
                        do {
                            IO.print("Enter new stock quantity: ");
                            newStock = Integer.parseInt(scan.nextLine());

                            if (newStock < 0) {
                                IO.println("Stock quantity cannot be negative.");
                            }

                        } while (newStock < 0);
                        productToUpdate.setStockQuantity(newStock);

                        IO.print("Stock updated successfully.");

                    } else {
                        IO.println("Product not found.");
                    }

                    break;

                case 'D':
                    if (products.isEmpty()) {
                        IO.println("No products in inventory.");
                    } else {
                        IO.println("\n=== Product List ===");

                        for (Product p : products) {
                            p.displayProduct();
                        }

                        IO.println("------------------------------");
                        IO.println("Total unique products: " + products.size());
                    }

                    break;

                case 'E':
                    IO.println("Exiting Inventory Management System.");
                    break;

                default:
                    IO.println( "Invalid option. Please choose A, B, C, D, or E.");
            }

        } while (choice != 'E');
    }
}