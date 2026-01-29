public class Main {
void main (){
    //opgave 1

    double vare1 = 25.50;

    double vare2 = 15.00;

    double vare3 = 30.00;

    double subtotal = 25.50+15.00+30.00;

    double momsProcent=0.25;

    double samletPris = 70.50+(70.50*0.25);

    System.out.print(subtotal+samletPris);

// opgave 2

    double mad = 450.0;

    double drikkevarer= 120.0;

    double drikkePenge = 50.0;

    int antalPersoner = 4;

    double total = mad + drikkevarer + drikkePenge;

    double perPerson = total / antalPersoner;

    System.out.println(perPerson);

}

}
