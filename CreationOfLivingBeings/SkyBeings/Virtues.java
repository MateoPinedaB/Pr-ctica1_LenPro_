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
        System.out.println("Puedo cambiar de dimensión como todos los demás.");
    }

    @Override
    public void respawn() {
        System.out.println("Créelo o no, luché por este privilegio.");
    }

    @Override
    public void fly() {
        System.out.println("Vuelo con mis alas " + Alas() + ". Aunque soy bastante promedio en velocidad.");
    }

    @Override
    public void ShapeShift() {
        System.out.println("Puedo cambiar de forma en un Muro Beige...");
    }
    public String Jerarquia() {
        String Order ="Ángel de Nivel Medio de la Orden Media";
        return Order;
    }
    public int Alas() {
        int alas = 10;
        return alas;
    }
    private String Atribute = "Soy el más promedio de los promedios...";
    private String Proud = "Estoy muy orgulloso de mis alas, aunque no son las mejores...";
    //Getters and Setters
    public String getAtribute() {
        return Atribute;
    }
    public String getProud() {
        return Proud;
    }
    private String name = "Virtud";
    public String getName() {
        return name;
    }
}
