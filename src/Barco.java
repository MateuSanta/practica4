package activitat3;
import java.util.Date;



public class Barco implements interfaceSonido {
    private String nombre = "";
    private Date fechaConstruccion;
    private int numCamarotes;
    private Motor motor;
    
    public Barco() {}
    
    public Barco(String nombre, Date fechaConstruccion, int numCamarotes, String fabricante, String potencia, int codigo) {
        this.nombre = nombre;
        this.fechaConstruccion = fechaConstruccion;
        this.numCamarotes = numCamarotes;
        this.motor = new Motor(fabricante, potencia, codigo);  
    }

    public String getNombre() {return nombre;}
    public Date getFechaConstruccion() {return fechaConstruccion;}
    public int getNumCamarotes() {return numCamarotes;}

    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setFechaConstruccion(Date fechaConstruccion) {this.fechaConstruccion = fechaConstruccion;}
    public void setNumCamarotes(int numCamarotes) {this.numCamarotes = numCamarotes;}  
    
    @Override
    public void sonido(){
        System.out.print("El motor suena...");
    }
    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return  "nombre = " + this.nombre + "fecha construccion = " + fechaConstruccion + " numero camarotes = " + numCamarotes +
        "motor = " + this.motor;
    }
}
