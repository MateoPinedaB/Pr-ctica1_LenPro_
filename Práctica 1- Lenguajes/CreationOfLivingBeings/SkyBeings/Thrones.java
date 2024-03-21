public class Thrones extends Angel{
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
        System.out.println("I can change Dimensions with no problem.");
    }

    @Override
    public void respawn() {
        System.out.println("On my level, death is mostly irrelevant.");
    }

    @Override
    public void fly() {
        System.out.println("I fly with my "+ Alas() +" Wings.");
    }

    @Override
    public void ShapeShift() {
        System.out.println("I can shapeshift into a Cammel.");
    }
    public String Jerarquia() {
        String Order ="Highest Order Low Level Angel";
        return Order;
    }
    public int Alas() {
        int alas = 14;
        return alas;
    }
    private String Body = "I am mostly Marmol.";
    private String  Tail = "I have a long and beautiful Tail.";
    //Getters and Setters
    public String getBody() {
        return Body;
    }
    public String getTail() {
        return Tail;
    }
    private String name = "Throne";
    public String getName() {
        return name;
    }
}
