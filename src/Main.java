import Connection.ConnectionFactory;
import Dao.ProcedimentoDao;
import Model.Procedimento;

import java.sql.Connection;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Procedimento procedimento = new Procedimento(
                0,
                "Pilates",
                "Recuperação",
                120.80,
                60
        );
        ProcedimentoDao procedimentoDao = new ProcedimentoDao();
        procedimentoDao.salvar(procedimento);
        System.out.println(procedimento);
    }
}
