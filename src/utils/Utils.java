/**
 * 
 */
package utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/**
 * Classes com funções utilitárias para leitura de arquivo.
 * @author cristovao
 *
 */
public class Utils {
	
	/**
	 * Lê o conteúdo de texto de um arquivo de texto.
	 * @param arquivo Nome do arquivo
	 * @return String o conteúdo de texto lido
	 * @throws IOException
	 */
	public static String lerArquivoComScanner(String arquivo) throws IOException{
		StringBuilder sb = null;
		File file = new File(arquivo);
		try(Scanner scanner = new Scanner(file)){
			sb = new StringBuilder(0);
			String line;
			while (scanner.hasNext()) {
				line = scanner.nextLine();
				sb.append(line);
				sb.append("\n");
			}
		}
		return sb.toString();
	}
	
	/**
	 * Lê o conteúdo de texto de um arquivo de texto.
	 * @param arquivo Nome do arquivo
	 * @return String o conteúdo de texto lido
	 * @throws IOException
	 */
	public static String lerArquivoComReader(String arquivo) throws IOException{
		StringBuilder sb = null;
		try(FileReader fr = new FileReader(arquivo)){
			
			try(BufferedReader reader = new BufferedReader(fr)){
				sb = new StringBuilder(0);
				String line;
				while ((line = reader.readLine()) != null) {
					sb.append(line);
					sb.append("\n");
				}
			}
			
		}
		
		return sb.toString();
	}
	
	/**
	 * Lê o conteúdo de um arquivo passado a medida que este é lido em um buffer de tamanho
	 * bufferSize.
	 * @param arquivo String
	 * @param bufferSize int
	 * @return String o conteúdo de arquivo lido
	 * @throws IOException
	 */
	public static String lerArquivoComoBytes(String arquivo, int bufferSize) throws IOException{
		String s = "";
		
		try(InputStream is = new FileInputStream(arquivo)){
			
			byte[] buffer = new byte[bufferSize];
			
			int bytesLidos;
			while((bytesLidos = is.read(buffer)) > -1) {
				
				s += new String(buffer, 0, bytesLidos);
			}
		}
		
		return s;
	}

}
