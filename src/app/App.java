package app;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import utils.Utils;


public class App {

	public static void main(String[] args) throws IOException{
		
		String s = "Texto para ser gravado no arquivo.";
		
		// Faremos o caminho inverso agora: enviar dados da App para arquivos.
		
		try(OutputStream os = new FileOutputStream("saida.txt")){
			// Note que, aqui, o programador não precisa montar o buffer: 
			// o objeto String já monta ele com o método getBytes().
			byte[] buffer = s.getBytes();
			// Escreve os dados da string no arquivo saida.txt
			os.write(buffer);
		}
		
		
	}

}
