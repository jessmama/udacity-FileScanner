import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) throws FileNotFoundException {
        String line="";
        File file =new File("TwoCities.txt");
        Scanner filescanner=new Scanner(file);

        while(filescanner.hasNextLine()){
            line=filescanner.nextLine();
        }
        String[] word = line.split("");

    }
}
