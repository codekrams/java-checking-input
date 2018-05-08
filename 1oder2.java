
package einsoderzwei;
import java.util.Scanner;

public class EinsOderZwei {
    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        System.out.println("Bitte wähle zwischen 1 und 2 aus.");
        int auswahl = eingabe.nextInt();
        int zaehler = 1;
        
        while (auswahl<1 | auswahl>2){
                System.out.println("Ungültige Eingabe, bitte versuche es ncoheinmal:");
                int auswahl1 = eingabe.nextInt();
                auswahl = auswahl1;
                zaehler +=1;
            }
        
        System.out.println("Du hast " + zaehler + " Versuch/e für deine Auswahl gebraucht.");
    }
}
