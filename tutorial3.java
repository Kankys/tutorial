package tutorial.lukan;
// zde probereme základy z matematiky , Matematické operace
public class tutorial3 {
    public static void main(String[] args) {
        float celeCislo = 15;
        float celeCislo2 = 10;
        float vyraz = celeCislo * celeCislo2 + celeCislo;

        System.out.println(celeCislo + celeCislo2);
        System.out.println(celeCislo - celeCislo2);
        System.out.println(celeCislo * celeCislo2);
        System.out.println(celeCislo / celeCislo2);  // při dělení používát float, int nezobrazí destiná čísla!!
        System.out.println(vyraz);

        int celeCislo3 = 15;
        int celeCislo4 = 10;
        System.out.println(celeCislo3 % celeCislo4); // operátor modulo, zobrazí rozdíl
    }

}

