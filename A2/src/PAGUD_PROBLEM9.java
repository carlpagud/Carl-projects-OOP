void main () {
    Scanner sc = new Scanner(System.in);

    char choice;
    float temp, result;

    System.out.print("Enter 'c'  for Celcuis and 'f' for Farenheit: ");
    choice = sc.next().charAt(0);

    System.out.print("Enter temperature: ");
    temp = sc.nextFloat();

    if (choice == 'c') {
        result = (temp * 9 / 5) + 32;
        System.out.println("Celcius is " + result);
    } else if (choice == 'f') {
        result = (temp - 32) * 5 / 9;
        System.out.println("Farenheit is " + result);
    } else {
        System.out.println("Invalid input!");
    }
}