public class HolyHuman extends Human{
    @Override
    public void fly() {
        System.out.println("I can fly, although i don't have wings.");
    }
    public String Jerarquia() {
        String Order ="Top of Humanity.";
        return Order;
    }
    private String Atribute = "I am the most powerful of the Humans.";
    private String  Loyalty = "I am very Loyal to the One Almighty.";
    private String Attack = "Holy Light of Armaggedon!";
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
