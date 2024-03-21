public class Dog extends LivingBeings implements EarthBeing{
    @Override
    public void respawn() {
        System.out.println("I can't respawn.");
    }
    @Override
    public void die() {
        System.out.println("I died.");
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
        System.out.println("I Can, yes. But i won't.");
    }
    private String race = "I'm a dog.";
    private String Bark = "I am Barking.";
    //Getters and Setters
    public String getRace() { return this.race;}
    public void setRace(String race){
        this.race = race;
    }
    public String getBark(){
        return Bark;
    }
    private String name = "Dog";
    //Getters and Setters
    public String getName() {
        return name;
    }
}
