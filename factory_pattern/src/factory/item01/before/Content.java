package factory.item01.before;

import factory.item01.after.Category;

public class Content {

    private boolean video;

    private boolean audio;

    private Category category;

    public Content() {};

    public Content(boolean video, Category category) {
        this.video = video;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Content{" +
                "video=" + video +
                ", audio=" + audio +
                ", category=" + category +
                '}';
    }

    public static void main(String[] args) {
        Category newCategory = new Category();
        //Content contentFirst = new Content(newCategory, true);
        Content contentSecond = new Content(true, newCategory);

        //System.out.println(contentFirst);
        System.out.println(contentSecond);
    }
}
