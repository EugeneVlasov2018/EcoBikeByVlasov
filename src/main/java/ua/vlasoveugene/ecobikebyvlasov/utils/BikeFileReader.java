package ua.vlasoveugene.ecobikebyvlasov.utils;

import lombok.Data;
import ua.vlasoveugene.ecobikebyvlasov.view.Bike;
import ua.vlasoveugene.ecobikebyvlasov.view.EBike;
import ua.vlasoveugene.ecobikebyvlasov.view.FoldingBike;
import ua.vlasoveugene.ecobikebyvlasov.view.SpeedBike;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Data
public class BikeFileReader {
    private static final String FILENAME = "src/main/resources/ecobike.txt";
    private static final String FILE_NOT_FOUND = "Sorry, boyz, no bananaz(( Some bastards stole all our bikes";
    private static final String IOEXCEPTION ="Ooooops, something goes wrong. The cause is %s";
    private static final List<String> FILE = getReadedFile();

    public static List<Bike> prepareInMemoryDb(){
        return FILE.stream()
                .map(currentrow -> parseRowToBike(currentrow))
                .collect(Collectors.toList());
    }

    private static List<String> getReadedFile(){
        List<String> result = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(FILENAME))){
            while (reader.ready()){
                result.add(reader.readLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println(FILE_NOT_FOUND);
        } catch (IOException e) {
            System.out.println(String.format(IOEXCEPTION, e.getMessage()));
        }
        return result;
    }

    private static Bike parseRowToBike(String currentRowFromFile) {
        Bike result;
        if(currentRowFromFile.contains("SPEEDELEC")){
            result = getSpeedBike(currentRowFromFile);
        } else if (currentRowFromFile.contains("FOLDING BIKE")){
            result = getFoldingBike(currentRowFromFile);
        } else if (currentRowFromFile.contains("E-BIKE")){
            result = getEBike(currentRowFromFile);
        } else {
            result = null;
        }
        return result;
    }

    private static Bike getEBike(String currentRowFromFile) {
        String[] params = currentRowFromFile.split("; ");
        String typeOfByke = params[1].split(" ")[1];
        String brand = params[1].split(" ")[2];
        return EBike.builder()
                .brand(brand)
                .bikeType(typeOfByke)
                .maxSpeed(Integer.parseInt(params[2]))
                .weight(Integer.parseInt(params[3]))
                .forwardBackLight(Boolean.parseBoolean(params[4].toLowerCase()))
                .batteryCapacity(Integer.parseInt(params[5]))
                .color(params[6])
                .price(new BigDecimal(params[7]))
                .build();
    }

    private static Bike getFoldingBike(String currentRowFromFile) {
        return null;
    }

    private static Bike getSpeedBike(String currentRowFromFile) {
        return null;
    }
}
