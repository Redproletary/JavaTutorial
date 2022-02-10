package Classes;

public class SolarSystemDemo {
    public static void main(String[] args) {

        SolarSystem ss = new SolarSystem();

        System.out.println("Человечество живет в Солнечной системе.");
        System.out.println("Ее возраст около " + ss.age + " лет.");
        System.out.println("В Солнечной системе " + ss.planetsCount + " известных планет.");
        System.out.println("Как и большинство звездных систем, состоит из " + ss.starsCount + " звезды.");
        System.out.println("Звезды по имени " + ss.starName + ".");
        System.out.println("Расстояние к центру галактики составляет " + ss.galacticCenterDistance + " световых лет.");
        System.out.println("Каждый обитатель Солнечной системы должен знать эту информацию!");

    }
}
