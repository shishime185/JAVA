package question20_22;

public class Sushi {
    private String taste;
    private String type;

    public Sushi(String taste, String type) {
        this.taste = taste;
        this.type = type;
    }

    public String getTaste() {
        return this.taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static void main(String[] args) {
        Sushi sushi = new Sushi("うまい", "和食");
        System.out.println("寿司は" + sushi.getTaste());
        System.out.println("寿司は" + sushi.getType() + "です");
    }
}
