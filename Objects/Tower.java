package Objects;

public class Tower {private int floorsCount;
    private String developer;

    public Tower() {
        this.floorsCount = 5;
        this.developer = "Development";
    }

    public Tower(int floorsCount, String developer) {
        this.floorsCount = floorsCount;
        this.developer = developer;
    }

    public static void main(String[] args) {
        Tower Tower = new Tower();
        Tower skyscraperUnknown = new Tower(50, "Неизвестно");
    }
}
