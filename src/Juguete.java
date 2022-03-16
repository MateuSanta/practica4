package activitat3;

public class Juguete {

    //Atributs
    private String nom;
    private int preu;
    private int edadR;

    //metodos
    public Juguete(String nom, int preu, int edadR){
        this.nom = nom;
        this.preu = preu;
        this.edadR = edadR;
        
    }
   
    public Juguete() {
    }

    public String getJnom(){ return nom;};
    public int getJpreu(){ return preu;};
    public int getJedadR(){ return edadR;};

    public void setEdadR(int edadR) {
        this.edadR = edadR;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setPreu(int preu) {
        this.preu = preu;
    }

    @Override
    public String toString() {
        return 
        "[ \nNombre=" + Juguete.this.nom  + ", \nPreu=" + Juguete.this.preu + ", \nEdad Recomendada="+ Juguete.this.edadR + "]";
    }


    
}
