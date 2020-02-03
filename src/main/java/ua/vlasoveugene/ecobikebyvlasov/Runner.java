package ua.vlasoveugene.ecobikebyvlasov;

import ua.vlasoveugene.ecobikebyvlasov.controller.MainController;
import ua.vlasoveugene.ecobikebyvlasov.dao.InMemoryDB;
import ua.vlasoveugene.ecobikebyvlasov.model.ConsoleModel;

public class Runner {
    private static final MainController controller = new MainController(new ConsoleModel());

    public static void main(String[] args) {
        InMemoryDB db = new InMemoryDB();
    }
}
