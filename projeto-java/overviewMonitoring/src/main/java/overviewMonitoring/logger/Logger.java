/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overviewmonitoring.logger;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;

/**
 *
 * @author Larissa
 */
public class Logger {

    public String nomeLog() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss");
        String DataHora = dtf.format(LocalDateTime.now());
        return DataHora;
    }

    public String dataHora() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        String DataHora = dtf.format(LocalDateTime.now());
        return DataHora;
    }

    public void criarLog(String texto, String nome) throws IOException {
        File arq = new File("C:\\Users\\jecsa\\Desktop\\Relatórios\\" + nomeLog() + nome + ".txt");
        arq.createNewFile();
        PrintWriter logArq = new PrintWriter(arq);
        logArq.write(dataHora()
                + "\n- - - -\n"
                + texto
                + "\n- - - -");
        //arq.close();
    }

}
