package tptorneodefutbol;

public class Partido {
	private Equipo equipo1;
	private Equipo equipo2;
	private int golesEquipo1;
	private int golesEquipo2;
	
	//para-generar-el-partido-necesito-seguro-los-dos-equipos-y-como-me-interesa-el-resultado-los-goles
	//no-voy-a-ceonsiderar-los-goles-porque-no-se-de-que-partido-lo-es
	
		
	
	public Partido( Equipo equipo1, Equipo equipo2) {
		
		this.equipo1 = equipo1;
		this.equipo2 = equipo2;
		
	}
	public Equipo getEquipo1() {
		return equipo1;
	}
	public void setEquipo1(Equipo equipo1) {
		this.equipo1= equipo1;
	}
	public Equipo getEquipo2() {
		return equipo2;
	}
	public void setEquipo2(Equipo equipo2) {
    	this.equipo2= equipo2;
	}
	public int getGolesEquipo1() {
		return golesEquipo1;
	}

	public void setGolesEquipo1(int golesEquipo1) {
		this.golesEquipo1 = golesEquipo1;
	}

	public int getGolesEquipo2() {
		return golesEquipo2;
	}
		
	

	public void setGolesEquipo2(int golesEquipo2) {
		this.golesEquipo2 = golesEquipo2;
	}

	
	
	
    
    public String Resultado(Equipo equipo) {
    	
    	if(golesEquipo1== golesEquipo2) {
    		return "empate";
    		
    	}
    	if(equipo.getNombre().equals(equipo1.getNombre())) {
    		if(golesEquipo1> golesEquipo2) {
    			return "ganador";
    			
    		}else {
    			return "perdedor";
    			
    		  }
    		
        }else {
    		   if(golesEquipo2> golesEquipo1) {
    			return "ganador";
    			
    	        }else {
    			    return "perdedor";
    		       }
    	   }
    }
}
