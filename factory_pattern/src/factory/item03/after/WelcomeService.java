package factory.item03.after;

public interface WelcomeService {
    static WelcomeService of(String lang) {
        if (lang.equals("ko")) {
            return new KoreaWelcomeService();
        } else if (lang.equals("jp")) {
            return new JapanWelcomeService();
        }

        throw new IllegalArgumentException();
    }

    String say();
}
