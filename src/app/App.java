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
		
		if (Utils.copiaArquivo(inputFile, outputFile))
			System.out.println("Cópia realizada com sucesso.");
		
	}

}
