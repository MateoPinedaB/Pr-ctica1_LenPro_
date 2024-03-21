public class Archangels extends Angel{
    @Override
    public void ChangeColor() {
        String[] color = {"Celeste", "Lila", "Rosado"};
        int randomNumber = (int)(Math.random() * color.length);
        setColor(color[randomNumber]);
    }

    public void setColor(String color) {
        System.out.println("Mi color es: " + color);
    }

    @Override
    public void ChangeDimension() {
        System.out.println("I can change Dimension with certain Difficulty.");
    }

    @Override
    public void fly() {
        System.out.println("I fly with my "+ Alas()+" Wings.");
    }

    @Override
    public void ShapeShift() {
        System.out.println("I can shapeshift into a Cat.");
    }
    public String Jerarquia() {
        String Order ="Lowest Order Medium Level Angel";
        return Order;
    }
    public int Alas() {
        int alas = 4;
        return alas;
    }
    private String Spear = "I have a Spear";
    private String Blade = "I have a Blade";
    //Getters and Setters
    public String getSpear() {
        return Spear;
    }
    public String getBlade() {
        return Blade;
    }
    private String name = "Guardian Angel";
    public String getName() {
        return name;
    }
}
