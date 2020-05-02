package com.educacionit.lectura;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Lector {

	public static void main(String[] args) throws IOException {

		File inputFile = new File("archivosES" + File.separator + "entrada" + File.separator + "fuente.txt");

		FileReader in = new FileReader(inputFile);
		int unCaracter;
		// leer el archivo
		while ((unCaracter = in.read()) != -1) {
			System.out.print((char) unCaracter);
		}
		// Cieera el Stream
		in.close();

	}

}
