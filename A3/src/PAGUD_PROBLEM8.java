void main () {
    Scanner sc = new Scanner(System.in);

    byte [] num = new  byte [10];

    System.out.print("Enter 10 numbers: ");
    for (int i = 0; i < num.length; i++) {
        num[i] = sc.nextByte();
    }

    System.out.print("Enter target sum: ");
    byte target = sc.nextByte();

    boolean found = false;

    System.out.print("Pairs: ");
    for (int i = 0; i < num.length; i++) {
        for (int j = i + 1; j < num.length; j++) {
            if (num[i] + num[j] == target) {
                System.out.print("(" + num[i] + "," + num[j] + ")");
                found = true;
            }
        }
    }
    if (!found) {
        System.out.println("No pairs found");
    }
}