import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) throws FileNotFoundException {
        String line="";
        int wordsCount=0;

        File file =new File("TwoCities.txt");

        try{
            Scanner filescanner=new Scanner(file);
            while(filescanner.hasNextLine()){
                line=filescanner.nextLine();
                String[] words = line.split(" ");
                wordsCount=wordsCount+words.length;
            }
            System.out.println("Total words count is :" + wordsCount);
        } catch(FileNotFoundException exception) {
            // Handle the situation by letting the user know what happened
            System.out.println("Cannot find that file:TwoCities.txt");
        }
    }
}
