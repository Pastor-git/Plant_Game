import java.util.Random;
import java.util.Scanner;

public class GameEngine {

    public static void main(String[] args) {

        Random randomGenerator = new Random();
        Scanner ruch = new Scanner(System.in);

        Plant plant1 = new Plant("kwiatek" , true);
        System.out.println(plant1.name + " czy żyje?: " + plant1.life);

        int a = randomGenerator.nextInt(5);
        Weather.SUN.setLevel(a);
        int b = randomGenerator.nextInt(5);
        Weather.FERTILIZER.setLevel(b);
        int c = randomGenerator.nextInt(5);
        Weather.WATER.setLevel(c);
        int d = randomGenerator.nextInt(3);
        Weather.WORM.setLevel(d);

        System.out.println();

         for (Weather lvl : Weather.values()) {
        System.out.println(lvl + " " + lvl.level);
         }


        System.out.println();



//        public void addwater();
//        public void killworm();
//        public void adfertilizer();


        System.out.println("dodaj wody - 1");
        System.out.println("dodaj nawozu - 2");
        System.out.println("zabij robaki - 3");




    }
}
