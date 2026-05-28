package Dao;

import Connection.ConnectionFactory;
import Model.Endereco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EnderecoDao {
    public void salvar(Endereco endereco){
        String sql = """
                INSERT INTO endereco (
                logradouro,
                numero,
                bairro,
                cidade,
                estado,
                cep
                )
                VALUES (?,?,?,?,?,?)
                """;
        try(
                Connection connection =
                        ConnectionFactory.getConnection();

                PreparedStatement statement =
                        connection.prepareStatement(sql)


        ){
            statement.setString(
                    1,
                    endereco.getLogradouro()
            );
            statement.setString(
                    2,
                    endereco.getNumero()

            );
            statement.setString(
                    3,
                    endereco.getBairro()
            );
            statement.setString(
                    4,
                    endereco.getCidade()
            );
            statement.setString(
                    5,
                    endereco.getEstado()
            );
            statement.setString(
                    6,
                    endereco.getCep()
            );

            statement.executeUpdate();

            System.out.println("endereco salvo com sucesso");
        }catch(SQLException e){
            System.out.println("Erro ao salvar endereço");
            e.printStackTrace();
        }
    }

}
