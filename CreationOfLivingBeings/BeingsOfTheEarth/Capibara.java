public class Capibara extends LivingBeings implements EarthBeing{
    @Override
    public void respawn() {
        System.out.println("No puedo renacer.");
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
    private String Status = "Soy el mejor animal.";
    private String Swim = "Estoy nadando.";
    // Getters y Setters
    public String getStatus() {
        return Status;
    }
    public void setStatus(String status) {
        Status = status;
    }
    
    public String getSwim() {
        return Swim;
    }
    private String name = "Capibara";
    public String getName() {
        return name;
    }
}
