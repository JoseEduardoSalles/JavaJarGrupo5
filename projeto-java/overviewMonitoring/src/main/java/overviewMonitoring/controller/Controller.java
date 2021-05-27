/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overviewmonitoring.controller;

import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.discos.DiscosGroup;
import com.github.britooo.looca.api.group.memoria.Memoria;
import com.github.britooo.looca.api.group.processador.Processador;
import com.github.britooo.looca.api.group.sistema.Sistema;
import com.github.britooo.looca.api.util.Conversor;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.logging.Logger;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import overviewMonitoring.service.ConnectionMySql;
import overviewmonitoring.model.TbComputador;
import overviewmonitoring.model.TbFuncionario;
import overviewmonitoring.service.Connection;

/**
 *
 * @author Larissa
 */
public class Controller {

    // Cria um objeto da classe Connection
    private Connection config = new Connection();

    //Instancia um objeto da classe JdbcTemplate, que será usado para passar os comandos para o banco de dados
    private JdbcTemplate con;
    
    //Instanciando + Objetos
    private Looca looca = new Looca();
    private Sistema sistema = new Sistema();
    private Processador processador = new Processador();
    private Memoria memoria = new Memoria();
    private DiscosGroup grupoDeDiscos = new DiscosGroup();
    private TbFuncionario tbFuncionario;
    private TbComputador tbComputador;
    private Boolean login = false;
    //Logger log = new Logger();
    
    public Controller() {
        con = new JdbcTemplate(config.getDataSource());
    }
   

    // Método do Login - chamado pela view.TelaLogin
    public String login(String usuarioFuncionario, String senhaFuncionario) {

        String selectLogin = "select * from tbFuncionario where usuarioFuncionario = ? and senhaFuncionario = ?;";

        List<TbFuncionario> tbFuncionario = con.query(selectLogin,
                new BeanPropertyRowMapper(TbFuncionario.class), usuarioFuncionario, senhaFuncionario);

        // Se estiver cadastrado
        if (!tbFuncionario.isEmpty() && !login) {
            String idFuncionario = tbFuncionario.get(0).getIdtbFuncionario().toString();
            System.setProperty("idFuncionario", idFuncionario);
            //Logger.CriarLog(texto);
            //JOptionPane.ShowMessageDialog(null, texto);
            return "OK";
        } else {
            String mensagem = "Usuário e/ou Senha Incorretos!";
            //Logger.CriarLog(mensagem);
            //JOptionPane.ShowMessageDialog(null, mensagem);
            return "Usuário e/ou Senha Incorretos!";
        }
    }

    // Método para pegar o Funcionario através do Id
    public TbFuncionario getFuncionario() {
        String selectId = "select * from tbFuncionario where idTbFuncionario = ?;";
        Integer idFuncionario = Integer.valueOf(System.getProperty("idFuncionario"));

        List<TbFuncionario> tbFuncionario = con.query(selectId,
                new BeanPropertyRowMapper(TbFuncionario.class), idFuncionario);

        // Retorno da lista, onde está armazenado o resultado do select 
        return tbFuncionario.get(0);
    }

    // Método para pegar o Computador através da Fk=Id
    public TbComputador getComputador() {
        String selectComputador = "select * from tbComputador where fk_tbComputador_tbFuncionario = ?;";
        Integer idFuncionario = Integer.valueOf(System.getProperty("idFuncionario"));

        List<TbComputador> tbComputador = con.query(selectComputador,
                new BeanPropertyRowMapper(TbComputador.class), idFuncionario);

        // Se retornar vazio, não tem Computador cadastrado
        if (tbComputador.isEmpty()) {
            return cadastrarComputador();
        }

        // Retorno da lista, onde está armazenado o resultado do select 
        return tbComputador.get(0);
    }

    // Método para capturar os dados da API e armazenar em variáveis 
    public TbComputador getComputadorInfo() {

        String idComputador = processador.getId();
        String identificadorComputador = processador.getIdentificador();
        String sistemaOperacional = sistema.getSistemaOperacional();
        String fabricanteComputador = sistema.getFabricante();
        String arquiteturaComputador = String.format("Arquitetura: %d bits", sistema.getArquitetura());
        String descricaoCpu = processador.getNome();
        String descricaoRam = Conversor.formatarBytes(memoria.getEmUso());
        Integer qtdDiscos = grupoDeDiscos.getQuantidadeDeDiscos();

        // Variavel que recebe o valor do Id do Funcionario que, por sua vez, foi armazenado no "Sistema" após o Login
        Integer idFuncionario = Integer.valueOf(System.getProperty("idFuncionario"));

        // Instanciando um objeto tbComputador, passando como parametros os valores das variáveis
        TbComputador tbComputador = new TbComputador(idComputador, identificadorComputador, sistemaOperacional,
                fabricanteComputador, arquiteturaComputador, descricaoCpu, descricaoRam, qtdDiscos, idFuncionario);

        return tbComputador;

    }

    // Metodo que faz INSERT no banco com o retorno dos dados do getComputadorInfo()
    public TbComputador cadastrarComputador() {

        TbComputador pc = getComputadorInfo();

        String insertComputador = "INSERT INTO tbComputador"
                + "(idComputador, identificadorComputador, sistemaOperacional, fabricanteComputador, arquiteturaComputador,"
                + "descricaoCpu, descricaoRam, qtdDiscoRigido, fk_tbComputador_tbFuncionario)"
                + "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";

        con.update(insertComputador, pc.getIdComputador(), pc.getIdentificadorComputador(), pc.getSistemaOperacional(),
                pc.getFabricanteComputador(), pc.getArquiteturaComputador(), pc.getDescricaoCpu(),
                pc.getDescricaoRam(), pc.getQtdDiscos(), pc.getFk_tbComputador_tbFuncionario());

        return getComputador();
    }
    

    // Metodo para pegar desempenho da CPU, chamado pela view.TelaDashFuncionario
    public Integer getDesempenhoCpu() {
        Double usoCPU = processador.getUso();
        return (int) Math.round(usoCPU);
    }

    // Metodo para pegar desempenho da RAM, chamado pela view.TelaDashFuncionario
    public Integer getDesempenhoRam() {

        Long totalRam = memoria.getTotal();
        Long usoRam = memoria.getEmUso();

        Double usoRAMD = (usoRam / 1024.0 / 1024 / 1024);
        Double totalRAMD = (totalRam / 1024.0 / 1024 / 1024);

        Double porcentagemUsoRam = (usoRAMD / totalRAMD) * 100;
        return (int) Math.round(porcentagemUsoRam);
    }

    // Metodo que faz INSERT no banco com o retorno dos dados dos metodos  getDesempenhoCpu() e  getDesempenhoRam(), 
    //chamados pela view.TelaDashFuncionario
    public void insertDesempenhoMaquina(Integer fkComputador, Integer usoCpu, Integer usoRam) {
        String insertCpu = "insert into TbRegistroDesempenhoMaquina ("
                + "fk_tbRegistroDesempenhoMaquina_tbComputador, desempenhoCpu, desempenhoRam, dataHoraDesempenho)"
                + "values (?, ?, ?, ?)";

        Integer result = con.update(insertCpu, fkComputador, usoCpu, usoRam, dateNow());
        System.out.println(result.toString());
    }

    // Metodo para pegar o DateTime local
    public String dateNow() {
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDate = myDateObj.format(myFormatObj);
        return formattedDate;
    }

}
