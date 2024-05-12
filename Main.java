import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> spliter = new ArrayList<String>();
        File file = new File("email.csv");
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                String[] split = line.split(";");
                spliter.add(Arrays.toString(split));
                for(String splits : split) {
                    System.out.println(splits);
                }
            }
            reader.close();
        } catch(Exception e) {
            System.out.println(e);
  }
}
    }
