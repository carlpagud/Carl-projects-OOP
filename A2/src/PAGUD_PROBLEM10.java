void main () {
    Scanner sc = new Scanner(System.in);

    float num, high = 0, low = 0;
    String choice;
    boolean first = true;

    while (true) {
        System.out.print("Enter score or 'stop': ");
        choice = sc.nextLine();

        if (choice.equals("stop")) break;

        num = Short.parseShort(choice);

        if (first) {
            high = num;
            low = num;
            first = false;
        } else  {
            if (num > high) high = num;
            if (num < low) low = num;
        }
    }
    System.out.println("\nThe highest score is " + high);
    System.out.println("\nThe lowest score is " + low);
}