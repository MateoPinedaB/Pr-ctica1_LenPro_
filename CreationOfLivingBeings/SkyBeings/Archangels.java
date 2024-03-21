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
        System.out.println("Puedo cambiar de dimensión con cierta dificultad.");
    }

    @Override
    public void fly() {
        System.out.println("Vuelo con mis alas " + Alas() + ".");
    }

    @Override
    public void ShapeShift() {
        System.out.println("Puedo cambiar de forma en un gato.");
    }
    public String Jerarquia() {
        String Order ="Ángel de nivel medio de menor orden";
        return Order;
    }
    public int Alas() {
        int alas = 4;
        return alas;
    }
    private String Spear = "Tengo una lanza";
    private String Blade = "Tengo una espada";
    //Getters and Setters
    public String getSpear() {
        return Spear;
    }
    public String getBlade() {
        return Blade;
    }
    private String name = "Ángel Guardián";
    public String getName() {
        return name;
    }
}
