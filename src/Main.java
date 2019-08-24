import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.println("Podaj Id kraju");
        String id = input1.nextLine();

        try {
            Map<String, Country> stringCountryMap = downloadCountry("country.csv");
            Country country = stringCountryMap.get(id);
            if (stringCountryMap.get(id).equals(downloadCountry(id))) {
                System.out.println(country);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Nie ma takiego pliku");
        }

    }

    static Map<String, Country> downloadCountry(String s) throws FileNotFoundException {
        Map<String, Country> countryMap = new TreeMap<>();
        File file = new File("country.csv");
        Scanner input = new Scanner(file);
        while (input.hasNextLine()) {
            String line = input.nextLine();
            String[] split = line.split(";");
            Country country = new Country(split[0], split[1], Integer.valueOf(split[2]));
            countryMap.put(country.getId(), country);

        }
        return countryMap;
    }
}
