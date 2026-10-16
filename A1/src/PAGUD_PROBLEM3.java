void main () {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter number: ");
    byte num = sc.nextByte();

    System.out.println("Output:");

    for (byte i = 2; i <= num; i++) {
        while (num % i == 0) {
            System.out.println(i);
            num /= i;
        }
    }
}