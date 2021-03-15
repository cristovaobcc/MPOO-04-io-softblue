package app;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import utils.Utils;


public class App {

	public static void main(String[] args) throws IOException{
		
		String s = "Texto para ser gravado no arquivo.";
				
		
		if (Utils.criaEEscreveArquivoTexto("saida.txt", s)) {
			System.out.println("Arquivo criado com sucesso.");
		}
		
		
	}

}
