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
        System.out.println("Puedo cambiar de dimensión como respirar.");
    }

    @Override
    public void respawn() {
        System.out.println("Mientras exista el Cielo, yo existiré. Soy un ser inmortal");
    }

    @Override
    public void fly() {
        System.out.println("Vuelo con mis alas de " + Alas() + " plumas.");
    }

    @Override
    public void ShapeShift() {
        System.out.println("Puedo cambiar de forma en una Anaconda de Tres Caras.");
    }
    public String Jerarquia() {
        String Order ="Ángel de Alto Rango de Nivel Medio";
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
