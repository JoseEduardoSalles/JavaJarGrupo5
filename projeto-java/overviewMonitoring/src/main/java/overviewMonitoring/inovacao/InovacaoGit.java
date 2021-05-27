/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overviewMonitoring.inovacao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author Larissa
 */
public class InovacaoGit {
    
    public String criandoTxt() throws FileNotFoundException, IOException {
        
        String recebeArray = null;

        // OBJETO URL - responsável por transformar uma "String" em uma URL 
        URL url = null;

        //Objeto da classe File 
        //Você vai passar o caminho com uma pasta já existente e o nome do arquivo
        //que será gerado!
        File file = new File("C:\\TesteInovacao\\TesteString.txt");

        //Aqui ele faz a busca da url e se for encontrada, a classe LoadPage()
        //criará o arquivo no caminho que você passou o "file" com o conteúdo
        //presente no html da página, ou seja, funciona em qualquer site que
        //contenha String. 
        try {
            url = new URL("https://api.github.com/repos/HananOrtiz/GRUPO-5-2ADSA/commits");
            new LoadPage().getPage(url, file);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        //Após criar o arquivo .txt ou .dat, vamos ler o arquivo com um objeto
        //da classe "FileReader".
        FileReader ler = new FileReader(file);

        //BufferedReader serve para analisar se chegou o fim do arquivo ou ir para
        //a proxima linha do arquivo
        //apelidei br porque pula linha (HTML)
        BufferedReader br = new BufferedReader(ler);

        for (; br.ready();) {

            //gravei o conteúdo do arquivo gerado nessa String recebeArray
            recebeArray = br.readLine();

            System.out.println(recebeArray);
        }

        //precisamos fechar esses dois objetos após concluir o fim do arquivo
        ler.close();
        br.close();
        
        return recebeArray;
    }
    
}
