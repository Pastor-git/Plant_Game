public enum Weather {
    SUN(0),
    WATER(0),
    FERTILIZER(0),
    WORM(0);
    int level;
    private Weather (int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
