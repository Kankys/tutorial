package Tutorial;

// Podmínkové operátory
// && operátor end (musí být obě pravdivé)
// || operátor or (nebo, musí být aspoň jeden výraz pravdivý)
 
public class tutorial4 {
    public static void main(String[] args) {
        int promenna1 = 20;
        int promenna2 = 15;

        if(promenna1 == promenna2 && promenna1 == 20 ) { // zde se musejí rovnat obě proměnné
            System.out.println("Proměnné se rovnají");
        } else {
            System.out.println("Proměnné se nerovnají");
        }

        if(promenna1 == promenna2 || promenna1 == 20)
        System.out.println("Proměná or || aspoň jedna proměná se rovná");

        // negace , otočí true na folse a opačně
        if(!(promenna1 == promenna2)) {
            System.out.println("Proměnné se Rovnají");
         } else {
            System.out.println("Proměnné se Nerovnají");
        }


    
    }
}
