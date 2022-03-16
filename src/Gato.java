package activitat3;

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

}
