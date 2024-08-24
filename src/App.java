public class App {

    public static void main(String[] args) throws Exception {

        String[] nomes = new String[4]; // pode guardar até 4 nomes
        nomes[0] = "Diego";             // (no indice 0)
        nomes[1] = "Yuri";              // (no indice 1)
        nomes[2] = "Erick";             // (no indice 2)
        //nomes[3] = "Deivisã";         // (no indice 3) <- tente descomentar depois
        //nomes[4] = "Gu-erta";         // (no indice 4) ??? não pode! só tem espaço do 0 ao 3! descomente e rode, veja o erro
        
        System.err.printf("O primeiro nome é '%s'\n", nomes[0]); // 0 = primeiro
        System.err.printf("O terceiro nome é '%s'\n", nomes[2]); // 2 = terceiro

        System.out.println();

        ListarNomesDeUmArray(nomes);

        // tente criar um novo array de nomes (lembre de dar outro nome pra variavel: outroArrayNomes)
        // use o "ListarNomesDeUmArray" para imprimir:

        // ListarNomesDeUmArray(nomeDaSuaVariavelAquiErick);
    }

    private static void ListarNomesDeUmArray(String[] nomes) {
        for (int i = 0; i < nomes.length; i++) {
            System.err.printf("índice %d, valor: %s\n", i, nomes[i]);            
        }
    }

}
