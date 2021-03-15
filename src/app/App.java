package app;

import java.io.IOException;
import utils.Utils;

public class App {

	public static void main(String[] args) throws IOException{
		String s = Utils.LerArquivoComoBytes("entrada.txt", 10);

		System.out.println(s);
		System.out.println(s.length());


	}

}
