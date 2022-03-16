package activitat3;


public class Motor {
    private String fabricante = "", potencia = "";
    private int codigo;

    public Motor(String fabricante, String potencia, int codigo) {
        this.fabricante = fabricante;
        this.potencia = potencia;
        this.codigo = codigo;
    }

    public String getFabricante() {return fabricante;}
    public String getPotencia() {return potencia;}
    public int getCodigo() {return codigo;}

    public void setFabricante(String fabricante) {this.fabricante = fabricante;}
    public void setPotencia(String potencia) {this.potencia = potencia;}
    public void setCodigo(int codigo) {this.codigo = codigo;}

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "fabricante = "+ this.fabricante+" potencia = " + this.potencia +"codigo = " + this.codigo;
    }
}
