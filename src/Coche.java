public class Coche {
    //Atributos
    private int noPuertas;

    //Metodos
    public void addDoor(){
        noPuertas++;
    }

    public void delDoor(){
        noPuertas--;
    }
    public int getPuertas(){
        return noPuertas;
    }

    //Constructor
    public Coche(){
    noPuertas = 4;
    }
}


