package principal;
import dao.DAO;

public class app {

	public static void main(String[] args) {
		DAO miPrimerDao = new DAO();
		miPrimerDao.conectar();
	}

}
