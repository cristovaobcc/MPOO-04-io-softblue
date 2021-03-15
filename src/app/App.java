package app;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import utils.Utils;


public class App {

	public static void main(String[] args) throws IOException{
		
		// Forma mais simplificada para leitura de arquivos textos.		
		try(Scanner scanner = new Scanner(new File("entrada.txt"))){
			String s = "";
			while(scanner.hasNext()) {
				String line = scanner.nextLine();
				s += line + "\n";
			}
			System.out.println(s);
		}
		
	}

}
