import java.util.Scanner;

import java.util.Collections;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;


public class Lectura {
String linea;
Scanner entrada = null;
int numeroDeLinea = 1;
boolean contiene = false;


	public void run() {
		File file = new File("pacientes.txt");
		String pacientes = "A";
		String texto = pacientes;
		try {
			Scanner lec = new Scanner(file);
		
			while(lec.hasNext()) {
				 linea = lec.nextLine();
				 if(linea.contains(texto)) {
					 String[] la = linea.split("\\,");
					 String la2 = la[2];
					 linea.contains(texto);
					 contiene= true;
					 
				 }
				
				numeroDeLinea++;
			}if(!contiene) {
				System.out.println("Dato no encontrado");
				
			}
			

		}catch(Exception e) {
			System.out.println("Archivo no econtrado");
		}
	}
}
