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
		String s2 = "Novo texto para ser gravado.";
		
		ArrayList<String> dados = new ArrayList<String>();
		dados.add(s1);
		dados.add(s2);
		
		if (Utils.criaEEscreveComPrintWriter("saida.txt", dados)) {
			System.out.println("Arquivo criado com exito!");
		}
		
			
		
	}

}
