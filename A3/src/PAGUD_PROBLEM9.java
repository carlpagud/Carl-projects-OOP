void main () {
    Scanner sc = new Scanner(System.in);

    byte[] a = new byte[5];
    byte[] b = new byte[5];

    System.out.print("Enter first 5 numbers: ");
    for (int i = 0; i < 5; i++)
        a[i] = sc.nextByte();

    System.out.print("Enter second 5 numbers: ");
    for (int i = 0; i < 5; i++)
        b[i] = sc.nextByte();

    System.out.print("Intersection: ");
    for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 5; j++) {
            if (a[i] == b[j]) {
                System.out.print(a[i] + " ");
                break;
            }
        }
    }

    System.out.print("\nUnion: ");
    for (int i = 0; i < 5; i++) System.out.print(a[i] + " ");

    for (int i = 0; i < 5; i++) {
        boolean found = false;
        for (int j = 0; j < 5; j++) {
            if (b[i] == a[j]) {
                found = true;
                break;
            }
        }

        if (!found) System.out.print(b[i] + " ");
    }
}