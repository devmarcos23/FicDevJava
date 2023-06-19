package desafio09;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Desafio09 {
    public static void main(String[] args) {
        try {
            Desafio09 desafio09 = new Desafio09();
            String content = desafio09.readFile("caminho do arquivo");
            System.out.println(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String readFile(String filePath) throws IOException {
        StringBuilder contentBuilder = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String currentLine;
            while ((currentLine = br.readLine()) != null) {
                contentBuilder.append(currentLine);
                contentBuilder.append(System.lineSeparator());
            }
        }
        return contentBuilder.toString();
    }
}

