package activitat3;

public abstract class Mascota implements interfaceSonido{
    String nombre = "";
    int edad;

    public Mascota(String nombre, int edad) {
        this.edad = edad;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
     
    
}
