public abstract class Persona {
    //prova

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
    //Metodos
    public String getNom () {return nom;}
    public String getDni () {return dni;}
    public int getEdad () {return edad;}
    
}
