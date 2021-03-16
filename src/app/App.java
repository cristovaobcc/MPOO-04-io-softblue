package app;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import utils.Utils;


public class App {

	public static void main(String[] args) throws IOException{
		
		String s1 = "Texto para ser gravado no arquivo!";
		
		// Usando outra forma de se escrever no arquivo:
		try(PrintWriter pw = new PrintWriter("saida.txt")){
			// Com PrintWriter você tem a opção de dar saída formatada de arquivos.
			pw.println(s1); // note que a saída será impressa com quebra de linha. Vide arquivo gerado!
		}
			
		
	}

}
