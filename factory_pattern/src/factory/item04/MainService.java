package factory.item04;

import java.util.ServiceLoader;

public class MainService {
    public static void main(String[] args) {
        ServiceLoader<WelcomeService> loader = ServiceLoader.load(WelcomeService.class);

        for (WelcomeService service : loader) {
            System.out.println(service.say());
        }
    }
}
