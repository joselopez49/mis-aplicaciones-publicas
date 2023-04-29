package tptorneodefutbol;



import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
public class MainTP {

	public static void main(String[] args) {
		Collection<Partido> partidos= new ArrayList<Partido>();
	/*	 Path pathResultados = Paths.get("C:\\Users\\fernandopc\\Documentos\\tr\\tptorneodefutbol\\src\\test\\resources\\resultados_test1.csv");
		 List<String>lineasResultados=null;
		try {
			 lineasResultados = Files.readAllLines(pathResultados);//devuelve-una-lista-de-lineas(coleccion)//
		} catch (IOException e) {
			// TODO Auto-generated catch blo
			System.out.println("No-se-puede-leer-las-lineas...");
			System.exit(1);
		}
		boolean primera= true;
		for(String lineaResultado: lineasResultados) {
		//	System.out.println(lineaResultado);
		
			if(primera) {
				primera= false;
				
			}else {
			// System.out.println(lineaResultado);			
		
				String[] campos= lineaResultado.split(",");//genero{"argen","1","2","arabiaS",...}
				Equipo equipo1= new Equipo(campos[0]);//es-equipo-argentina
				Equipo equipo2= new Equipo(campos[3]);//es-equipo-arabiasaudita
				//como-construi-los-equipos-puedo-ahora-construir-el-partido
				Partido partido= new Partido(equipo1, equipo2);
				partido.setGolesEquipo1(Integer.parseInt( campos[1]));//como-existe-un-partido-actualiza-los-goles
				partido.setGolesEquipo2(Integer.parseInt( campos[2]));//de-los-equipos-para-actualizar-los-resultados
				partidos.add(partido);//guardo-estos-resultdados-de-los-goles
				//System.out.println(partido);//en-una-collection-que-la-voy-agenerar-al-principio
				
		
			
		       }
		}
		
			
	*/	
	//leemos-pronostico  
		int punto= 0;
		 Path pathPronostico = Paths.get("C:\\Users\\fernandopc\\Documentos\\tr\\tptorneodefutbol\\src\\test\\resources\\pronostico_test.csv");
		 List<String>lineasPronosticos=null;
		try {
			 lineasPronosticos = Files.readAllLines(pathPronostico);
		} catch (IOException e) {
			// TODO Auto-generated catch blo
			System.out.println("No-se-puede-leer-las-lineas...");
			System.exit(1);
		}
		boolean primera1 = true;
		for(String lineaPronostico: lineasPronosticos) {
		//	System.out.println(lineaPronostico);		
			if(primera1) {
				primera1= false;
			}else {
			//	System.out.println(lineaPronostico);			
					
				String[] campos= lineaPronostico.split(",");
				Equipo equipo11= new Equipo(campos[0]);//son-equipos-instanceados-del-pronostico
				Equipo equipo22= new Equipo(campos[4]);//"argen","X",,,"arabSa"
				Partido partido= null;                //campos[0],[1],[2],[3]
				
				//los-partidos-los-saco-de-la-collection-de-partidos-los-recorro
				//con-una-for-each
				for(Partido partidocolle: partidos) {
					//System.out.println(partidocolle);
					//los-partidos-de-la-collection-coinciden-con-los-del-pronostico-cuando-coninciden-los-nombres-de-los-equipos
					if( partidocolle.getEquipo1().getNombre().equals(equipo11.getNombre())	&&  partidocolle.getEquipo2().getNombre().equals(equipo22.getNombre())){ //coincidan-con-los-de-la-collecion-son-los-resultados
						//los-partidos-de-la-collection-contienen-tambien-los-goles
						//if-si-es-verdadero-los-partidos-de-la-collection-son-los-partidos-pronosticados
						partido= partidocolle;//partido-pronosticado=partidocolle-dela-coleccion
				//		System.out.println(partido);
						
					}
					
				}
			   	
		
				Equipo equipo= null;//defino-el-equipo-y-lo-inicializo-con-null
				String resultado= null;
				
				if("X".equals(campos[1])){//voy-a-usar-la-equis-X-de-la-tabla-y-me-pregunto-la-posicion-en-la-tabla-para-detereminar
					equipo= equipo11;//el-resultado
					resultado="ganador";
				}
				if("X".equals(campos[2])){
					equipo= equipo11;
					resultado= "empate";
					
				}
				if("X".equals(campos[3])) {
					equipo= equipo11;
					resultado= "perdedor";
				}
				
				Pronostico pronostico= new Pronostico(partido, equipo, resultado);
				punto+= pronostico.puntos();
			
	    
		}
		System.out.println("los-puntos-obtenidos-por-el-usuario-son");
		System.out.println(punto);		

	 }	
		
   }
	}
 
	
	
