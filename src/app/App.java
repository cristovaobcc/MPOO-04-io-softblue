package app;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;

import utils.Utils;


public class App {

	public static void main(String[] args) throws IOException{
		
		// Criando cópias de arquivos textos ou binários.
		String inputFile = "entrada.txt";
		String outputFile = "saida.txt";
		
		try (InputStream inputStream = new FileInputStream(inputFile);
				OutputStream outputStream = new FileOutputStream(outputFile)){
			
			// Armazenando os dados em um buffer
			byte[] buffer = new byte[1024];
			int bytesLidos;
			
			while((bytesLidos = inputStream.read(buffer)) > -1) {
				// Insere os dados lidos da posição 0 até bytesLidos. Isso evita pegar lixo.
				outputStream.write(buffer, 0, bytesLidos); 
			}
			
		}
		
	}

}
