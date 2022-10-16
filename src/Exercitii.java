import java.util.Scanner;

public class Exercitii {
    int a;

    public int getA() {
        return a;
    }

    int b;

    public int getB() {
        return b;
    }

    int ex;

    public int getEx() {
        return ++ex;
    }

    String exercitiul;

    public String getExercitiul() {
        return "Exercitiul ";
    }

    int tema;

    public int getTema() {
        return ++tema;
    }

    String exercitiulunu;

    public String getExercitiulunu() {
        System.out.println("Tema " + getEx() + "\n" + getExercitiul() + getTema() + ": Printati \"Hello\" in consola, iar pe rand nou, printati numele vostru.");
        return "Hello\nMarilena\n";
    }

    String exercitiuldoi;

    public String getExercitiuldoi() {
        System.out.println(getExercitiul() + getTema() + ": Printati rezultatul sumei a doua numere(orice numere)");
        Scanner s = new Scanner(System.in);
        System.out.println("Introduceti primul numar: ");
        int a = s.nextInt();
        System.out.println(a);
        System.out.println("Introduceti al doilea numar: ");
        int b = s.nextInt();
        System.out.println(b);
        int sum = a + b;
        return "Suma numerelor pe care le-ati introdus (" + a + ", " + b + ") este: " + sum + "\n";
    }

    String exercitiultrei;

    public String getExercitiultrei() {
        System.out.println(getExercitiul() + getTema() + ": Printati rezultatul impartirii a doua numere.\n" +
                "Atentie, daca numarul nu este intreg, sa afiseze si valorile dupa virgula.");
        double impartit = (double) a / b;
        return "\tRezultatul pentru numerele pe care le-ati introdus (" + a + ", " + b + ") este: " + impartit + "\n";
    }
}
