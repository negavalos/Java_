public class Main {
    public static void main(String[] args) {

        int number1 = 21;
        int number2 = 23;
        int number3 = 24;
        int resultado =  number1 + number2 + number3;
        System.out.println(resultado);
        //funcion de puertas de coche
        coche miCoche = new coche();
        miCoche.AgregarPuerta();
        miCoche.AgregarPuerta();
        miCoche.AgregarPuerta();
        System.out.println(miCoche.puerta);

    }


}
class coche{
    public int puerta = 0;
    public void AgregarPuerta(){
        this.puerta ++;
    }
}
