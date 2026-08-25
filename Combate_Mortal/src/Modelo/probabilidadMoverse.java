package Modelo;

public enum probabilidadMoverse {
	UNMTS(1),
	DOSMTS(2),
	TRESMTS(3),
	NOSEMUEVE(0);

	int moverse;

	private probabilidadMoverse(int moverse) {
		this.moverse = moverse;
	}
}
