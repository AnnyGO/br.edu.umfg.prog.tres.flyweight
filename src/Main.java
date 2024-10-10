public class Main {
    public static void main(String[] args) {
        FormaManager formaManager = new FormaManager();
        formaManager.addForma("Vermelho", "0,0", 10);
        formaManager.addForma("Verde", "1,1", 20);
        formaManager.addForma("Azul", "2,2", 30);
        formaManager.addForma("Vermelho", "3,3", 15);
        formaManager.addForma("Vermelho", "4,4", 25);

        formaManager.apresentar();
    }}
