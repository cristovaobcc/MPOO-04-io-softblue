package app;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;



public class App {

	public static void main(String[] args) throws IOException{
		
//		// Polimorfismo com API de I/O
//		// Fazendo transferência de dados entre arquivos:
//		FileInputStream fin = new FileInputStream("entrada.txt");
//		FileOutputStream fout = new FileOutputStream("saida.txt");
//		
//		transfer(fin, fout); // usando um cast implícito para o método;
		
		
//		// Usando o mesmo arquivo de entrada.txt para ser exibida no 
//		// console.
//		FileInputStream fin = new FileInputStream("entrada.txt");
//		OutputStream cout = System.out; // Veja que System.out é uma outputStream (vide javadoc)
//		transfer(fin, cout);
		
		// Gravando o que é digitado no console em um arquivo.
		InputStream cin = System.in;
		OutputStream fout = new FileOutputStream("saida.txt");
		transfer(cin, fout);
		
	}
	
	// transfere dados de uma stream de entrada para uma stream de saída.
	// Note que, com esse método não precisamos saber de onde e para onde os
	// dados serão gravados.
	private static void transfer(InputStream in, OutputStream out) throws IOException{
		
		byte[] buffer = new byte[1024]; // 1 KB
		
		int bytesLidos;
		while ((bytesLidos = in.read(buffer)) > -1) {
			out.write(buffer, 0, bytesLidos);
		}
	}

}
