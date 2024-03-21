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
        System.out.println("Puedo cambiar de dimensión fácilmente.");
    }
//------------------------------------------------------------------
    @Override
    public void respawn() {
        System.out.println("Mi Señor me ha resucitado.");
    }
//------------------------------------------------------------------
    @Override
    public void fly() {
        System.out.println("Vuelo con mis alas " + Alas() + ".");
    }
//------------------------------------------------------------------
    @Override
    public void ShapeShift() {
        System.out.println("Puedo cambiar de forma en un León Alado.");
    }
//------------------------------------------------------------------
    public String Jerarquia() {
        String Order ="Ángel de Nivel Medio de Orden Superior";
        return Order;
    }
//------------------------------------------------------------------
    public int Alas() {
        int alas = 12;
        return alas;
    }
//------------------------------------------------------------------
    private String Shield = "Tengo un Escudo";
//------------------------------------------------------------------
    private String Cape = "Tengo una Capa";
//Getters and Setters
    public String getShield() {
        return Shield;
    }
    public String getCape() {
        return Cape;
    }
    private String name = "Dominio";
    public String getName() {
        return name;
    }
}
