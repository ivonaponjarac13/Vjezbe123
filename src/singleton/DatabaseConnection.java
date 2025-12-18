package singleton;
//nestrpljivo ucitavanje kada prilikom pokretanja projekta kreiramo sve objekte sto moze biti problem u velikim aplikacijama
public class DatabaseConnection {
	
	private static DatabaseConnection instance = new DatabaseConnection();
	
	/*public*/ private DatabaseConnection() { //da onemogucimo nekom drugom da kreira novi databaseconnection zato ide private, poziva se getInstance
		
		//logika povezivanja na neku BP
		
	}

	public static DatabaseConnection getInstance() {
		return instance;
	}
	
	

}
