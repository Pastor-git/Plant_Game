public class Plant {

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
}
