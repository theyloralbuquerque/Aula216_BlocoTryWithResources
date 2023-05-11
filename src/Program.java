import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

    public static void main(String[] args) {

        String path = "c:\\temp\\in.txt";
        
        // O objeto br é instanciado recebendo como argumento um novo FileReader que recebe path como argumento.
        try (BufferedReader br = new BufferedReader(new FileReader(path))){ 

            String linha = br.readLine(); // .readLine() Lê uma linha do arquivo, se o arquivo já estiver no final o readLine()  retorna null.

            while (linha != null) {
                System.out.println(linha);
                linha = br.readLine();
            }
        }
        catch(IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }

    }
}