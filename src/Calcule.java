import java.util.Scanner;

public class Calcule {
    double fahrenheit;

    int tema;
    public double celsius;
    String exercitiul;

    int ex;

    String cerinta;

    String calcul;
String hello;

    public int getTema() {
        int tema = 1;
        return tema;
    }

    public String getExercitiul() {
        return "Exercitiul ";
    }

    public int getEx() {

        ++ex;

        return ex;
    }

    //    public String getCerinta() {
//        return cerinta;
//
//    }
//public double getFahrenheit(){
//    System.out.println("\n" + getEx() + " Scrieti o metoda java, care sa primeasca ca si parametru un numar, care sa reprezinte temperatura in Fahrenheit, si sa returneze temperatura in Celsius.");
//    Scanner f = new Scanner(System.in);
//    System.out.println("Introduceti temperatura in Fahrenheit: ");
//    double fahrenheit = f.nextDouble();
//    System.out.println(fahrenheit);
//
//
//    double celsius = (fahrenheit - 32) * 5 / 9;
//    //System.out.println("\n\tTemperatura in Celsius este: " + celsius);
//        return "\n\tTemperatura in Celsius este: " + celsius;
//    //return fahrenheit;
//}
    public double getCelsius() {
        System.out.println("\n" + getEx() + " Scrieti o metoda java, care sa primeasca ca si parametru un numar, care sa reprezinte temperatura in Fahrenheit, si sa returneze temperatura in Celsius.");
        Scanner f = new Scanner(System.in);
        System.out.println("Introduceti temperatura in Fahrenheit: ");
        double fahrenheit = f.nextDouble();
        System.out.println(fahrenheit);
        double celsius = (fahrenheit - 32) * 5 / 9;
        //System.out.println("\n\tTemperatura in Celsius este: " + celsius);
        return celsius;
        //return "\n\tTemperatura in Celsius este: " + celsius;

    }

//    public static gethello() {
//        System.out.println("Tema " + ex + "\n" + exercitiul + tema + ": Printati \"Hello\" in consola, iar pe rand nou, printati numele vostru.");
//        System.out.println("Hello\nMarilena\n");
//        return "Hello\nMarilena\n";
//    }


//    public String getCalcul() {
//        double celsius = (fahrenheit - 32) * 5 / 9;
//        return "\n\tTemperatura in Celsius este: " + celsius;
//    }
//    public String afiseaza() {
//        return getFahrenheit()+getCalcul();
//    }
}
