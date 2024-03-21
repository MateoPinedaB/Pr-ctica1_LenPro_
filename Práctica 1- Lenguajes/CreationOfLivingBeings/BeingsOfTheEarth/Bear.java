public class Bear extends LivingBeings implements EarthBeing{
    @Override
    public void respawn() {
        System.out.println("I can't respawn.");
    }
    @Override
    public void die() {
        System.out.println("I Can.");
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
        System.out.println("I Can Reproduce.");
    }
    private String  furColor = "I have brown fur.";
    private String  roar = "I am Roaring.";
    //Getters and Setters
    public String getFurColor() {
        return furColor;
    }
    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }
    
    public String getRoar() {
        return roar;
    }
    private String name = "Bear";
    public String getName() {
        return name;
    }
}
