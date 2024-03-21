public class Human extends LivingBeings implements EarthBeing, SkyBeing{
    @Override
    public void fly() {
        System.out.println("Normalmente, No puedo volar. Pero puedo saltar muy alto.");
    }

    @Override
    public void respawn() {
        System.out.println("No, no soy un gato. Sólo tengo una vida.");
    }

    @Override
    public void die() {
        System.out.println("Sí, y no me gusta mucho.");

    }

    @Override
    public void born() {
        System.out.println("He nacido");
    }

    @Override
    public void ChangeColor() {
        System.out.println("No soy Michael Jackson...");
    }

    @Override
    public void ChangeDimension() {
        System.out.println("¿Eh? No puedo hacer eso.");
    }

    @Override
    public void ShapeShift() {
        System.out.println("Desearía poder hacer eso.");
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

