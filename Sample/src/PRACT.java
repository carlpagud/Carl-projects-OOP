void main () {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter size: ");
    byte size = sc.nextByte();

    byte [] num = new byte[size];

    for (byte i = 0; i < num.length; i++) {
        System.out.print("Enter number " + (i + 1) + ": ");
        num[i] = sc.nextByte();
    }

    System.out.print("Reversed numbers: ");
    for (byte i = (byte) (num.length - 1); i >= 0; i--) {
        System.out.print(num[i] + " ");
    }


}