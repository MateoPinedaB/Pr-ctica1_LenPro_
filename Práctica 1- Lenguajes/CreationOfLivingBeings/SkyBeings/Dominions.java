public class Dominions extends Angel{
//------------------------------------------------------------------
    @Override
    public void ChangeColor() {
        String[] color = {"Negro", "Rojo", "Plateado"};
        int randomNumber = (int)(Math.random() * color.length);
        setColor(color[randomNumber]);
    }
//------------------------------------------------------------------
    public void setColor(String color) {
        System.out.println("Mi color es: " + color);
    }
//------------------------------------------------------------------
    @Override
    public void ChangeDimension() {
        System.out.println("I can change Dimension easily.");
    }
//------------------------------------------------------------------
    @Override
    public void respawn() {
        System.out.println("My Lord has resurrected me.");
    }
//------------------------------------------------------------------
    @Override
    public void fly() {
        System.out.println("I fly with my "+ Alas()+" Wings.");
    }
//------------------------------------------------------------------
    @Override
    public void ShapeShift() {
        System.out.println("I can shapeshift into a Winged Lion.");
    }
//------------------------------------------------------------------
    public String Jerarquia() {
        String Order ="Middle Order Highest Level Angel";
        return Order;
    }
//------------------------------------------------------------------
    public int Alas() {
        int alas = 12;
        return alas;
    }
//------------------------------------------------------------------
    private String Shield = "I have a Shield";
//------------------------------------------------------------------
    private String Cape = "I have a Cape";
//Getters and Setters
    public String getShield() {
        return Shield;
    }
    public String getCape() {
        return Cape;
    }
    private String name = "Dominion";
    public String getName() {
        return name;
    }
}
