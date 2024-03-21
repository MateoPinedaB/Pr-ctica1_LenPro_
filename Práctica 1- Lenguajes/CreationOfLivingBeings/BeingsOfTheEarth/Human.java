public class Human extends LivingBeings implements EarthBeing, SkyBeing{
    @Override
    public void fly() {
        System.out.println("Normally, I can't fly. But I can jump really high.");
    }

    @Override
    public void respawn() {
        System.out.println("Nop, I'm not a cat. I only have one life.");
    }

    @Override
    public void die() {
        System.out.println("Yeah, and i am not very fond of it.");
    }

    @Override
    public void born() {
        System.out.println("I was born.");
    }

    @Override
    public void ChangeColor() {
        System.out.println("I am not Michael Jackson...");
    }

    @Override
    public void ChangeDimension() {
        System.out.println("Huh? I can't do that.");
    }

    @Override
    public void ShapeShift() {
        System.out.println("I wish...");
    }
    public String name(String Nombre){
        return Nombre;
    }
    public String gender(String Genero){
        return Genero;
    }
    public int age(int Edad){
        return Edad;
    }
}

