public class Virtues extends Angel{
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
        System.out.println("I can change Dimension as everybody else.");
    }

    @Override
    public void respawn() {
        System.out.println("Believe it or not, i fought for this privilege.");
    }

    @Override
    public void fly() {
        System.out.println("I fly with my "+Alas()+" Wings. Although i'm kinda average on speed.");
    }

    @Override
    public void ShapeShift() {
        System.out.println("I can shapeshift into an Beige Wall...");
    }
    public String Jerarquia() {
        String Order ="Middle Order Medium Level Angel";
        return Order;
    }
    public int Alas() {
        int alas = 10;
        return alas;
    }
    private String Atribute = "I am the most Average of the Averages...";
    private String Proud = "I am very proud of my wings, although they are not the best...";
    //Getters and Setters
    public String getAtribute() {
        return Atribute;
    }
    public String getProud() {
        return Proud;
    }
    private String name = "Virtude";
    public String getName() {
        return name;
    }
}
