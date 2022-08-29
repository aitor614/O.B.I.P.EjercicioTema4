public class Main {
    public static void main(String[] args) {

        int numeroIf = 0;
        int numeroWhile = 0;
        int numeroDoWhile =0;

        System.out.println("CONDICION IF"); //Para hacer agradable la vista en el teminal.

        if (numeroIf > 0) {
            System.out.println("El numero " + numeroIf + " es positivo");
        } else if (numeroIf < 0) {
            System.out.println("El numero " + numeroIf + " es negativo");
        } else {
            System.out.println("El numero es 0");
        }

        System.out.println("--------------- \n BUCLE WHILE"); //Para hacer agradable la vista en el teminal.

        while (numeroWhile < 3 ) {
            System.out.println(numeroWhile);
            numeroWhile = numeroWhile + 1;
        }

        System.out.println("--------------- \n BUCLE DO WHILE");

        do {
            System.out.println(numeroDoWhile);
            numeroDoWhile = numeroDoWhile + 1;
        } while (numeroDoWhile == 0);
    }
}