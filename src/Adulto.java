package activitat3;


/**
 * Clase adulto subclase de persona
 * @author Mateu i Marc
 */
public class Adulto extends Persona {
    

    private int nss;
    private String dir;

    /**
     * Constructor completo clase adulto
     * @param nom nombre
     * @param dni dni
     * @param edad edad
     */
    public Adulto( String nom,  String dni,int edad){
        super(nom,dni,edad);
        this.nss = nss;
        this.dir = dir;

    }

    /**
     * Setter de adulto
     * @param nss
     * @param dir
     */
    public void setAdult(int nss, String dir){
        this.nss = nss;
        this.dir = dir;
    }

    /**
     * ToString clase adulto
     */
    @Override
    public String toString() {
        
        return super.toString()+ "nss = " + this.nss + "dir = " + this.dir;
    }
}
