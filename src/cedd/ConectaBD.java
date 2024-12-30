package cedd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectaBD {
    public Connection connection;

    public Connection coneccao() {
        String user = "postgres";
        String password = "123";
        String url = "jdbc:postgresql://localhost:5432/CEDD";
        try {
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Banco Conectado com sucesso");
        } catch (SQLException e) {
            System.err.println("Eroo: " + e);
        }
        return connection;
    }
}
