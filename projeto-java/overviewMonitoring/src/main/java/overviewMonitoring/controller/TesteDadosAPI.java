/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overviewmonitoring.controller;

import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.discos.DiscosGroup;
import com.github.britooo.looca.api.group.discos.Volume;
import com.github.britooo.looca.api.group.memoria.Memoria;
import com.github.britooo.looca.api.group.processador.Processador;
import com.github.britooo.looca.api.group.sistema.Sistema;
import com.github.britooo.looca.api.util.Conversor;
import java.util.List;

/**
 *
 * @author Larissa
 */
public class TesteDadosAPI {
//    public static void main(String[] args) {

//        Looca looca = new Looca();
//        Sistema sistema = new Sistema();
//        Processador processador = new Processador();
//        Memoria memoria = new Memoria();
//        DiscosGroup grupoDeDiscos = new DiscosGroup();
//        ProcessosGroup grupoDeProcessos = new ProcessosGroup();
//
//        System.out.println("--------------------TbComputador--------------------");
//
//        String idComputador = processador.getId();
//        System.out.println("ID do Computador: " + idComputador);
//
//        String identificadorComputador = processador.getIdentificador();
//        System.out.println("Identificador do Computador: " + identificadorComputador);
//
//        String sistemaOperacional = sistema.getSistemaOperacional();
//        System.out.println("Sistema Operacional: " + sistemaOperacional);
//
//        String fabricanteComputador = sistema.getFabricante();
//        System.out.println("Fabricante do Computador: " + fabricanteComputador);
//
//        Integer arquiteturaComputador = sistema.getArquitetura();
//        System.out.println(String.format("Arquitetura do Computador: %d bits", +arquiteturaComputador));
//
//        String descricaoCpu = processador.getNome();
//        System.out.println("Descrição da CPU: " + descricaoCpu);
//
//        Long descricaoRam = memoria.getTotal();
//        System.out.println("Descrição da RAM: " + Conversor.formatarBytes(descricaoRam));
//
//        Integer QtdDiscos = grupoDeDiscos.getQuantidadeDeDiscos();
//        System.out.println("Quantidade de Discos: " + QtdDiscos);
//
////        String descricaoDiscos = Disco.getModelo();
//        System.out.println("------------TbRegistroDesempenhoMaquina-------------");
//
//        Double usoCPU = processador.getUso();
//        System.out.println(String.format("CPU em uso: %.1f ", +usoCPU));
//
//        Long usoRAM = memoria.getEmUso();
//
//        Double usoRAMD = (usoRAM / 1024.0 / 1024 / 1024);
//        Double totalRAMD = (descricaoRam / 1024.0 / 1024 / 1024);
//
//        Double porcentagemUsoRam = (usoRAMD / totalRAMD) * 100;
//        System.out.println(porcentagemUsoRam);
//
//        //Integer  = (int) Math.round(porcentagemUsoRam);
//        System.out.println("Memória em uso: " + Conversor.formatarBytes(usoRAM));
//
//        System.out.println("-------------------TbDiscoRigido/Volume-------------------");
//
//        //Long espacoDiscoR = grupoDeDiscos.getTamanhoTotal();
//        //Double espacoDiscoD = (espacoDiscoR/1024.0/1024/1024);
//        //espacoDisco = (double) Math.round(espacoDiscoD);
//        //System.out.println("Espaço do Disco Rígido: " + espacoDisco);
////        Integer qtdVolumes = grupoDeDiscos.getQuantidadeDeVolumes();
////        System.out.println("Quantidade de volumes: " +qtdVolumes);
////        
//        Integer qtdDisco = grupoDeDiscos.getQuantidadeDeDiscos();
//        System.out.println("Qtd de Discos: " + qtdDisco);
//        Long tamanhoDisco = grupoDeDiscos.getTamanhoTotal();
//        System.out.println("Espaço Total dos Discos: " + tamanhoDisco);
//
//        System.out.println("Qtd de Volumes: " + grupoDeDiscos.getQuantidadeDeVolumes());
//
//        List<Disco> listaDisco = grupoDeDiscos.getDiscos();
//        List<Volume> listaVolumes = grupoDeDiscos.getVolumes();
//
////        System.out.println(listaVolumes.get(0));
////        System.out.println(listaDisco.get(0));
//        //System.out.println(listaVolumes.get(0).getTipo());
////        System.out.println(listaVolumes.get(0).getTotal());
////        System.out.println(listaVolumes.get(1).getTotal());
////        System.out.println(listaVolumes.get(2).getTotal());
////        System.out.println(listaVolumes.get(3).getTotal());
////          System.out.println(listaVolumes.get(5).getTotal());
//
//        for (Disco i : listaDisco) {
//
//            String modeloDisco = i.getModelo();
//            System.out.println("Modelo do Disco: " + modeloDisco);
//            Long espacoDiscoL = i.getTamanho();
//            Double espacoDiscoD = (espacoDiscoL / 1024.0 / 1024 / 1024);
//            Double espacoDisco = (double) Math.round(espacoDiscoD);
//            System.out.println("Espaço do Disco: " + espacoDisco);
//
//            //Double espacoDiscoTESTE = (double) Math.round(espacoDiscoL / 1e+9);
//            //System.out.println("Teste espaco2: " + espacoDiscoTESTE);
//            //System.out.println(i.toString());
//        }
//
//        for (Volume i : listaVolumes) {
//            Long volumeDisponivelL = i.getDisponivel();
//            Double volumeDisponivelD = (volumeDisponivelL/1024.0/1024/1024);
//            Double volumeDisponivel = (double) Math.round(volumeDisponivelD);
//            
//            Long volumeTotalL = i.getTotal();
//            Double volumeTotalD = (volumeTotalL/1024.0/1024/1024);
//            Double volumeTotal = (double) Math.round (volumeTotalD);
//            
//            Double usoVolumeD = volumeTotal - volumeDisponivel;
//            Integer usoVolume = (int) Math.round(usoVolumeD);
//            System.out.println(String.format("Porcentagem de uso do volume: %d", usoVolume));           
//        }
//             
//        System.out.println("-------------------TbProcessos-------------------");
//
//        grupoDeProcessos = looca.getGrupoDeProcessos();        
//        //System.out.println(grupoDeProcessos);
//        
//        Integer totalProcessos = grupoDeProcessos.getTotalProcessos();
//        Integer totalThreads = grupoDeProcessos.getTotalThreads();
//        System.out.println("Total de Processos: " + totalProcessos);
//        System.out.println("Total de Threads: " + totalThreads);
//        
//        List <Processo> listaProcesso = grupoDeProcessos.getProcessos();
//        listaProcesso.size();
//        System.out.println(listaProcesso);
//        
//        
//        System.out.println("***Processos***");
//        for (Processo i : listaProcesso) {
//            
//            Integer pidProcesso = i.getPid();
//            String nomeProcesso = i.getNome();
//            Double cpuProcessoD = i.getUsoCpu();
//            Integer cpuProcesso = (int) Math.round(cpuProcessoD);
//            Double ramProcessoD = i.getUsoMemoria(); 
//            Integer ramProcesso = (int) Math.round(ramProcessoD);
//           
//            if (cpuProcesso > 0 && ramProcesso > 0) {
//            System.out.println(String.format(""
//                    + "PID: %d - "
//                    + "Nome: %s - "
//                    + "Cpu: %d - "
//                    + "Ram: %d ",
//                    pidProcesso, nomeProcesso, cpuProcesso, ramProcesso));
//            }
//        }
}
