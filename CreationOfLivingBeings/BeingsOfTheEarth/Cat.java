public class Cat extends LivingBeings implements EarthBeing{
    @Override
    public void respawn() {
        System.out.println("No puedo renacer.");
    }
    @Override
    public void die() {
        System.out.println("Morí, pero tengo más vidas.");
    }
    @Override
    public void born() {
        System.out.println("Nací.");
    }
    @Override
    public void grow() {
        System.out.println("Estoy creciendo.");
    }
    @Override
    public void reproduce() {
        System.out.println("Puedo, pero no lo haré.");
    }
    private int lives = 9;
    private String Meowing = "Estoy maullando.";
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
    private String name = "Gato";
    public String getName() {
        return name;
    }
}
