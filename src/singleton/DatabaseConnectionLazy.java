package singleton;

//2. nacin lijeno ucitavanje, pozeljnije na ovaj nacin se kreira jedna instanca
public class DatabaseConnectionLazy {

	private static DatabaseConnectionLazy instance;

	private DatabaseConnectionLazy() {

	}
	// paralelno koriscenje -> postoji sansa da if provjera prodje dva ili vise puta
	// pa da se narusi singleton

	public static DatabaseConnectionLazy getInstance() {

		if (instance == null) {

			synchronized (DatabaseConnectionLazy.class) {

				if (instance == null)
					instance = new DatabaseConnectionLazy();

			}
		}
		return instance;

	}

}
