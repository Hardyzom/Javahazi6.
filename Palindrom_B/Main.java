import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String filenev = "words_alpha.txt";
        int szamlalo = 0;

        BufferedReader br = new BufferedReader(new FileReader(filenev));
        String szo;
        while ((szo = br.readLine()) != null) {
            if (StringUtils.isPalindrome(szo)) {
                szamlalo++;
            }
        }
        br.close();
        
        System.out.println("A palindróm szavak száma: " + szamlalo);

    }
}
