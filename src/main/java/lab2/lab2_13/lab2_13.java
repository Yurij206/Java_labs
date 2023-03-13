package lab2.lab2_13;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.CSVReaderHeaderAware;

import java.io.FileReader;
import java.util.Map;

public class lab2_13 {
    private static final String PATH = "src/main/resources/file.csv";

    public static void main(String[] args) throws Exception {
        CSVReader reader = new CSVReaderBuilder(new FileReader(PATH)).build();
        String [] nextLine;
        while ((nextLine = reader.readNext()) != null) {
            for(int i=0; i<(nextLine[0].split(";").length);i++)
                System.out.printf("%s ",nextLine[0].split(";")[i]);
            System.out.println();
        }
    }
}
