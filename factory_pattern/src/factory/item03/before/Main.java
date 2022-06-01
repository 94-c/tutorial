package factory.item03.before;

public class Main {
    public static void main(String[] args) {
        WelcomeService welcomeService = WelcomeServiceFactory.of("att");
        System.out.println(welcomeService);
    }
}
