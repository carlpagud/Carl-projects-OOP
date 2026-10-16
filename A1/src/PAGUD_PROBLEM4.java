void main () {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter an integer number between 0 to 1000: ");
    short num = sc.nextShort();

    if (num >= 0 && num <= 1000) {
        short sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println("Sum of all digits: " + sum);
    } else {
        System.out.println("Not within the range. ");
    }
}
