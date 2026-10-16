package principal;
import dao.DAO;

public class App {

	public static void main(String[] args) {
		DAO miPrimerDao = new DAO();
		miPrimerDao.actualizar("1");
	}

}
