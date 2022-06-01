package factory.item03.after;

public class MainService {
    public static void main(String[] args) {
        WelcomeService welcomeService = WelcomeService.of("ko");
        System.out.println(welcomeService);
    }
}
