/**
 * 
 */
package utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Classes com funções utilitárias para leitura de arquivo.
 * @author cristovao
 *
 */
public class Utils {
	
	/**
	 * Insere os elementos de dados separados por quebra de linha("\n") no arquivo passado como
	 * parâmetro.
	 * @param arquivo String
	 * @param dados ArrayList< String > 
	 * @return true, se todos os elementos de dados forma inseridos no arquivo; false, do contrário.
	 * @throws IOException
	 */
	public static boolean criaEEscreveComPrintWriter(String arquivo, ArrayList<String> dados)
		throws IOException{
		
		boolean isEscrito = false;
		
		try(FileWriter fw = new FileWriter(arquivo)){
			
			try(PrintWriter pw = new PrintWriter(fw)){
				for (String string : dados) {
					pw.println(string);
				}
				
				isEscrito = true;
			}
		}
		
		return isEscrito;
	}
	
	/**
	 * Recebe um array de String e escreve no arquivo de destino o conteúdo de cada elemento 
	 * do Array separado por "\n".
	 * @param arquivoDestino String 
	 * @param dados ArrayList< String >
	 * @return true se o conteúdo todo do array de dados foi escrito; false, caso contrário.
	 * @throws IOException
	 */
	public static boolean criaEEscreveArquivoTexto(String arquivoDestino, ArrayList<String> dados) 
		throws IOException{
		
		boolean isEscrito = false;
		
		try(FileWriter fw = new FileWriter(arquivoDestino)){
			
			try(BufferedWriter writer =  new BufferedWriter(fw)){
				for (String string : dados) {
					writer.write(string);
					writer.write("\n");
				}
				isEscrito = true;
			}
		}
		
		return isEscrito;
		
	}
	
	/**
	 * Cria um arquivo texto com o conteudo passado como parametro.
	 * @param nomeArquivo String nome do arquivo
	 * @param conteudo String conteudo do arquivo
	 * @return true se o arquivo e conteudo foi criado e escrito com sucesso; falso, caso contrário.
	 * @throws IOException
	 */
	public static boolean criaEEscreveArquivoTexto(String nomeArquivo, String conteudo) throws IOException {
		boolean isEscrito = false;
		
		try (OutputStream os = new FileOutputStream(nomeArquivo)){
		
			byte[] buffer = conteudo.getBytes();
			os.write(buffer);
			isEscrito = true;
		}
		
		return isEscrito;
	}
	
	
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
