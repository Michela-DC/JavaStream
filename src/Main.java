//Exercise: Streams
//     Create a new Java project, inside the src folder define a file called file.txt that has the following lines:
//
//      hello
//      how
//      are you
//      ?
//
//      create a tester class that uses the Stream API to try to read each line of file.txt
//      catch a potential IOException

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        String filePath = "src/file.txt"; //salvo il path del file.txt dentro una variabile String

        // dentro il try creo un nuovo Stream di stringhe partendo dal file specificato in filePath
        // Files.lines(Paths.get(filePath)) --> Files.lines vuole un path come argomento e ritorna uno stream di lines recuperato dal path che gli viene passato
        // Paths.get(filePath) --> Paths.get crea un oggetto di tipo path usando ciò che gli viene passato come argomento
        try (Stream<String> lines = Files.lines(Paths.get(filePath))) {
            lines.forEach(System.out::println); //ciclo dentro allo Stream che ho creato

        } catch (IOException e) { // IOException è l'exception relativa a errori legati al leggere o scrivere un file
            e.printStackTrace();
        }
    }
}