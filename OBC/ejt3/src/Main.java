public class Main {
    public static void main(String[] args) {
        //PRIMERA PARTE
        int resultado;
        resultado = suma(10,20,30);
        System.out.println(resultado);

        //SEGUNDA PARTE
        Coche miCoche = new Coche();
        miCoche.IncrementarPuerta();
        System.out.println(miCoche.puerta);

    }

    public static int suma(int a, int b, int c){
        return a + b+ c;
    }
}
class Coche{
    public int puerta = 3;

    public void IncrementarPuerta(){
        this.puerta++;
    }

}