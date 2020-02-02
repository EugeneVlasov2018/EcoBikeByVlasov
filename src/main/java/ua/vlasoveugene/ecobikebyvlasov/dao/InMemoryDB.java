package ua.vlasoveugene.ecobikebyvlasov.dao;

import lombok.Data;
import ua.vlasoveugene.ecobikebyvlasov.view.Bike;

import java.util.List;

import static ua.vlasoveugene.ecobikebyvlasov.utils.BikeFileReader.prepareInMemoryDb;

@Data
public class InMemoryDB {
    private List<Bike> bikes = prepareInMemoryDb();
}
