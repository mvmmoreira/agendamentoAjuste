import Connection.ConnectionFactory;

import java.sql.Connection;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Connection conn = ConnectionFactory.getConnection();
        if (conn != null){
            System.out.println("Conexão realizada com sucesso");
        }
    }
}
