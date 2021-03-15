package app;

import java.io.IOException;

import utils.Utils;


public class App {

	public static void main(String[] args) throws IOException{
		
		String dadosLidos = Utils.lerArquivoComScanner("entrada.txt");
		System.out.println(dadosLidos);
		
	}

}
