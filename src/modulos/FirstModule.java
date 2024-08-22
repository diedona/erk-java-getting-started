package modulos; // esse nome fui eu que escolhi, podia ser batatinha

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FirstModule {
    
    public void ExecuteModule() {

        System.out.println("Isso aqui vem do FirstModule.java!");
        this.MakePrints();        

    }

    private void MakePrints() {
        System.out.println("Uma linha normal");
        System.out.printf(
            "Uma linha normal concatenando informações: %d dias em um ano, %d meses em um ano", 
            365,    /* <- primeira variavel */
            12              /* <- segunda variavel */
        );

        System.out.println(); // só pra pular linha

        // TIPO DE VARIAVEL NOVA
        // essa classe sabe nos dizer a data/hora
        LocalDateTime dataHora = LocalDateTime.now();

        System.out.printf(
            "Hoje é dia %d do mês %d do ano %d",
            dataHora.getDayOfMonth(),
            dataHora.getMonthValue(),
            dataHora.getYear()
        );

        System.out.println();

        // vou usar uma outra classe para formatar os dados bonitinho
        DateTimeFormatter formatadorDataHora = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        // estou guardando numa variavel só pra vc ver que pode
        String dataHoraFormatada = formatadorDataHora.format(dataHora);

        System.out.printf(
            "Olha a hora: %s",
            dataHoraFormatada
        );
    }

}
