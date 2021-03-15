package app;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import utils.Utils;


public class App {

	public static void main(String[] args) throws IOException{
		
		String s1 = "Texto para ser gravado no arquivo.";
		String s2 = "Segundo texto para ser gravado";
		
		ArrayList<String> dados = new ArrayList<>();
		dados.add(s1);
		dados.add(s2);
		
		if (Utils.criaEEscreveArquivoTexto("saida.txt", dados))
			System.out.println("Arquivo criado com sucesso!");;
		
		
	}

}
