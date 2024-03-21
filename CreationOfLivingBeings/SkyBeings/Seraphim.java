public class Seraphim extends Angel{
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
        System.out.println("¿Necesitas hacer un esfuerzo para eso?");
    }

    @Override
    public void fly() {
        System.out.println("Vuelo con mis alas " + Alas() + ".");
    }

    @Override
    public void ShapeShift() {
        System.out.println("Como serafín, no tengo la capacidad de cambiar de forma. Y no lo necesito.");
    }

    @Override
    public void respawn() {
        System.out.println("La muerte es un concepto mortal, solo estaba durmiendo.");
    }
    public String Jerarquia() {
        String Order ="Ángel de alto nivel de la orden más alta";
        return Order;
    }
    public int Alas() {
        int alas = 18;
        return alas;
    }
    private String Power= "¿Es eso incluso cuantificable?";
    private String Arrogance = "No soy arrogante, simplemente soy mejor que tú.";
    private String DistanceTillGod = "Soy el más cercano a Dios, soy su mano derecha.";
    //Getters and Setters
    public String getPower() {
        return Power;
    }
    public String getArrogance() {
        return Arrogance;
    }
    public String getDistanceTillGod() {
        return DistanceTillGod;
    }
    private String name = "Seraphim";
    public String getName() {
        return name;
    }
}
