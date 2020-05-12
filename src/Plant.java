public class Plant implements Decisions {

    boolean life;
    String name;
    public String getName() {
        return name;
    }
    public boolean isLife() {
        return life;
    }
    public void setLife(boolean life) {
        this.life = life;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Plant (String name, boolean life) {
        this.name = name;
        this.life = life;
    }

    public void addwater() {
    Weather.WATER.level += 2;
    }

    public void killworm() {
        Weather.WORM.setLevel(0);
    }

    public void adfertilizer() {
    Weather.FERTILIZER.level +=  2;
    }

}
