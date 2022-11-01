package tutorial.lukan;


// příklad switch používá se místo if pokud potřebujeme porovnat více hodnot z jednou proměnnou

public class tutorial7 {
    public static void main(String[] args) {

        //int celeCislo = 10;

    /*if(celeCislo == 5)
        System.out.println("Promenná je rovna 5");
    else if(celeCislo == 8)
        System.out.println("Proměnná je rovna 8");
    else if(celeCislo == 10)
        System.out.println("Proměnná je rovna 10"); */

        // switch - proměná musí být datový primitvní tip: byte, int, if, char, string atd. Nefungují zde třídy z objektového programovaní
        // case - (kejs) značí porovnávaní
        // break - (brejk) bez breake by se provedli všechny case
        // v tomto příkladě už musíme použít { } (více řádků)
        int celeCislo = 8;
        switch(celeCislo) {
            case 5:
                System.out.println("Proměnná je Rovna 5"); break;
            case 8:
                System.out.println("Proměnná je Rovna 8"); break;
            case 10:
                System.out.println("Proměnná je Rovna 10"); break;
        }
        //System.exit(0); // kdyby psal chybu program , tím ukončime metodu main

    }
}

