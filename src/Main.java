public class Main {
    void main() {
        //opgave 1

        double vare1 = 25.50;

        double vare2 = 15.00;

        double vare3 = 30.00;

        double subtotal = 25.50 + 15.00 + 30.00;

        double momsProcent = 0.25;

        double samletPris = 70.50 + (70.50 * 0.25);

        System.out.print(subtotal + samletPris);

// opgave 2

        double mad = 450.0;

        double drikkevarer = 120.0;

        double drikkePenge = 50.0;

        int antalPersoner = 4;

        double total = mad + drikkevarer + drikkePenge;

        double perPerson = total / antalPersoner;

        System.out.println(perPerson);

// opgave 3

        double oprindeligPris = 300.0;

        double rabatProcent = 0.20;

        double prisMedRabat = oprindeligPris - (oprindeligPris * rabatProcent);

        double moms = 0.25;

        double endeligPris = prisMedRabat + (prisMedRabat * moms);

        System.out.println(oprindeligPris);

        System.out.println(prisMedRabat);

        System.out.println(endeligPris);

// opgave 4

        int gaester = 15;

        int cupcakes = 40;

        int prPerson = cupcakes / gaester;

        int tilOvers = cupcakes % gaester;

        System.out.println(tilOvers);

        System.out.println(prPerson);

//opgave 5

        StringBuilder sb = new StringBuilder();
        sb.append("Hello everyone");

        String name = "Anna";

        int age = 25;

        sb.append("hello");
        sb.append(name);
        sb.append("!");
        sb.append("you are");
        sb.append(age);
        sb.append("years old");

        System.out.println(sb);






 //opgave 6

        int score = 100;

        System.out.println(score);

         score =+ 50;

         System.out.println(score);

         score =+ 25;

         System.out.println(score);

//opgave 7

        int liv = 100;

        liv -= 15;

        System.out.println(liv);

        liv -= 20;

        System.out.println(liv);

//opgave 8

        int pris = 100;

        System.out.println(pris);

        pris *= 2;

        System.out.println(pris);

//opgave 9

    int taeller = 10;

    System.out.println(taeller);

    taeller++;

    System.out.println(taeller);

    taeller--;

    System.out.println(taeller);

 //opgave 10

        int tal= 10;

        tal += 5;

        System.out.println(tal);

        tal -= 3;

        System.out.println(tal);

        tal++;

        System.out.println(tal);

        tal--;

        System.out.println(tal);

 // opgave 11

        String salg = "laptop";

        double price= 7999.9;

        boolean multiple = true;

        int leftover = 15;

        double rabat = 0.10;

        String produkter = "Electronics";




    }
}
