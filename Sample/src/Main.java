public class Main {
    static void main() {
        RegularStudent regular = new RegularStudent("Carl", 0600, "BSIT", 1250, 13000);
        ScholarStudent scholar = new ScholarStudent("Edielyn", 0656, "BSCS", 1345, 12900);

        IO.println("Regular Student");
        regular.displayInfo();
        IO.println("Tuition Fee: " + regular.getTuitionFee());

    }
}
