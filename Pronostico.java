package tptorneodefutbol;

public class Pronostico {
	private Partido partido;
	private Equipo equipo;//es-el-equipo-que-yo-aposte
	private String resultado;//resultado-del-pronosticado//
	
	//Necesito-de-todas-estas-variables-para-determinar-un-pronostico-sin-excepcion
	public Pronostico(Partido partido, Equipo equipo, String resultado) {
		
		this.partido= partido;
		this.equipo= equipo;
		this.resultado= resultado;
	}
	//los-getter-y-setter-pero-solamente-getter-porque-solamente-queremos-permitir-que-los-valores-de-nuestras-variables-privadas
	//sean-leidas-o-obtenidas-desde-fuera-de-la-clase-donde-fueron-creadas-pero-no-modificadas.que-es-lo-que-hace-el-setter
	public Partido getPartido() {
		return partido;
	}
	
	
	public Equipo getEquipo() {
		return equipo;
	}
	
	public String getResultado() {
		return resultado;
	}
	
	//El-metodo-puntos-nos-permite-calcular-los-puntos-obtenidos-por-nuestro-pronosticador
	//me-pregunto-cuando-el-pronosticador-genera-puntos-los-genera
	//cuando-los-resultados-del-pronosticador-son-iguales-a-los-resultados-reales
	//de-los-partidos-no-me-interesa-los-goles-solo-gano-perdio-empato
	//donde-resultado(this.equipo)-es-el-resultados-real-del-equipo-que-yo-aposte
	
	public int puntos() {		
		String resultadoReal= this.partido.Resultado(this.equipo);
		if(this.resultado.equals(resultadoReal)) {
			return 1;
			
		}else {
			return 0;
		}
	 }
	

}
