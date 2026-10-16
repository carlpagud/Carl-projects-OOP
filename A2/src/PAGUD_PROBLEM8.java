void main () {
    Scanner sc = new Scanner(System.in);

    short [] num = new short[100];
    short input, count = 0;

    while (true) {
        System.out.print("Enter integer numbers (0 to stop program): ");
        input = sc.nextShort();

        if (input == 0) break;

        boolean found = false;
        for (short i = 0; i < count; i++) {
            if (num[i] == input) {
                found = true;
                break;
            }
        }

        if (!found) {
            num[count] = input;
            count++;
        }
    }

    System.out.print("Distinct numbers: ");
    for (short i = 0; i < count; i++) {
        System.out.print( num[i]);
        if (i < count - 1) {
            System.out.print(", ");
        }
    }
}