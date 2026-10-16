void main () {
    Scanner sc = new Scanner (System.in);

    short num, largest = 0, second = 0;

    System.out.print("Enter a number: ");
    num = sc.nextShort();

    while (num >= 0) {
        if (num > largest) {
            second = largest;
            largest = num;
        } else if (num > second) {
            second = num;
        }
        System.out.print("Enter a number: ");
        num = sc.nextShort();
    }
    System.out.println("Second largest number: " + second);
}