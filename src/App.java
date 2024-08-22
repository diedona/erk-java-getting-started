import modulos.FirstModule; // importa o package que está no FirstModule.java

public class App {

    // trazendo as outras classes ("modulos")
    private static FirstModule _firstModule = new FirstModule();

    public static void main(String[] args) throws Exception {

        System.out.println("Isso aqui vem do App.java!");
        _firstModule.ExecuteModule();
        
    }

}
