/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overviewmonitoring.model;

import com.github.britooo.looca.api.util.Conversor;

/**
 *
 * @author Larissa
 */
public class TbComputador {
    
    // Atributos - Tipos compatíveis e nomes "iguais" aos dos campos da Tabela 
    private Integer idTbComputador;
    private String idComputador;
    private String identificadorComputador;
    private String sistemaOperacional;
    private String fabricanteComputador;
    private String arquiteturaComputador;
    private String descricaoCpu;
    private String descricaoRam;
    private Integer qtdDiscos;
    private Integer fk_tbComputador_tbFuncionario;

    // Construtor Default- Vazio
    public TbComputador() {
        
    }    
    
    // Construtor semi-cheio(sem idComputador)
    public TbComputador(String idComputador, String identificadorComputador, String sistemaOperacional, String fabricanteComputador, String arquiteturaComputador, String descricaoCpu, String descricaoRam, Integer qtdDiscos, Integer fk_tbComputador_tbFuncionario) {
        this.idComputador = idComputador;
        this.identificadorComputador = identificadorComputador;
        this.sistemaOperacional = sistemaOperacional;
        this.fabricanteComputador = fabricanteComputador;
        this.arquiteturaComputador = arquiteturaComputador;
        this.descricaoCpu = descricaoCpu;
        this.descricaoRam = descricaoRam;
        this.qtdDiscos = qtdDiscos;
        this.fk_tbComputador_tbFuncionario = fk_tbComputador_tbFuncionario;
    }
    
    // Construtor Cheio
    public TbComputador(Integer idTbComputador, String idComputador, String identificadorComputador, String sistemaOperacional, String fabricanteComputador, String arquiteturaComputador, String descricaoCpu, String descricaoRam, Integer qtdDiscos, Integer fk_tbComputador_tbFuncionario) {
        this.idTbComputador = idTbComputador;
        this.idComputador = idComputador;
        this.identificadorComputador = identificadorComputador;
        this.sistemaOperacional = sistemaOperacional;
        this.fabricanteComputador = fabricanteComputador;
        this.arquiteturaComputador = arquiteturaComputador;
        this.descricaoCpu = descricaoCpu;
        this.descricaoRam = descricaoRam;
        this.qtdDiscos = qtdDiscos;
        this.fk_tbComputador_tbFuncionario = fk_tbComputador_tbFuncionario;
    }

    // Sobrescrita do método toString()
    @Override
    public String toString() {
        return String.format("\nTbComputador:\n"
                + "IdTbComputador: %d\n"
                + "Id do Computador: %s\n"
                + "Identificador do Computador: %s\n"
                + "Sistema Operacional: %s\n"
                + "Fabricante do Computador: %s\n"
                + "Arquitetura do Computador: %s\n"
                + "Descrição Cpu: %s\n"
                + "Descrição Ram: %s\n"
                + "Quantidade de Discos Rígidos: %d\n"
                + "Fk TbFuncionario: %d",
                idTbComputador, idComputador, identificadorComputador, sistemaOperacional, fabricanteComputador, arquiteturaComputador,
                descricaoCpu, descricaoRam, qtdDiscos, fk_tbComputador_tbFuncionario);
    }

    // Getters and Setters
    public Integer getIdTbComputador() {
        return idTbComputador;
    }

    public void setIdTbComputador(Integer idTbComputador) {
        this.idTbComputador = idTbComputador;
    }

    public String getIdComputador() {
        return idComputador;
    }

    public void setIdComputador(String idComputador) {
        this.idComputador = idComputador;
    }

    public String getIdentificadorComputador() {
        return identificadorComputador;
    }

    public void setIdentificadorComputador(String identificadorComputador) {
        this.identificadorComputador = identificadorComputador;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public String getFabricanteComputador() {
        return fabricanteComputador;
    }

    public void setFabricanteComputador(String fabricanteComputador) {
        this.fabricanteComputador = fabricanteComputador;
    }

    public String getArquiteturaComputador() {
        return arquiteturaComputador;
    }

    public void setArquiteturaComputador(String arquiteturaComputador) {
        this.arquiteturaComputador = arquiteturaComputador;
    }

    public String getDescricaoCpu() {
        return descricaoCpu;
    }

    public void setDescricaoCpu(String descricaoCpu) {
        this.descricaoCpu = descricaoCpu;
    }

    public String getDescricaoRam() {
        return descricaoRam;
    }

    public void setDescricaoRam(String descricaoRam) {
        this.descricaoRam = descricaoRam;
    }

    public Integer getQtdDiscos() {
        return qtdDiscos;
    }

    public void setQtdDiscos(Integer qtdDiscos) {
        this.qtdDiscos = qtdDiscos;
    }

    public Integer getFk_tbComputador_tbFuncionario() {
        return fk_tbComputador_tbFuncionario;
    }

    public void setFk_tbComputador_tbFuncionario(Integer fk_tbComputador_tbFuncionario) {
        this.fk_tbComputador_tbFuncionario = fk_tbComputador_tbFuncionario;
    }

}
