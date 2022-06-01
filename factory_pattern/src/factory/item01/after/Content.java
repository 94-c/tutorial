package factory.item01.after;


public class Content {

    private boolean video;

    private boolean audio;

    private Category category;

    public static Content videoContent(Category category) {
        Content content = new Content();
        content.video = true;
        content.category = category;

        return  content;
    }

    public static Content audioContent(Category category) {
        Content content = new Content();
        content.audio = true;
        content.category = category;

        return content;
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
        Content contentFirst = Content.videoContent(newCategory);
        Content contentSecond = Content.audioContent(newCategory);

        System.out.println(contentFirst);
        System.out.println(contentSecond);
    }
}
