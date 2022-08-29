public class Main {
    public static void main(String[] args) {

        int numeroIf = 0;
        int numeroWhile = 0;
        int numeroDoWhile =0;
        var estacion = "primavera";

        System.out.println("CONDICION IF"); //Para hacer agradable la vista en el terminal.

        if (numeroIf > 0) {
            System.out.println("El numero " + numeroIf + " es positivo");
        } else if (numeroIf < 0) {
            System.out.println("El numero " + numeroIf + " es negativo");
        } else {
            System.out.println("El numero es 0");
        }

        System.out.println("--------------- \n BUCLE WHILE"); //Para hacer agradable la vista en el terminal.

        while (numeroWhile < 3 ) {
            System.out.println(numeroWhile);
            numeroWhile = numeroWhile + 1;
        }

        System.out.println("--------------- \n BUCLE DO WHILE"); //Para hacer agradable la vista en el terminal.

        do {
            System.out.println(numeroDoWhile);
            numeroDoWhile = numeroDoWhile + 1;
        } while (numeroDoWhile == 0);

        System.out.println("--------------- \n BUCLE FOR"); //Para hacer agradable la vista en el terminal.

        for (int numeroFor = 0; numeroFor <= 3; numeroFor = numeroFor + 1) {
            System.out.println(numeroFor);
        }

        System.out.println("--------------- \n SWITCH"); //Para hacer agradable la vista en el terminal.

        switch (estacion) {
            case "primavera":
                System.out.println("Estamos en primavera");
                break;
            case "verano":
                System.out.println("Estamos en verano");
                break;
            case "otoño":
                System.out.println("Estamos en otoño");
                break;
            case "invierno":
                System.out.println("Estamos en invierno");
                break;
            default:
                System.out.println("El nombre escogido no corresponde a ninguna estación");
        }
    }
}