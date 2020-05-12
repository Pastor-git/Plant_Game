import java.util.Random;
import java.util.Scanner;

public class GameEngine implements Decisions {




    @Override
    public void addwater() {

    }

    @Override
    public void killworm() {

    }

    @Override
    public void adfertilizer() {

    }


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

        Weather.WORM.level = Weather.WORM.level + 2;
        System.out.println(Weather.WORM.name() + " " + Weather.WORM.level);

    }
}
