package activitat3;

public class Perro extends Mascota {
    String raza = "";
    
    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad);
        this.raza = raza; 
    }
    
    public Perro(){
        super();
    }

    // Getter&Setters
    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public void sonido(){
        System.out.print("El perro hace guau");
    }


}
