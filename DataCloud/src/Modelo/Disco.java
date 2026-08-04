package Modelo;

public class Disco {
	//Variables
	private int cantSectoresCorruptos, tasaDeTransferencia;
	private String tipoDeDisco;
	
	//Constructor para Test
	public Disco(int cantSectoresCorruptos, int tasaDeTransferencia, String tipoDeDisco) {
		this.cantSectoresCorruptos = cantSectoresCorruptos;
		this.tasaDeTransferencia = tasaDeTransferencia;
		this.tipoDeDisco = tipoDeDisco;
	}
	
	//Metodos para delegaciones
	public boolean estaEnRiesgo() {
		return (cantSectoresCorruptos > 5 && tasaDeTransferencia < 50);
	}
	

	public int tazaDeTransferencia() {
		int tazaTotal = 0;
		if(tipoDeDisco.equals("SATA_HDD")) {
			tazaTotal = tasaDeTransferencia;
		}else if (tipoDeDisco.equals("SATA_SSD")) {
			tazaTotal = tasaDeTransferencia*4;
		}else if(tipoDeDisco.equals("M2")) {
			tazaTotal = tasaDeTransferencia*20;
		}
		return tazaTotal;
	}
}
