public class FallenHuman extends Human {
    @Override
    public void fly() {
        System.out.println("I can't fly, but I can fall from the sky.");
    }
    
    @Override
    public void ChangeColor() {
        System.out.println("I can't change my color, but I can change my clothes.");
    }
    
    @Override
    public void ChangeDimension() {
        System.out.println("I can't change my dimension, but I can change my perspective.");
    }
    
    @Override
    public void ShapeShift() {
        System.out.println("I can ShapeShift into a Cat.");
    }
    
    @Override
    public void grow() {
        System.out.println("I'm growing, but not in a good way.");
    }
    
    @Override
    public void born() {
        System.out.println("I was born, but I'm not sure if I'm alive.");
    }
    
    @Override
    public void respawn() {
        System.out.println("I can't respawn, but I can try...");
    }
    
    @Override
    public void die() {
        System.out.println("I hope i can...");
    }
    private String MagicEyes ="I have 2 eyes, but they can see the future...";
    private String Depression = "I'm always sad...";
//Getters and Setters
    public String getMagicEyes() {
        return MagicEyes;
    }
    public void setMagicEyes(String MagicEyes) {
        this.MagicEyes = MagicEyes;
    }
    
    public String getDepression() {
        return Depression;
    }
    public void setDepression(String Depression) {
        this.Depression = Depression;
    }
    private String name = "Fallen Human";
    public String getName() {
        return name;
    }
}
