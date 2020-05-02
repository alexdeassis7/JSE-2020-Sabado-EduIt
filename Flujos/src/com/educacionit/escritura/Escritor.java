package com.educacionit.escritura;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Escritor {
	public static void main(String[] args) throws IOException {

		File outputFile = new File("archivosES" + File.separator + "salida" + File.separator + "destino.txt");
		FileWriter out = new FileWriter(outputFile);

		String info = "Soy el mensaje del profe!";

		for (int i = 0; i < info.length(); i++) {
			out.write(info.charAt(i));
		}

		out.close();

		System.out.println("el archivo fue escrito !");
	}
}
