public class Imp extends Demon {
    @Override
    public void fly() {
        System.out.println("Puedo volar con mis alas de murciélago.");
    }
    @Override
    public void ChangeColor() {
        String[] color = {"Negro", "Carmesí", "Pálido"};
        int randomNumber = (int)(Math.random() * color.length);
        setColor(color[randomNumber]);};
    
        public void setColor(String color) {
            System.out.println("Mi color es: " + color);
        }

        public void ShapeShift() {
            System.out.println("No Puedo cambiar de forma...");
        }
        private String Eyes = "Tengo 92 Ojos de gato...";
    //Getters and Setters
    public String getEyes() {
        return Eyes;
    }
    private String name = "Imp";
    public String getName() {
        return name;
    }
}
