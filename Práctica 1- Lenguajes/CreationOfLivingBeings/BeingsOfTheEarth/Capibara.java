public class Capibara extends LivingBeings implements EarthBeing{
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
    private String Status = "I am the Best Animal.";
    private String Swim = "I am swimming.";
    //Getters and Setters
    public String getStatus() {
        return Status;
    }
    public void setStatus(String status) {
        Status = status;
    }
    
    public String getSwim() {
        return Swim;
    }
    private String name = "Capibara";
    public String getName() {
        return name;
    }
}
