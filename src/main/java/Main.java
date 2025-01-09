import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void scriere(List<PerecheNumere> lista) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.enable(SerializationFeature.INDENT_OUTPUT);
            File file = new File("C:\\Users\\macov\\Desktop\\java_laboratoare\\lab5ex1\\src\\main\\resources\\perechinumere.json");
            mapper.writeValue(file, lista);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<PerecheNumere> citire() {
        try {
            File file = new File("C:\\Users\\macov\\Desktop\\java_laboratoare\\lab5ex1\\src\\main\\resources\\perechinumere.json");
            ObjectMapper mapper = new ObjectMapper();
            List<PerecheNumere> persoane = mapper
                    .readValue(file, new TypeReference<List<PerecheNumere>>() {
                    });
            return persoane;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        List<PerecheNumere> p2 = citire();
        p2.forEach(System.out::println);

        System.out.println("\n");
        System.out.println("Consecutive:");
        for (PerecheNumere perecheNumere : p2) {
            System.out.println(perecheNumere.Consecutive());
        }

        System.out.println("\n");
        System.out.println("CMMDC:");
        for (PerecheNumere perecheNumere : p2) {
            System.out.println(perecheNumere.cmmdc());
        }

        System.out.println("\n");
        System.out.println("Suma cifrelor egala:");
        for (PerecheNumere perecheNumere : p2) {
            System.out.println(perecheNumere.SumaCifrelorEgala());
        }

        System.out.println("\n");
        System.out.println("Perechile cu numere cifre pare egale:");
        for (PerecheNumere perecheNumere : p2) {
            if (perecheNumere.NumarCifrePareEgale()) {
                System.out.println(perecheNumere);
            }
        }
    }
}