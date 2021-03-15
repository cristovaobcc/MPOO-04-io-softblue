package app;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import utils.Utils;


public class App {

	public static void main(String[] args) throws IOException{
		
		String dadosLidos = Utils.lerArquivoComScanner("entrada.txt");
		System.out.println(dadosLidos);
		
	}

}
