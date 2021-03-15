/**
 * 
 */
package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Classes com funções utilitárias para leitura de arquivo.
 * @author cristovao
 *
 */
public class Utils {
	
	/**
	 * Lê o conteúdo de um arquivo passado a medida que este é lido em um buffer de tamanho
	 * bufferSize.
	 * @param arquivo String
	 * @param bufferSize int
	 * @return String o conteúdo de arquivo lido
	 * @throws IOException
	 */
	public static String LerArquivoComoBytes(String arquivo, int bufferSize) throws IOException{
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
