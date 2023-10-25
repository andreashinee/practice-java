public class exercici6 {

    public static void main(String[] args) {
        //creem les tres constants
        int edat = 50; //aquesta serà la constant editable
        //curs i cicle ho deixem a 0 ja que en els condicionals (en vers l'edat) anirem modificant els valors
        int curs = 0;
        int cicle = 0;

        if (edat < 3) {
            System.out.println("És massa petit");
        } else if (edat < 6) {
            cicle = 0;
        } else if (edat < 7) {
            curs = 1;
            cicle = 1;
        } else if (edat < 8) {
            curs = 2;
            cicle = 1;
        } else if (edat < 9) {
            curs = 3;
            cicle = 2;
        } else if (edat < 10) {
            curs = 4;
            cicle = 2;
        } else if (edat < 11) {
            curs = 5;
            cicle = 3;
        } else if (edat < 12) {
            curs = 6;
            cicle = 3;
        } else {
            System.out.println("És massa gran");
        }

        if (curs > 0) {
            switch (cicle) {
                case 0:
                    System.out.println("És d'educació infantil");
                    break;
                case 1:
                    System.out.println("És d'educació primària. Cicle inicial.");
                    break;
                case 2:
                    System.out.println("És d'educació primària. Cicle mitjà.");
                    break;
                case 3:
                    System.out.println("És d'educació primària. Cicle superior.");
                    break;
            }
            System.out.println("Curs: " + curs);
        }
    }

}
