package br.com.asfmegas.asfenglish.util;

import java.sql.Connection;

/**
 *
 * @author asfmegas
 */
public interface CreateConnection {
    public final static String DRIVER_MYSQL = "jdbc:mysql://localhost/";
    public final static String DRIVER_POSTGRESQL = "jdbc:postgresql://localhost/";
    
    Connection getConexao(String driver);
    
}
