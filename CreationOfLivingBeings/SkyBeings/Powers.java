public class Powers extends Angel{
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
        System.out.println("Puedo cambiar de dimensiones con esfuerzo.");
    }

    @Override
    public void respawn() {
        System.out.println("Respawn...");
    }

    @Override
    public void fly() {
    System.out.println("Puedo volar con mis alas " + Alas() + ".");
    }

    @Override
    public void ShapeShift() {
        System.out.println("Puedo cambiar de forma en un zorro.");
    }
    public String Jerarquia() {
        String Order ="Ángel de nivel bajo de orden medio";
        return Order;
    }
    public int Alas() {
        int alas = 8;
        return alas;
    }
    private int Arms = 4;
    private String Gender = "Hermafrodita.";
    //Getters and Setters
    public int getArms(){return Arms;}
    public String getGender(){return Gender;}
    private String name = "Poder";
    public String getName() {
        return name;
    }
}
