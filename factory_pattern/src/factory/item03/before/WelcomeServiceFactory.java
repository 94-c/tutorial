package factory.item03.before;

public class WelcomeServiceFactory {

    public static WelcomeService of(String lang) {
        if (lang.equals("ko")){
            return new KoreaWelcomeService();
        } else if (lang.equals("jp")) {
            return new JapanWelcomeService();
        }
        throw  new IllegalArgumentException();
    }

    public static void main(String[] args) {
        WelcomeService welcomeService = WelcomeServiceFactory.of("ko");
        System.out.println(welcomeService);
    }
}
