public class GuardianAngels extends Angel{
    @Override
    public void ChangeColor() {
        String[] color = {"Ceniza", "Amarillo", "Lima"};
        int randomNumber = (int)(Math.random() * color.length);
        setColor(color[randomNumber]);
    }

    public void setColor(String color) {
        System.out.println("Mi color es: " + color);
    }

    @Override
    public void ChangeDimension() {
        System.out.println("I can change Dimension with a lot of effort.");
    }

    @Override
    public void fly() {
        System.out.println("I fly with my "+ Alas()+" Wings.");
    }

    @Override
    public void ShapeShift() {
        System.out.println("I can shapeshift into a Dog.");
    }
    public String Jerarquia() {
        String Order ="Lowest Order Low Level Angel";
        return Order;
    }
    public int Alas() {
        int alas = 2;
        return alas;
    }
    private String Blade = "I have a Blade";
    private String Shield = "I have a Shield";
    //Getters and Setters
    public String getBlade() {
        return Blade;
    }
    public String getShield() {
        return Shield;
    }
    private String name = "Guardian Angel";
    public String getName() {
        return name;
    }
}
