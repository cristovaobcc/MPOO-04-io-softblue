package app;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class App {

	public static void main(String[] args) throws IOException{
		
		String s = "Texto para ser gravado no arquivo.";
		// Esta é uma forma mais simples de se trabalhar com escrita de arquivo texto.		
		try(BufferedWriter writer = new BufferedWriter( new FileWriter("saida.txt"))){
			writer.write(s);
		}
		
		
	}

}
