void main () {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a positive integer: ");
    byte num = sc.nextByte();

    System.out.println("Output:");

    while (num % 2 == 0 && num > 0) {
        System.out.println(2);
        num /= 2;
    }

    System.out.println("Remaining number: " + num);
}