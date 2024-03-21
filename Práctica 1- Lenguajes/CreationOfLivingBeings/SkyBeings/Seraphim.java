public class Seraphim extends Angel{
    @Override
    public void ChangeColor() {
        String[] color = {"Negro", "Rojo", "Plateado"};
        int randomNumber = (int)(Math.random() * color.length);
        setColor(color[randomNumber]);
    }

    public void setColor(String color) {
        System.out.println("Mi color es: " + color);
    }

    @Override
    public void ChangeDimension() {
        System.out.println("You need to put an effort to do that?");
    }

    @Override
    public void fly() {
        System.out.println("I fly with my "+ Alas() +" Wings.");
    }

    @Override
    public void ShapeShift() {
        System.out.println("As a seraph, I don't have the ability to change shape. And I don't need it.");
    }

    @Override
    public void respawn() {
        System.out.println("Death is a mortal concept, i was just sleeping.");
    }
    public String Jerarquia() {
        String Order ="Highest Order High Level Angel";
        return Order;
    }
    public int Alas() {
        int alas = 18;
        return alas;
    }
    private String Power= "Is that Even Cuantificable?";
    private String Arrogance = "I'm not Arrogant, I'm just better than you.";
    private String DistanceTillGod = "I'm the closest to God, I'm his right hand.";
    //Getters and Setters
    public String getPower() {
        return Power;
    }
    public String getArrogance() {
        return Arrogance;
    }
    public String getDistanceTillGod() {
        return DistanceTillGod;
    }
    private String name = "Seraphim";
    public String getName() {
        return name;
    }
}
