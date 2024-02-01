import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Clase principal que contiene el método main para ejecutar la aplicación.
 */
public class Main {

    /**
     * Método para leer el contenido de un archivo de texto.
     *
     * @param filePath Ruta del archivo de texto a leer.
     * @return El contenido del archivo como una cadena de caracteres.
     */
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

    /**
     * Método principal de la aplicación.
     *
     * @param args Los argumentos de la línea de comandos (no utilizados en este ejemplo).
     */
    public static void main(String[] args) {
        // Crear una pila para la calculadora
        MyStack<Integer> pila = new MyStack<>();
        // Crear una instancia de la calculadora
        CalculadoraPOSTFIX calculadora = new CalculadoraPOSTFIX(pila);

        // Leer el contenido del archivo de texto "datos.txt"
        String fileContent = readTxtFile("datos.txt");
        // Dividir el contenido del archivo en expresiones individuales
        String[] expressions = fileContent.split("\n");

        // Iterar sobre cada expresión en el archivo
        for (String expression : expressions) {
            // Imprimir la expresión actual
            System.out.println("Expresión: " + expression);
            // Calcular el resultado de la expresión y mostrarlo
            System.out.println("Resultado: " + calculadora.calcular(expression));
            System.out.println(); // Imprimir una línea en blanco para mayor claridad
        }
    }
}
