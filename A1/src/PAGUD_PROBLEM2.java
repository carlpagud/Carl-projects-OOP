void main() {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter High School Point Average: ");
    float hspa = sc.nextFloat();

    System.out.print("Enter number of extracurricular activities: ");
    byte extracurricular = sc.nextByte();

    System.out.print("Enter number of service activities: ");
    byte service = sc.nextByte();

    if (hspa >= 3.8 && extracurricular >= 1 && service >= 1)  {
        System.out.println("Scholarship Candidate.");
    } else if (hspa >= 3.4 && extracurricular + service >= 3) {
        System.out.println("Scholarship Candidate.");
    } else if (hspa >= 3.0 && extracurricular >= 2 && service >= 3) {
        System.out.println("Scholarship Candidate.");
    } else {
        System.out.println("Not a Scholarship Candidate.");
    }
}