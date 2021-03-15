package app;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class App {

	public static void main(String[] args) throws IOException{

		InputStream is = null;

		try {
			// Lendo de arquivo de entrada
			is = new FileInputStream("entrada.txt");
			// Para trabalharmos com Streams precisamos colocar os dados num array de bytes.
			byte[] buffer = new byte[1024];
			// Colocar os bytes lidos do arquivo no array de bytes.
			is.read(buffer);
			// Constructs a new String by decoding the specified array of bytes using the platform's default charset
			String s = new String(buffer);
			System.out.println(s);
		} finally {
			if (is != null) {
				// Closes this input stream and releases any system resources associated with the stream.
				is.close();
			}
		}

	}

}
