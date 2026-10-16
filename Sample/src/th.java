void main () {
    Scanner sc = new Scanner(System.in);

    byte [] num = new byte[8];

    float sum = 0;
    float ave = 0;

    System.out.println("[Enter 8 scores]");
    for (short i = 0; i < num.length; i++) {
        System.out.print("Enter number " + (i + 1) + ": ");
        num[i] = sc.nextByte();
        sum += num[i];
    }

    ave = sum / num.length;
    System.out.println("Average score is " + ave);

    System.out.print("Scores below average: ");
    for (byte b : num) {
        if (b < ave) {
            System.out.print(b + " ");
        }
    }
    System.out.println();
}