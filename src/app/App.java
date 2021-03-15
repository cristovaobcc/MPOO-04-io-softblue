package app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import utils.Utils;


public class App {

	public static void main(String[] args) throws IOException{
		
		String dadosLidos = Utils.lerArquivoComReader("entrada.txt");
		System.out.println(dadosLidos);
	}

}
