package Objects;

public class Skyscraper {
    public static final String SKYSCRAPER_WAS_BUILD = "Небоскреб построен.";
    public static final String SKYSCRAPER_WAS_BUILD_FLOORS_COUNT = "Небоскреб построен. Количество этажей - ";
    public static final String SKYSCRAPER_WAS_BUILD_DEVELOPER = "Небоскреб построен. Застройщик - ";
    public static int height;
    public static String builder;

    //напишите тут ваш код
    public Skyscraper(){

    }
    public Skyscraper(int height){
        this.height = height;

    }
    public Skyscraper(String builder){
        this.builder = builder;
    }

    public static void main(String[] args) {
        Skyscraper skyscraper = new Skyscraper();
        System.out.println("Небоскреб построен.");

        Skyscraper skyscraperTower = new Skyscraper(50);
        System.out.println("Небоскреб построен. Количество этажей - " + height + "");

        Skyscraper skyscraperSkyline = new Skyscraper("JavaRushDevelopment");
        System.out.println("Небоскреб построен. Застройщик - " + builder + "");

    }
}
