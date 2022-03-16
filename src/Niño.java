package activitat3;


public class Niño extends Persona { //Heredam el constructor de Persona(extends)
    
    //atributs
    private String colegi;
    private Juguete juguete;
    
     //Relació d'agregació Jugueta -> Nin
    //constructor
    public Niño( String nom,  String dni,int edad){
        super(nom,dni,edad);
        this.colegi = colegi;
        this.juguete = juguete;
    }
    
    //metodos
    public void setColegi(String colegi){ this.colegi = colegi;}
    public void setJuguete(Juguete juguete){this.juguete = juguete;};

    public void mostrarNin() {
        System.out.println ("Nin li diven: " + getNom()  + " El dni es " +  getDni() +
         " te una edad de  " + getEdad () + " i va a al colegi "+ this.colegi + " la jugueta: \n"
         + juguete.toString()); 
    }
    
}