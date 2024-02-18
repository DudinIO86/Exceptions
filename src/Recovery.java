import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Recovery {
    public static void rec(String str, String fam) throws IOException {

       try {
           File log = new File(fam + ".txt");
           FileWriter fileWriter = new FileWriter(log, true);
           fileWriter.write(str+"\n\n");
           fileWriter.flush();
           fileWriter.close();
       }catch (IOException e){
           e.printStackTrace();
       }

    }
}
