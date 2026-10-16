void main () {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter your Monthly Income: ");
    float income = sc.nextFloat();

    System.out.print("Enter Credit Score Rating: ");
    byte credit = sc.nextByte();

    System.out.print("Enter active Loan Count: ");
    byte loan = sc.nextByte();

    if (income >= 50000 && credit >= 750 && loan < 1) {
        System.out.println("Loan Approved!");
    } else if (income >= 35000 && credit >= 800) {
        System.out.println("Loan Approved!");
    } else if (income >= 30000 && credit >= 700 && loan == 0) {
        System.out.println("Loan Approved!");
    } else {
        System.out.println("Loan Not Approved!");
    }
}