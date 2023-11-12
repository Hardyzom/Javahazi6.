import java.util.List;

public class Main {
    public static void main(String[] args) {
        String filenev = "day01.txt";
        List <Integer> szamok = FileUtils.readFirstLineAsDigits(filenev);
        
        int osszeg = 0;
        for (Integer szam : szamok){
            osszeg += szam;
        }

        System.out.println("A számjegyek összege: " + osszeg);
        
    }
}