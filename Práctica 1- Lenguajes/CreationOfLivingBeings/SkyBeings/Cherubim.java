public class Cherubim extends Angel{
    @Override
    public void ChangeColor() {
        String[] color = {"Carmesí", "Bermellón", "Salitre"};
        int randomNumber = (int)(Math.random() * color.length);
        setColor(color[randomNumber]);
    }

    public void setColor(String color) {
        System.out.println("Mi color es: " + color);
    }

    @Override
    public void ChangeDimension() {
        System.out.println("I can change Dimension like breathing.");
    }

    @Override
    public void respawn() {
        System.out.println("As long Heaven exist, i will be. I'm an immortal being");
    }

    @Override
    public void fly() {
        System.out.println("I fly with my "+ Alas()+" Wings.");
    }

    @Override
    public void ShapeShift() {
        System.out.println("I can shapeshift into a Three Faced Anaconda.");
    }
    public String Jerarquia() {
        String Order ="Highest Order Medium Level Angel";
        return Order;
    }
    public int Alas() {
        int alas = 16;
        return alas;
    }
    private int Eyes = 42;
    private int Faces = 3;
    private int Rings = 6;
    //Getters and Setters
    public int getEyes() {
        return Eyes;
    }
    public int getFaces() {
        return Faces;
    }
    public int getRings() {
        return Rings;
    }
    private String name = "Cherubim";
    public String getName() {
        return name;
    }
}
