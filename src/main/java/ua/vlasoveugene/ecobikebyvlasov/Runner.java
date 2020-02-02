package ua.vlasoveugene.ecobikebyvlasov;

import ua.vlasoveugene.ecobikebyvlasov.controller.MainController;
import ua.vlasoveugene.ecobikebyvlasov.model.ConsoleModel;

import java.util.List;

import static ua.vlasoveugene.ecobikebyvlasov.utils.BikeFileReader.getReadedFile;

public class Runner {
    private static final MainController controller = new MainController(new ConsoleModel());

    public static void main(String[] args) {
        controller.beginWork();
    }
}
