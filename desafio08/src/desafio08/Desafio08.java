package desafio08;

/**
 *
 * @author Marcos
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

public class Desafio08{
    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader(new FileReader("Path"));
        String sCurrentLine;
        while ((sCurrentLine = br.readLine()) != null)
        {
            System.out.println(sCurrentLine);
        }
    }
}



