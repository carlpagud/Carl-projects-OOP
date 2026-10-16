void main () {

        double mexico = 114000000;
        double usa = 312000000;

        byte years = 0;

        while (mexico <= usa) {

            mexico = mexico * 1.0101;
            usa = usa * 0.9985;

            years++;

            System.out.println("Year " + years);
            System.out.println("Mexico Population: " + mexico);
            System.out.println("USA Population: " + usa);
            System.out.println();
        }

        System.out.println("It took " + years + " years.");
    }

