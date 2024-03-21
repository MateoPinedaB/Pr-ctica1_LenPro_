public class Principalities extends Angel{
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
        System.out.println("I can change Dimension normally.");
    }

    @Override
    public void respawn() {
        System.out.println("I am being Resurrected?!");
    }

    @Override
    public void fly() {
        System.out.println("I am flying with my " + Alas() +" Wings.");
    }

    @Override
    public void ShapeShift() {
        System.out.println("I can shapeshift into a Fire Tiger.");
    }
    public String Jerarquia() {
        String Order ="Lowest Order High Level Angel";
        return Order;
    }
    public int Alas() {
        int alas = 6;
        return alas;
    }
    private int Legs = 4;
    //Getters and Setters
    public int getLegs(){
        return Legs;
    }
    private String name = "Principality";
    public String getName() {
        return name;
    }
}
