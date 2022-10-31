package Tutorial;

// větvení, příkaz if podobná funkce jako boolean

public class tutorial3 {
    public static void main(String[] args) {
        int promenna1 = 20;
        int promenna2 = 15;
        // porovná dve cisla pokud se rovnají == vypíše System...hlášku pokud se nerovnají nic nevypíše
        // použít můžeme != a to že se nerovnají

        if(promenna1 == promenna2) {
            System.out.println("Proměnné se rovnají");

        } else { // pomocí else ošetříme podmínku a vypíšeme že se promenné nerovnají, můžeme použít i níže opačně
            System.out.println("Proměnné se nerovnají :-)");
        }

        if(promenna1 != promenna2) {
            System.out.println("Proměnné se nerovnají");
        }
    }
    
}
