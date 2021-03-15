package app;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class App {

	public static void main(String[] args) throws IOException{
		// Lendo de arquivo de entrada
		try (InputStream is = new FileInputStream("entrada.txt") ) {
			// Para trabalharmos com Streams precisamos colocar os dados num array de bytes.
			byte[] buffer = new byte[4];
			
			// Lendo os dados de entrada em pedaços.
			String s = "";
			int bytesLidos;
			while((bytesLidos = is.read(buffer)) > -1 ) {
				s += new String(buffer, 0, bytesLidos);
			}
			
			System.out.println(s);
			System.out.println(s.length());
		} 

	}

}
