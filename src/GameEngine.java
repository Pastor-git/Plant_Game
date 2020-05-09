public class GameEngine {
    public static void main(String[] args) {
        for (Weather a : Weather.values()) {
            System.out.println(a);
        }
        Weather.SUN.setLevel(3);
        Weather.FERTILIZER.setLevel(4);
        Weather.WATER.setLevel(2);
        Weather.WORM.setLevel(4);

        System.out.println();

         for (Weather b : Weather.values()) {
        System.out.println(b + " " + b.level);
         }

        System.out.println(Weather.WORM + " " + Weather.WORM.level);
        int a = 1;
        Weather.WORM.setLevel(a);

        System.out.println(Weather.WORM + " " + Weather.WORM.level);
    }
}
