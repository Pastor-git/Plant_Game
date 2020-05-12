import java.util.Random;
import java.util.Scanner;

public class GameEngine {

    public static void main(String[] args) {

        Random randomGenerator = new Random();
        Scanner ruch = new Scanner(System.in);

        Plant plant1 = new Plant("kwiatek", true);
        System.out.println(plant1.name + " czy żyje?: " + plant1.life);
        System.out.println("Nazwa Twojej roślinki: " + plant1.name);
        System.out.println();
        System.out.println("Warunki startowe: ");

        int a = randomGenerator.nextInt(5);
        Weather.SUN.setLevel(a);
        int b = randomGenerator.nextInt(5);
        Weather.FERTILIZER.setLevel(b);
        int c = randomGenerator.nextInt(5);
        Weather.WATER.setLevel(c);
        int d = randomGenerator.nextInt(3);
        Weather.WORM.setLevel(d);

        for (Weather lvl : Weather.values()) {
            System.out.println(lvl + " " + lvl.level);
        }
        System.out.println();
        System.out.println("Wybierz działanie: ");
        System.out.println("Dodaj wody - 1");
        System.out.println("Dodaj nawozu - 2");
        System.out.println("Zabij robaki - 3");

        System.out.println(Weather.WORM.name() + " " + Weather.WORM.level);

        int i = ruch.nextInt();
        switch (i) {
            case 1:
                plant1.addwater();
                break;
            case 2:
                plant1.adfertilizer();
                break;
            case 3:
                plant1.killworm();
                break;
            default:
            System.out.println("za bardzo kombinujesz - game over, zacznij jeszcze raz");
            ruch.close();
        }
        for (Weather lvl : Weather.values()) {
            System.out.println(lvl + " " + lvl.level);
        }
    }
}
