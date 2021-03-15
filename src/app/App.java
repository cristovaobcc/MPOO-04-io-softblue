package app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class App {

	public static void main(String[] args) throws IOException{
		
		// Classe apropriada para ler informações de texto
		FileReader fr = new FileReader("entrada.txt");
		
		// Classe que lerá os dados como Strings
		try (BufferedReader reader = new BufferedReader(fr)){
			
			String s = "";
			String line;
			while((line = reader.readLine()) != null) {
				s += line + "\n";
			}
						
			System.out.println(s);
		}
		
		fr.close();
	}

}
