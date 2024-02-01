import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static String readTxtFile(String filePath) {
        StringBuilder contentBuilder = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                contentBuilder.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return contentBuilder.toString();
    }
     public static void main(String[] args) {   
        
        CalculadoraPOSTFIX calculadora = new CalculadoraPOSTFIX();

        String fileContent = readTxtFile("datos.txt");
        System.out.println(fileContent);

        System.out.println(calculadora.calcular(fileContent));
    }
}