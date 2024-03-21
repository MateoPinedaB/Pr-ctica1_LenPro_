public class Powers extends Angel{
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
        System.out.println("I can change Dimensions with strugle.");
    }

    @Override
    public void respawn() {
        System.out.println("Respawning...");
    }

    @Override
    public void fly() {
    System.out.println("I can fly with my "+Alas()+" Wings.");
    }

    @Override
    public void ShapeShift() {
        System.out.println("I can Shapeshift into a Fox.");
    }
    public String Jerarquia() {
        String Order ="Middle Order Low Level Angel";
        return Order;
    }
    public int Alas() {
        int alas = 8;
        return alas;
    }
    private int Arms = 4;
    private String Gender = "Hermafrodite.";
    //Getters and Setters
    public int getArms(){return Arms;}
    public String getGender(){return Gender;}
    private String name = "Power";
    public String getName() {
        return name;
    }
}
