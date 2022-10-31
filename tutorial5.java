package Tutorial;
// Cykuls While a For
public class tutorial5 {
    public static void main(String[] args) {
        
      /*  // while pokud podmínka bude true tak se bude něco dít stále do kola
        int pocitadlo = 0;
        while(pocitadlo < 20) {
            System.out.println("Číslo: " + pocitadlo); // zde + neznamená že chci sčítat, ale spojuji
            pocitadlo = pocitadlo + 1; // přičte se přikaždém průchodu 1 až do 20.

        } */


         // while pokud podmínka bude true tak se bude něco dít stále do kola
        /*  int pocitadlo = 0;
         while(pocitadlo < 20) {
             System.out.println("Číslo (příklad dva): " + pocitadlo); // zde + neznamená že chci sčítat, ale spojuji
             pocitadlo++; // ++ unární operátor 
            } */


            // for provede to samá co výše
            int pocitadlo = 0;
            for(int a = 0; a < 20; a++) {
                System.out.println("Číslo (funkce for): " + a);
            }


    }
    
}
