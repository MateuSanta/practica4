package activitat3;

import java.util.Set;

/**
 * Clase abstracta persona
 * @author Mateu i Marc
 * 
 */
public abstract class Persona {

    
    private String nom;
    private int edad;
    private String dni;

    /**
     * Constructor persona con todos los parametros
     * @param nom nombre
     * @param dni dni
     * @param edad edad
     */
    public Persona(String nom,  String dni,int edad){
        this.nom = nom;
        this.edad = edad;
        this.dni = dni;
    }
    /**
     * Construcor vacio
     */
    public Persona(){}

    /**
     * 
     * @return Nom
     */
    public String getNom () {return nom;}

    /**
     * 
     * @return dni
     */
    public String getDni () {return dni;}

        /**
     * 
     * @return edad
     */
    public int getEdad () {return edad;}

    /**
     * 
     * @param nom nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }
    /**
     * edad
     * @param edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * dni
     * @param dni dni
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    
    /**
     * ToString clase persona
     */
    @Override
    public String toString() {
        return "Nom = " +nom+ "Edad = " + edad + " Dni = " + dni;
    }
}
