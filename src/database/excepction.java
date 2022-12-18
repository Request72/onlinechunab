import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
  public static void main(String[] args) {
    try {
      FileReader fileReader = new FileReader("myfile.txt");
    } catch (FileNotFoundException e) {
      System.out.println("File not found: " + e.getMessage());
    }
  }
}
