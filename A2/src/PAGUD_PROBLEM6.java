void main () {
    Scanner sc = new Scanner (System.in);

    short [] num = new short[10];
    short sum = 0;
    float average;

    System.out.println("[Enter 10 numbers]");
    for (short i = 0; i < 10; i++) {
        System.out.print("\nEnter " + (i + 1) + " number: ");
        num[i] = sc.nextShort();
        sum += num[i];
    }
    average = sum/10;

    System.out.println("\nAverage: " + average);

    System.out.println("\nNumbers above average: ");
    for (short i = 0; i < 10; i++) {
        if (num[i] > average) {
            System.out.print(num[i] + " ");
        }
    }
}