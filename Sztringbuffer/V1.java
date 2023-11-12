import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class V1 {
    public static void main(String[] args) throws IOException {
        int N = FajlbolSzam();

        String eredmeny = "";
        for (int i = 1; i <= N; i++) {
            eredmeny += i;
        }

        System.out.println(eredmeny);
    }

    private static int FajlbolSzam() throws IOException{

        BufferedReader br = new BufferedReader(new FileReader("config.txt"));
        String line = br.readLine();
        br.close();

        return Integer.parseInt(line.replaceAll("_", ""));

    }
}