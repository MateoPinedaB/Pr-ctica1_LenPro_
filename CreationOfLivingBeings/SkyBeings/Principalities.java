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
        System.out.println("Puedo cambiar de dimensión normalmente.");
    }

    @Override
    public void respawn() {
        System.out.println("¿Estoy siendo resucitado?!");
    }

    @Override
    public void fly() {
        System.out.println("Estoy volando con mis alas " + Alas() + ".");
    }

    @Override
    public void ShapeShift() {
        System.out.println("Puedo cambiar de forma en un Tigre de Fuego.");
    }
    public String Jerarquia() {
        String Order ="Ángel de nivel alto de orden más bajo";
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
    private String name = "Principado";
    public String getName() {
        return name;
    }
}
