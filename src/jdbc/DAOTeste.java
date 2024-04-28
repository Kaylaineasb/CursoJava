package jdbc;

import java.io.IOException;
import java.sql.SQLException;

public class DAOTeste {
    public static void main(String[] args) throws IOException, SQLException {
        DAO dao = new DAO();

        String sql = "INSERT INTO pessoas (nome) VALUES (?)";
        dao.incluir(sql,"João da silva");
        dao.incluir(sql,"Ana Julia");
        dao.incluir(sql,"Arthur Jorge");
        dao.close();
    }
}
