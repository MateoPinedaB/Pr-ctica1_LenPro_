public class Bear extends LivingBeings implements EarthBeing{
    @Override
    public void respawn() {
        System.out.println("No puedo reaparecer.");
    }
    @Override
    public void die() {
        System.out.println("Puedo morir.");
    }
    @Override
    public void born() {
        System.out.println("Nací.");
    }
    @Override
    public void grow() {
        System.out.println("Estoy creciendo.");
    }
    @Override
    public void reproduce() {
        System.out.println("Puedo reproducirme.");
    }
    private String furColor = "Tengo pelaje marrón.";
    private String roar = "Estoy rugiendo.";
    // Getters and Setters
    public String getFurColor() {
        return furColor;
    }
    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }
    
    public String getRoar() {
        return roar;
    }
    private String name = "Oso";
    public String getName() {
        return name;
    }
}
