package factory.item02;

import factory.item01.after.Category;

public class Content {
    private boolean video;
    private boolean audio;
    private Category category;
    private static final Content INSTANCE = new Content();

    private Content() {
    }

    public static Content newInstance() {
        return INSTANCE ;
    }

    public static void main(String[] args) {
        Content content = Content.newInstance();
        Content content1 = Content.newInstance();
        Content content2 = Content.newInstance();
        Content content3 = Content.newInstance();


        System.out.println(content.hashCode());
        System.out.println(content1.hashCode());
        System.out.println(content2.hashCode());
        System.out.println(content3.hashCode());
    }
}
