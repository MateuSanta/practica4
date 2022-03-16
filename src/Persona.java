package activitat3;

import java.util.Set;

public abstract class Persona {

    //atributs
    private String nom;
    private int edad;
    private String dni;

    //constructor
    public Persona(String nom,  String dni,int edad){
        this.nom = nom;
        this.edad = edad;
        this.dni = dni;
    }

    public Persona(){}
    //Metodos
    public String getNom () {return nom;}
    public String getDni () {return dni;}
    public int getEdad () {return edad;}

    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }

    
    
    @Override
    public String toString() {
        return "Nom = " +nom+ "Edad = " + edad + " Dni = " + dni;
    }
}
