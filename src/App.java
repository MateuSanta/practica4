public class App {
    public static void main(String[] args) throws Exception {
        
        Juguete jug1 = new Juguete("Barco",100,2);
        Nin nin1 = new Nin("Juan","111",12); //Prova instanciam un objecte a Nin i veim que hereda el constructor.
        Adult adult1 = new Adult("Berto","999",25);
        jug1.toString();
        
        nin1.setJuguete(jug1);
        nin1.setColegi("BorjaMoll");
        adult1.setAdult(1111,"Bunyola");
        

        adult1.mostrarAdult();
        nin1.mostrarNin();
        
        

    }
}
