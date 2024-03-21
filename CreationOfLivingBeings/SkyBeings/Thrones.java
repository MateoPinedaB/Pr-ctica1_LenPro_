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
        System.out.println("Puedo cambiar de dimensiones sin problema.");
    }

    @Override
    public void respawn() {
        System.out.println("En mi nivel, la muerte es en su mayoría irrelevante.");
    }

    @Override
    public void fly() {
        System.out.println("Vuelo con mis alas " + Alas() + ".");
    }

    @Override
    public void ShapeShift() {
        System.out.println("Puedo cambiar de forma a un camello.");
    }
    public String Jerarquia() {
        String Order ="Ángel de alto nivel de la jerarquía";
        return Order;
    }
    public int Alas() {
        int alas = 14;
        return alas;
    }
    private String Body = "Soy principalmente de mármol.";
    private String  Tail = "Tengo una cola larga y hermosa.";
    //Getters and Setters
    public String getBody() {
        return Body;
    }
    public String getTail() {
        return Tail;
    }
    private String name = "Trono";
    public String getName() {
        return name;
    }
}
