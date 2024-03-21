public class HolyHuman extends Human{
    @Override
    public void fly() {
        System.out.println("Puedo volar, aunque no tengo alas.");
    }
    public String Jerarquia() {
        String Order ="Cima de la Humanidad.";
        return Order;
    }
    private String Atribute = "Soy el más poderoso de los humanos.";
    private String  Loyalty = "Soy muy Leal al Todopoderoso.";
    private String Attack = "¡Santa Luz del Armagedón!";
    //Getters and Setters
    public String getAtribute() {
        return Atribute;
    }
    public void setAtribute(String Atribute) {
        this.Atribute = Atribute;
    }
    public String getLoyalty() {
        return Loyalty;
    }
    public String getAttack() {
        return Attack;
    }
    private String name = "Holy Human";
    public String getName() {
        return name;
    }
}
