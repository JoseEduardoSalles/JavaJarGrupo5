/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overviewmonitoringz.view;

import java.io.IOException;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import overviewmonitoring.controller.Controller;
import overviewmonitoring.model.TbComputador;
import overviewmonitoring.model.TbFuncionario;

/**
 *
 * @author Larissa
 */

public class DockerView {

//    public static void main(String[] args) {
//
//        Controller controllerSqlServer = new Controller();
//        Controller controllerMySql = new Controller("MySql");
//        String usuarioFuncionario = System.getenv("usuario");
//        String senhaFuncionario = System.getenv("senha");
//        TbFuncionario tbFuncionarioSqlServer;
//        TbFuncionario tbFuncionarioMySql;
//        TbComputador tbComputadorSqlServer;
//        TbComputador tbComputadorMySql;
//
//        //Login
//        String retornoLoginSqlServer = controllerSqlServer.login(usuarioFuncionario, senhaFuncionario);
//        String retornoLoginMySql = controllerMySql.login(usuarioFuncionario, senhaFuncionario);
//
//        // Verificacao
//        if (!retornoLoginSqlServer.equals("OK") && !retornoLoginMySql.equals("Ok")) {
//            System.exit(1);
//        }
//
//        // Identificacao do usuario e Maquina
//        tbFuncionarioSqlServer = controllerSqlServer.getFuncionario();
//        tbFuncionarioMySql = controllerMySql.getFuncionario();
//        tbComputadorSqlServer = controllerSqlServer.getComputador();
//        tbComputadorMySql = controllerMySql.getComputador();
//
//        Timer timer = new Timer();
//        Integer seg = 1000;
//        Boolean run = true;
//
//        TimerTask tarefa = new TimerTask() {
//            @Override
//            public void run() {
//                try {
//                    Integer usoCPUSqlServer = controllerSqlServer.getDesempenhoCpu();
//                    Integer usoCPUMySql = controllerMySql.getDesempenhoCpu();
//                    Integer usoRAMSqlServer = controllerSqlServer.getDesempenhoRam();
//                    Integer usoRAMMySql = controllerMySql.getDesempenhoRam();
//
//                    controllerSqlServer.insertDesempenhoMaquina(tbComputadorSqlServer.getIdTbComputador(), usoCPUSqlServer, usoRAMSqlServer);
//                    controllerMySql.insertDesempenhoMaquina(tbComputadorMySql.getIdTbComputador(), usoCPUMySql, usoRAMMySql);
//
//                } catch (Exception ex) {
//                    System.out.println(ex);
//                }
//            }
//        };
//        if (run) {
//            timer.scheduleAtFixedRate(tarefa, 0, seg);
//        }    
//
//    }
}
