import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IntermediaryFileWork {
    public static void main(String[] args) {

        String file = "workFiles/src/model/utils/in.txt";
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(file);
            br = new BufferedReader(fr); /* new FileReader(file) */
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (fr != null) {
                    fr.close();
                }
            }catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
