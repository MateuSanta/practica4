package activitat3;

/**
 * Clase Gato subclasse mascota
 
 */
public class Gato extends Mascota {
    String raza = "";

    public Gato(String nombre, int edad, String raza) {
        super(nombre, edad);
        this.raza = raza; 
    }
    
    @Override
    public void sonido(){
        System.out.print("El gato hace miau");
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + "raza = " +raza;
    }
}
