import com.sun.org.apache.xpath.internal.objects.XStringForChars;

import java.util.InputMismatchException;
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


        do {
            int i = ruch.nextInt();

            if (i == 1 || i == 2 || i == 3) {

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
                }

                System.out.println("Warunki po decyzji gracza:");
                for (Weather lvl : Weather.values()) {
                    System.out.println(lvl + " " + lvl.level);
                }
                System.out.println();


                Weather.SUN.setLevel(randomGenerator.nextInt(5));
                if (Weather.SUN.level > 2) {
                    Weather.WATER.level -= 2;
                } else {
                    Weather.WATER.level -= 1;
                }

                if (Weather.WORM.level == 0) {
                    Weather.WORM.setLevel(randomGenerator.nextInt(3));
                } else {
                    Weather.WORM.level += 1;
                }
                Weather.FERTILIZER.level -= 1;

                System.out.println("Warunki w kolejnej turze:");
                for (Weather lvl : Weather.values()) {
                    System.out.println(lvl + " " + lvl.level);
                }
                System.out.println();

                if (Weather.WATER.level > 5 || Weather.WATER.level < 0 ||
                        Weather.WORM.level > 3 || Weather.FERTILIZER.level > 5
                        || Weather.FERTILIZER.level < 0) {
                    plant1.life = false;
                }
                System.out.println(plant1.name + " czy żyje?: " + plant1.life);
                System.out.println();

            } else if (i > 3 || i < 1) {
                System.out.println("za bardzo kombinujesz... wybierz opcję 1,2 lub 3");
            } else {
                throw new IllegalArgumentException("zła wartość");
            }
        }
            while (plant1.life == true) ;


            ruch.close();
            System.out.println("KONIEC GRY");

    }
}