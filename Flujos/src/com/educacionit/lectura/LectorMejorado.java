package com.educacionit.lectura;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LectorMejorado {

	public static void main(String[] args) throws IOException {
		File inputFile = new File("archivosES" + File.separator + "entrada" + File.separator + "fuente.txt");

		BufferedReader readerMejorado = new BufferedReader(new FileReader(inputFile));

		boolean eof = false;
		String linealeida = "";

		while (!eof) {
			linealeida = readerMejorado.readLine();// leo linea a linea !
			if (linealeida != null) {
				System.out.println(linealeida);
			} else {
				eof = true;
			}

		}
		readerMejorado.close();

	}
}
