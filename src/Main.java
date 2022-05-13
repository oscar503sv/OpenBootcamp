public class Main {
    public static void main(String[] args) {

        int resultadoSuma = sumar(5, 10, 69);
        System.out.println("El resultado de la suma es: "+resultadoSuma);
        Coche miCoche = new Coche();
        int puertas = miCoche.getPuertas();
        System.out.println("El coche tiene "+puertas+" puertas");
        miCoche.addDoor();
        puertas = miCoche.getPuertas();
        System.out.println("El coche tiene "+puertas+" puertas");
        miCoche.delDoor();
        puertas = miCoche.getPuertas();
        System.out.println("El coche tiene "+puertas+" puertas");
    }
    public static int sumar(int a, int b, int c){

        return (a + b + c);
    }
}

