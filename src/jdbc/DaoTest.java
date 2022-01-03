package jdbc;

public class DaoTest {

	public static void main(String[] args) {
		DAO dao = new DAO(); 
		
		String sql = "INSERT INTO pessoas (nome) values (?)";
		dao.incluir(sql, "Claudomiro");
		dao.incluir(sql, "Ana Julia");
		dao.incluir(sql, "Domino liga");
		
		dao.close();

	}

}
