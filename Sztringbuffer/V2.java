import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class V2 {
    public static void main(String[] args) throws IOException{
        int N = FajlbolSzam();

        StringBuilder eredmeny = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            eredmeny.append(i);
        }

        System.out.println(eredmeny.toString());
    }

    private static int FajlbolSzam() throws IOException{

        BufferedReader br = new BufferedReader(new FileReader("config.txt"));
        String line = br.readLine();
        br.close();

        return Integer.parseInt(line.replaceAll("_", ""));

    }
}