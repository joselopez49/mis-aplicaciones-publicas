package tptorneodefutbol;

import Pronosticos.Partido;

public class Ronda {
	private String nro;
	private Partido[] partidos;
	
	public Ronda(String nro, tptorneodefutbol.Partido[] partidos) {
		super();
		this.nro = nro;
		this.partidos = partidos;
	}

	public String getNro() {
		return nro;
	}

	public void setNro(String nro) {
		this.nro = nro;
	}

	public Partido[] getPartidos() {
		return partidos;
	}

	public void setPartidos(Partido[] partidos) {
		this.partidos = partidos;
	}
	
	public int puntos() {
		
        while(this.partidos.equals(this.nro)) {
	int puntos=( partidosganados*3) + partidosempatados;
	return puntos;
	 		 
	 		 
        } 		 
	

	
  }
} 
