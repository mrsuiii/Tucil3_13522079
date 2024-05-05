package utils;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Dict {
    // method untuk mendapatkan set of word dari file txt
    public static Set<String> readFromFile(String fileName){
        Set<String> wordSet = new HashSet<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Convert to lowercase and add to set
                wordSet.add(line.toLowerCase());
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
        return wordSet;
    }
    
    
}
