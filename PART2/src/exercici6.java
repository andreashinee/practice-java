public class exercici6 {
    public static void main(String[] args) {
        double notaProva = 7; //nota de la Prova
        double notaPractiques = 3; //nota pràctiques
        int numLliuraments = 90; // El número de les entregues que ha fet l'alumne. Msi podrà ser superior a TOTAL_LLIURAMENTS
        int TOTAL_LLIURAMENTS = 100; // El número total de les entregues

        boolean noSeguidaAC = true;

        if (notaProva < 7) {
            System.out.println("Està suspès per prova final");
        } else if (numLliuraments < 0.7 * TOTAL_LLIURAMENTS) {
            System.out.println("Està suspès. No has seguit avaluació continua.");
        } else {
            double notaFinal;
            if (numLliuraments == TOTAL_LLIURAMENTS) {
                notaFinal = 10;
            } else if (numLliuraments >= 0.9 * TOTAL_LLIURAMENTS) {
                notaFinal = 8;
            } else if (numLliuraments >= 0.8 * TOTAL_LLIURAMENTS) {
                notaFinal = 6;
            } else if (numLliuraments >= 0.7 * TOTAL_LLIURAMENTS) {
                notaFinal = 4;
            } else {
                notaFinal = 0;
            }

            notaFinal = 0.2 * notaProva + 0.1 * notaFinal + 0.7 * notaPractiques;

            if (notaFinal < 5) {
                System.out.println("Està suspès");
                if (!noSeguidaAC) {
                    System.out.println("Cal seguir avaluació contínua.");
                } else {
                    System.out.println("Fes els exercicis preparatoris per a la PAF2");
                }
            } else {
                System.out.println("Aprovat");
            }
        }
    }
}
