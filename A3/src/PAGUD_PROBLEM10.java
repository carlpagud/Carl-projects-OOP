void main() {
    Scanner sc = new Scanner(System.in);

    float[] a = new float[10];
    float sum = 0;

    System.out.print("Enter 10 numbers: ");
    for (int i = 0; i < 10; i++) {
        a[i] = sc.nextFloat();
        sum += a[i];
    }

    float average = sum / 10;
    float difference = Math.abs(a[0] - average);
    float closest = a[0];

    for (int i = 1; i < 10; i++) {
        float d = Math.abs(a[i] - average);

        if (d < difference) {
            difference = d;
            closest = a[i];
        }
    }
    System.out.println("Average: " + average);
    System.out.println("Closest to average: " + closest);
}
