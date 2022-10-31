package Tutorial;

public class tutorial1 {
    public static void main(String[] args) {
        // int (datový tip) , celeCislo (proměnná) , = (operátor) , 200 (hodnota, je přiřazená do proměnné )
        int celeCislo = 200;    // datový tip int pro celé číslo
        float desetineCislo = 5.3f;  // datový tip float desetiné číslo
        double vetstiVerzeFloat = 4.45; // datový tip double, větší verze float
        boolean pravdaNepravda = false; // datový tip boolean pravda nepravda
        byte maleCislo = 127;     // datový tip krátké číslo (bájt) v rozmezí -128 až 127

        // u promnenné nastavit nutno datový tip jinak vypíše chybu
        int promenna;  
        System.out.println("Čus Sporťák!"); 
        promenna = 20;
        System.out.println(promenna);
        promenna = 50;
        System.out.println(promenna);
        System.out.println(Integer.MAX_VALUE);  // vypíše maximální a minimální hodnoty
        System.out.println(Byte.MIN_VALUE);
    }
}
