/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overviewmonitoring.service;

import org.apache.commons.dbcp2.BasicDataSource;

/**
 *
 * @author Larissa
 */
public class Connection {
    
    // Atributo da classe - para ajudar na conexao com o BD
    private BasicDataSource dataSource;

    // Construtor 
    public Connection() {
        
        this.dataSource = new BasicDataSource();
        this.dataSource.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        this.dataSource.setUrl("jdbc:sqlserver://overviewmonitoring.database.windows.net:1433;database=OverviewMonitoring;");
        this.dataSource.setUsername("adminMonitoring");
        this.dataSource.setPassword("#Gfgrupo5");
    }

    //Getter do DataSource
    public BasicDataSource getDataSource() {
        return dataSource;
    }

    
}
