public class Main {

    public static void main(String[] args) {
        //PRIMER APARTADO
        int numeroIf = -1;
        System.out.println("PRIMER APARTADO:");
        if (numeroIf > 0) {
            System.out.println("El numero es positivo+");
        } else if (numeroIf < 0) {
            System.out.println("El numero es negativo-");
        } else {
            System.out.println("El numero es CERO");
        }
        //SEGUNDO APARTADO
        int numeroWhile = 0;
        System.out.println("SEGUNDO APARTADO:");
        while (numeroWhile < 3) {
            System.out.println(+numeroWhile);
            numeroWhile++;
        }
        //TERCER APARTADO
        System.out.println("TERCER APARTADO:");
        do {
            System.out.println(+numeroWhile);
            numeroWhile++;
        } while (numeroWhile <= 3);

        //CUARTO APARTADO
        System.out.println("CUARTO APARTADO:");
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(+numeroFor);
        }

        //QUINTO APARTADO
        System.out.println("QUINTO APARTADO");
        var Estacion = "VERANO";
        switch (Estacion) {

            case "INVIERNO":
                System.out.println("Es " + Estacion);
                break;
            case "VERANO":
                System.out.println("Es " + Estacion);
                break;
            case "PRIMAVERA":
                System.out.println("Es " + Estacion);
                break;
            case "OTOÑO":
                System.out.println("Es " + Estacion);
                break;
            default:
                System.out.println("No existe dicha estacion");
        }

    }

}