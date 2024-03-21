public class Dog extends LivingBeings implements EarthBeing{
    @Override
    public void respawn() {
        System.out.println("No puedo reaparecer.");
    }
    @Override
    public void die() {
        System.out.println("Soy Capaz de morir.");
    }
    @Override
    public void born() {
        System.out.println("He nacido.");
    }
    @Override
    public void grow() {
        System.out.println("Estoy Creciendo.");
    }
    @Override
    public void reproduce() {
        System.out.println("Puedo, pero no lo haré.");
    }
    private String race = "Soy un Border Collie.";
    private String Bark = "Estoy Ladrando.";
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
