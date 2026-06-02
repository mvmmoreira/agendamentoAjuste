package Dao;

import Connection.ConnectionFactory;
import Model.Procedimento;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProcedimentoDao {
    public void salvar(Procedimento procedimento){
        String sql = """
                INSERT INTO procedimento (
                nome,
                tipo,
                valor,
                duracao_minutos
                ) 
                VALUES(?,?,?,?)
                """;
        try (
                Connection connection =
                        ConnectionFactory.getConnection();
                PreparedStatement statement =
                        connection.prepareStatement(sql)
        ){
            statement.setString(
                    1,
                    procedimento.getNome()
            );
            statement.setString(
                    2,
                    procedimento.getTipo()
            );
            statement.setDouble(
                    3,
                    procedimento.getValor()
            );
            statement.setInt(
                    4,
                    procedimento.getDuracao()
            );
            statement.executeUpdate();
            System.out.println("Procedimento salvo com sucesso");
        }
        catch(SQLException e){
            System.out.println("Erro ao salvar procedimento");
            e.printStackTrace();
        }
    }
}
