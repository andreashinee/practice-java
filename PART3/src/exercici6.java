public class exercici6 {
    public static void main(String[] args) {

        double temperatura = 38; //variable temperatura
        int edat = 3; //variable edat
        double pes = 10; //variable pes

        if (temperatura < 38) {
            System.out.println("El nen està bé.");
        } else {
            if (temperatura < 39) {
                System.out.println(" Es recomanable donar-li un bany per baixar temperatura.");
            } else {
                if (edat < 3) {
                    System.out.println("Has de consultar-ho al metge.");
                } else {
                    if (edat < 12) {
                        double dosisParacetamol = 15 * pes;
                        System.out.println("Aviso: Debes darle " + dosisParacetamol + " dosis Paracetamol cada 8h.");
                    } else {
                        double dosisParacetamol = 500;
                        System.out.println("Aviso: Debes darle " + dosisParacetamol + " dosis Paracetamol cada 8h.");
                    }

                    if (temperatura >= 40) {
                        System.out.println(" cal portar-lo a l'hospital.");
                    }
                }
            }
        }

    }
}
