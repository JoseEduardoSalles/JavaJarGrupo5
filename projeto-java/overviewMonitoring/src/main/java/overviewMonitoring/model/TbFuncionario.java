/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overviewmonitoring.model;

/**
 *
 * @author Larissa
 */
public class TbFuncionario {
    
    //Atributos - Tipos compatíveis e nomes "iguais" aos dos campos da Tabela 
    private Integer idtbFuncionario;
    private String nomeFuncionario;
    private String emailFuncionario;
    private String usuarioFuncionario;
    private String senhaFuncionario;

    // Construtor Default- Vazio
    public TbFuncionario() {
        
    }
    
    //Construtor Cheio
    public TbFuncionario(Integer idtbFuncionario, String nomeFuncionario, String emailFuncionario, String usuarioFuncionario, String senhaFuncionario) {
        this.idtbFuncionario = idtbFuncionario;
        this.nomeFuncionario = nomeFuncionario;
        this.emailFuncionario = emailFuncionario;
        this.usuarioFuncionario = usuarioFuncionario;
        this.senhaFuncionario = senhaFuncionario;
    }
  
    //Sobrescrita do método toString()
    @Override
    public String toString() {
        return String.format("\n----------TbFuncionario----------\n"
                + "ID do Funcionário: %d\n"
                + "Nome do Funcionário: %s\n"
                + "Email do Funcionário: %s\n"
                + "Usuário do Funcionário: %s\n"
                + "Senha do Funcionário: %s",
                idtbFuncionario, nomeFuncionario, emailFuncionario, usuarioFuncionario, senhaFuncionario);
    }
  
    //Setters and Getters 
    public Integer getIdtbFuncionario() {
        return idtbFuncionario;
    }

    public void setIdtbFuncionario(Integer idtbFuncionario) {
        this.idtbFuncionario = idtbFuncionario;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public String getEmailFuncionario() {
        return emailFuncionario;
    }

    public void setEmailFuncionario(String emailFuncionario) {
        this.emailFuncionario = emailFuncionario;
    }

    public String getUsuarioFuncionario() {
        return usuarioFuncionario;
    }

    public void setUsuarioFuncionario(String usuarioFuncionario) {
        this.usuarioFuncionario = usuarioFuncionario;
    }

    public String getSenhaFuncionario() {
        return senhaFuncionario;
    }

    public void setSenhaFuncionario(String senhaFuncionario) {
        this.senhaFuncionario = senhaFuncionario;
    }
    
}
