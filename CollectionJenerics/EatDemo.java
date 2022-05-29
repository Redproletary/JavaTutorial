package CollectionJenerics;

public class EatDemo {
    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.eat(new Food("мясо"));
        lion.eat(null);
    } // main(String[]) method
} // EatDemo class
