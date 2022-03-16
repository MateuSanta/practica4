public class Adult extends Persona {
    
    //Atributs
    private int nss;
    private String dir;

    //Constructor
    public Adult( String nom,  String dni,int edad){
        super(nom,dni,edad);
        this.nss = nss;
        this.dir = dir;

    }

    //Metodos
    public void setAdult(int nss, String dir){
        this.nss = nss;
        this.dir = dir;
    }
    public void mostrarAdult() {
        System.out.println ("Adult li diven: " + getNom()  + " El dni es " +  getDni() +

         " te una edad de  " + getEdad () + " el nombre de nss es "+ this.nss + " i la seva direcció es "+this.dir); 
    }
}
