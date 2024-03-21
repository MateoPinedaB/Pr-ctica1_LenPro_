public class Demon extends Angel{
    @Override
    public void fly() {
        System.out.println("Puedo Volar con mis Alas de Murciélago");
    }
    
    @Override
    public void ChangeColor() {
        String[] color = {"Negro", "Carmesí", "Pálido"};
        int randomNumber = (int)(Math.random() * color.length);
        setColor(color[randomNumber]);
    }
    
    @Override
    public void ChangeDimension() {
        System.out.println("Puedo cambiar de dimensión, pero sólo a la Tierra.");
    }
    
    public void setColor(String color) {
        System.out.println("Mi color es: " + color);
    }
    
    @Override
    public void ShapeShift() {
        System.out.println("Puedo cambiar de forma.");
    }
    
    @Override
    public void grow() {
        System.out.println("Estoy creciendo");
    }
    
    @Override
    public void born() {
        System.out.println("He nacido");
    }
    
    @Override
    public void respawn() {
        System.out.println("He resucitado, es mi tormento...");
    }
    
    @Override
    public void die() {
        System.out.println("He muerto");
    }
    public String name(String nombre) {
        return nombre;
    }
    public int age(int edad) {
        return edad;
    }
    public int Alas(int cantidad) {
        return cantidad;
    }
    public String MagicEyes(){
        return "Tengo Ojos Mágicos.";
    }
    private String name = "Demon";
    public String getName() {
        return name;
    }
}
