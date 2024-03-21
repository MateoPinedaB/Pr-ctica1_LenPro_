public class Angel extends LivingBeings implements SkyBeing, EarthBeing {
    @Override
    public void fly() {
        System.out.println("Puedo Volar con mis Alas");
    }
    
    @Override
    public void ChangeColor() {
        String[] color = {"Blanco", "Dorado", "Plateado"};
        int randomNumber = (int)(Math.random() * color.length);
        setColor(color[randomNumber]);
    }
    
    @Override
    public void ChangeDimension() {
        System.out.println("Puedo cambiar de dimension");
    }
    
    public void setColor(String color) {
        System.out.println("Mi color es: " + color);
    }
    
    @Override
    public void ShapeShift() {
        System.out.println("Puedo cambiar de forma");
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
        System.out.println("He resucitado");
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
}
