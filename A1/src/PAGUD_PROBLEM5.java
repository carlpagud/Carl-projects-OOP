void main () {
    for (byte i = 6; i >= 1; i--) {
        for (byte j = 6; j > i; j--) {
            System.out.print("  ");
        }
        for (byte j = 1; j <= i; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}