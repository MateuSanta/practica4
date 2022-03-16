package activitat3;

public class Perro extends Mascota {
    String raza = "";
    
    public Perro (String nombre, int edad, String raza) {
    super(nombre, edad);
    this.raza = raza; 
    }
    
    @Override
    public void sonido(){
        System.out.print("El perro hace guau");
    }
}
