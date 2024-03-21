public class FallenHuman extends Human {
    @Override
    public void fly() {
        System.out.println("No puedo volar, pero puedo caer del cielo.");
    }
    
    @Override
    public void ChangeColor() {
        System.out.println("No puedo cambiar mi color, pero puedo cambiarme de ropa.");
    }
    
    @Override
    public void ChangeDimension() {
        System.out.println("No puedo cambiar mi dimensión, pero puedo cambiar mi perspectiva.");
    }
    
    @Override
    public void ShapeShift() {
        System.out.println("Puedo transformarme en un gato.");
    }
    
    @Override
    public void grow() {
        System.out.println("Estoy creciendo, pero no en el buen sentido.");
    }
    
    @Override
    public void born() {
        System.out.println("Nací, pero no estoy seguro de estar vivo.");
    }
    
    @Override
    public void respawn() {
        System.out.println("No puedo reaparecer, pero puedo intentarlo...");
    }
    
    @Override
    public void die() {
        System.out.println("Espero poder...");
    }
    private String MagicEyes ="Tengo 2 ojos, pero pueden ver el futuro...";
    private String Depression = "Siempre estoy triste...";
//Getters and Setters
    public String getMagicEyes() {
        return MagicEyes;
    }
    public void setMagicEyes(String MagicEyes) {
        this.MagicEyes = MagicEyes;
    }
    
    public String getDepression() {
        return Depression;
    }
    public void setDepression(String Depression) {
        this.Depression = Depression;
    }
    private String name = "Fallen Human";
    public String getName() {
        return name;
    }
}
