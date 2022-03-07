package CollectionJenerics;

import java.util.ArrayList;

public class SolarSystemDemo {
    public static ArrayList<String> planets = new ArrayList<>();

    public static void main(String[] args) {
        addPlanets();
        print();
        createNewPlanet("Звезда Смерти");
        print();
    } // main(String[]) method

    public static void createNewPlanet(String planetName) {
        planets.add(3, planetName);
    } // createNewPlanet(String) method

    public static void addPlanets() {
        planets.add("Меркурий");
        planets.add("Венера");
        planets.add("Земля");
        planets.add("Марс");
        planets.add("Юпитер");
        planets.add("Сатурн");
        planets.add("Уран");
        planets.add("Нептун");
    } // addPlanets() method

    public static void print() {
        for (int i = 0; i < planets.size(); i++) {
            System.out.println(String.format("%s — %d-я планета от Солнца", planets.get(i), (i + 1)));
        }
        System.out.println();
    } // print() method
} // SolarSystemDemo class
