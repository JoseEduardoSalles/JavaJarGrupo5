/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overviewMonitoring.inovacao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

/**
 *
 * @author Larissa
 */
public class LoadPage {

    public void getPage(URL url, File file) throws IOException {
        BufferedReader in
                = new BufferedReader(new InputStreamReader(url.openStream()));

        BufferedWriter out = new BufferedWriter(new FileWriter(file));

        String inputLine;

        while ((inputLine = in.readLine()) != null) {

            // Imprime página no console
            System.out.println(inputLine);

            // Grava pagina no arquivo
            out.write(inputLine.replace("'", " "));
            out.newLine();
        }

        in.close();
        out.flush();
        out.close();
    }
}
