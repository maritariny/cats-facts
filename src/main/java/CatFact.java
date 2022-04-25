public class CatFact {
    public String id;
    public String text;
    public String type;
    public String user;
    public Integer upvotes;

    public CatFact() {
        // Пустой конструктор
    }

    public CatFact(String id, String text, String type, String user, Integer upvotes) {
        this.id = id;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upvotes = upvotes;
    }

    @Override
    public String toString() {
        return "CatFact{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", type='" + type + '\'' +
                ", user='" + user + '\'' +
                ", upvotes=" + upvotes +
                '}';
    }

    public Integer getUpvotes() {
        return this.upvotes;
    }
}
