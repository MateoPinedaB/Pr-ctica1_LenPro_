public class Cat extends LivingBeings implements EarthBeing{
    @Override
    public void respawn() {
        System.out.println("I can't respawn.");
    }
    @Override
    public void die() {
        System.out.println("I died, but i have more lives.");
    }
    @Override
    public void born() {
        System.out.println("I was born.");
    }
    @Override
    public void grow() {
        System.out.println("I'm growing.");
    }
    @Override
    public void reproduce() {
        System.out.println("I can, but I wont.");
    }
    private int lives = 9;
    private String Meowing = "I am Meowing.";
    //Getters and Setters
    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }
    public String getMeowing(){
        return Meowing;
    }
    private String name = "Cat";
    public String getName() {
        return name;
    }
}
