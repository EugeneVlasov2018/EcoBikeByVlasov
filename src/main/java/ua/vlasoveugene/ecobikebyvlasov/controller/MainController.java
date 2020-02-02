package ua.vlasoveugene.ecobikebyvlasov.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import ua.vlasoveugene.ecobikebyvlasov.model.ConsoleModel;
import ua.vlasoveugene.ecobikebyvlasov.view.Bike;

import java.util.List;

@Data
@AllArgsConstructor
public class MainController {
    private final String GREETINGS = "Dear user, welcome to our SUPERBIKESHOP!\n Please, choose command from list:";
    private ConsoleModel model;

    public void beginWork() {
        System.out.println(GREETINGS);
    }
}
