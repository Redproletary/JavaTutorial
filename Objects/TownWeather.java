package Objects;

public class TownWeather {
    public static void showWeather(City city) {
        System.out.printf("В городе %s сегодня температура воздуха %d", city.getName(), city.getTemperature());
    }

    public static void main(String[] args) {
        City city = new City("Дубай", 40);
        showWeather(city);
    }
}
