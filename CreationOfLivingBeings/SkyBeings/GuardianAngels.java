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
        System.out.println("Puedo cambiar de dimensión con mucho esfuerzo.");
    }

    @Override
    public void fly() {
        System.out.println("Vuelo con mis alas " + Alas() + ".");
    }

    @Override
    public void ShapeShift() {
        System.out.println("Puedo cambiar de forma en un perro.");
    }
    public String Jerarquia() {
        String Order ="Ángel de nivel bajo en la jerarquía";
        return Order;
    }
    public int Alas() {
        int alas = 2;
        return alas;
    }
    private String Blade = "Tengo una espada";
    private String Shield = "Tengo un escudo";
    //Getters and Setters
    public String getBlade() {
        return Blade;
    }
    public String getShield() {
        return Shield;
    }
    private String name = "Ángel Guardián";
    public String getName() {
        return name;
    }
}
