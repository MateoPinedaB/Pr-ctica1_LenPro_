import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Do you want to start creating? (Y/N)");
        String respuesta = teclado.nextLine();
        
        if (respuesta.equalsIgnoreCase("Y")) {
            System.out.println("Let's start creating.");
        } else if (respuesta.equalsIgnoreCase("N")) {
            System.out.println("I guess we are done here.");
            System.exit(0);
        }
        
        LivingBeingCreator creator = new LivingBeingCreator();
        System.out.println("The creator has been born.");
        creator.OptionsToCreate();
        
        int respuesta2;
        do {
            System.out.println("Choose an option (1-20):");
            while (!teclado.hasNextInt()) {
                System.out.println("Invalid option, please try again.");
                teclado.next(); // Consumir la entrada no válida
            }
            respuesta2 = teclado.nextInt();
            teclado.nextLine(); // Consumir la nueva línea después de leer el entero
            
            if (respuesta2 == 1) {
                System.out.println("Enter the name of the Human:");
                String name = teclado.nextLine();
                Human human = new Human();
                creator.CreateHuman();
                System.out.print(name + ": "); human.born();
                System.out.print("Can you die? ");
                System.out.print(name + ": ");human.die();
                System.out.print("Can you Resurrect? ");System.out.print(name + ": "); human.respawn();
                System.out.print("Can you fly? ");System.out.print(name + ": "); human.fly();
                System.out.print("Can you Change Color? ");System.out.print(name + ": ");human.ChangeColor();
                System.out.print("Can you Change Dimension? ");System.out.print(name + ": ");human.ChangeDimension();
                System.out.print("Can you ShapeShift? ");System.out.print(name + ": ");human.ShapeShift();
            } else if (respuesta2 == 2) {
                Dog dog = new Dog();
                creator.CreateDog();
                System.out.print((dog.getName())+ ": ");dog.born();
                System.out.print("Can you die?");
                System.out.print((dog.getName())+ ": ");dog.die();
                System.out.print("Can you grow?");
                System.out.print((dog.getName())+ ": ");dog.grow();
                System.out.print("Can you reproduce?");
                System.out.print((dog.getName())+ ": ");dog.reproduce();
                System.out.print("Can you Resurrect?");
                System.out.print((dog.getName())+ ": ");dog.respawn();
            } else if (respuesta2 == 3) {
                Cat cat = new Cat();
                creator.CreateCat();
                System.out.print((cat.getName())+ ": ");cat.born();
                System.out.print("Can you die?");
                System.out.print((cat.getName())+ ": ");cat.die();
                System.out.print("Can you grow?");
                System.out.print((cat.getName())+ ": ");cat.grow();
                System.out.print("Can you reproduce?");
                System.out.print((cat.getName())+ ": ");cat.reproduce();
                System.out.print("Can you Resurrect?");
                System.out.print((cat.getName())+ ": ");cat.respawn();
                System.out.print("How many lives do you have?");
                System.out.print((cat.getName())+ ": ");System.out.println(cat.getLives());
                System.out.print("Can you Meow?");
                System.out.print((cat.getName())+ ": ");System.out.println(cat.getMeowing());
            } else if (respuesta2 == 4) {
                Capibara capibara = new Capibara();
                creator.CreateCapibara();
                System.out.print((capibara.getName())+ ": ");capibara.born();
                System.out.print("Can you die?");
                System.out.print((capibara.getName())+ ": ");capibara.die();
                System.out.print("Can you grow?");System.out.print((capibara.getName())+ ": ");capibara.grow();
                System.out.print("Can you reproduce?");System.out.print((capibara.getName())+ ": ");capibara.reproduce();
                System.out.print("Can you Resurrect?");System.out.print((capibara.getName())+ ": ");capibara.respawn();
                System.out.print("Is it true that you are the best animal?");System.out.print((capibara.getName())+ ": ");System.out.println(capibara.getStatus());
                System.out.print("Can you swim?");System.out.print((capibara.getName())+ ": ");System.out.println(capibara.getSwim());
            } else if (respuesta2 == 5) {
                Bear bear = new Bear();
                creator.CreateBear();
                System.out.print((bear.getName())+ ": ");bear.born();
                System.out.print("Can you die?");
                System.out.print((bear.getName())+ ": ");bear.die();
                System.out.print("Can you grow?");
                System.out.print((bear.getName())+ ": ");bear.grow();
                System.out.print("Can you reproduce?");
                System.out.print((bear.getName())+ ": ");bear.reproduce();
                System.out.print("Can you Resurrect?");
                System.out.print((bear.getName())+ ": ");bear.respawn();
                System.out.print("What is the color of your fur?");
                System.out.print((bear.getName())+ ": ");System.out.println(bear.getFurColor());
            } else if (respuesta2 == 6) {
                FallenHuman fallenHuman = new FallenHuman();
                creator.CreateFallenHuman();
                System.out.print((fallenHuman.getName())+ ": ");fallenHuman.born();
                System.out.print("Can you die?");
                System.out.print((fallenHuman.getName())+ ": ");fallenHuman.die();
                System.out.print("Can you Resurrect?");
                System.out.print((fallenHuman.getName())+ ": ");fallenHuman.respawn();
                System.out.print("Can you fly?");
                System.out.print((fallenHuman.getName())+ ": ");fallenHuman.fly();
                System.out.print("Can you Change Color?");
                System.out.print((fallenHuman.getName())+ ": ");fallenHuman.ChangeColor();
                System.out.print("Can you Change Dimension?");
                System.out.print((fallenHuman.getName())+ ": ");fallenHuman.ChangeDimension();
                System.out.print("Can you ShapeShift?");
                System.out.print((fallenHuman.getName())+ ": ");fallenHuman.ShapeShift();
                System.out.print("How many Magic Eyes do you have?");
                System.out.print((fallenHuman.getName())+ ": ");System.out.println(fallenHuman.getMagicEyes());
            } else if (respuesta2 == 7) {
                HolyHuman holyHuman = new HolyHuman();
                creator.CreateHolyHuman();
                System.out.println((holyHuman.getName())+ " was born");
                System.out.println("Can you die?");
                System.out.println((holyHuman.getName())+ ": ");holyHuman.die();
                System.out.println("Can you Resurrect?");
                System.out.println((holyHuman.getName())+ ": ");holyHuman.respawn();
                System.out.println("How can you fly?");
                System.out.println((holyHuman.getName())+ ": ");holyHuman.fly();
                System.out.println("What is your Jerarquia?");
                System.out.println((holyHuman.getName())+ ": ");System.out.println(holyHuman.Jerarquia());
                System.out.println("What is your Atribute?");
                System.out.println((holyHuman.getName())+ ": ");System.out.println(holyHuman.getAtribute());
                System.out.println("What is your Loyalty?");
                System.out.println((holyHuman.getName())+ ": ");System.out.println(holyHuman.getLoyalty());
                System.out.println("What is your Attack?");
                System.out.println((holyHuman.getName())+ ": ");System.out.println(holyHuman.getAttack());
            } else if (respuesta2 == 8) {
                GuardianAngels guardianAngel = new GuardianAngels();
                creator.CreateGuardianAngel();
                System.out.println("I am a " + guardianAngel.getName());
                System.out.println("Can you die?");
                System.out.println(guardianAngel.getName() + ": ");guardianAngel.die();
                System.out.println("Can you Resurrect?");
                System.out.println(guardianAngel.getName() + ": ");guardianAngel.respawn();
                System.out.println("How can you fly?");
                System.out.println("I fly with my "+ guardianAngel.Alas()+" Wings.");
                System.out.println("What is your Jerarquia?");
                System.out.println(guardianAngel.getName() + ": ");System.out.println(guardianAngel.Jerarquia());
                System.out.println("Can you Change Color?");System.out.println(guardianAngel.getName() + ": ");guardianAngel.ChangeColor();
                System.out.println("Can you Change Dimension?");System.out.println(guardianAngel.getName() + ": ");guardianAngel.ChangeDimension();
                System.out.println("Can you ShapeShift?");System.out.println(guardianAngel.getName() + ": ");guardianAngel.ShapeShift();
                System.out.println("What is your Blade?");System.out.println(guardianAngel.getName() + ": ");System.out.println(guardianAngel.getBlade());
                System.out.println("What is your Shield?");System.out.println(guardianAngel.getName() + ": ");System.out.println(guardianAngel.getShield());
            } else if (respuesta2 == 9) {
                Archangels archangel = new Archangels();
                creator.CreateArchangel();
                System.out.println("I am a " + archangel.getName());
                System.out.println("Can you die?");
                System.out.println(archangel.getName() + ": ");archangel.die();
                System.out.println("Can you Resurrect?");
                System.out.println(archangel.getName() + ": ");archangel.respawn();
                System.out.println("How can you fly?");
                System.out.println(archangel.getName());
                System.out.println("I fly with my "+ archangel.Alas()+" Wings.");
                System.out.println("What is your Jerarquia?");System.out.println(archangel.getName()); System.out.println(archangel.Jerarquia());
                System.out.println("Can you Change Color?");System.out.println(archangel.getName() + ": ");archangel.ChangeColor();
                System.out.println("Can you Change Dimension?");System.out.println(archangel.getName() + ": ");archangel.ChangeDimension();
                System.out.println("What is your Spear?");System.out.println(archangel.getName() + ": ");System.out.println(archangel.getSpear());
                System.out.println("What is your Blade?");System.out.println(archangel.getName() + ": ");System.out.println(archangel.getBlade());
            } else if (respuesta2 == 10) {
                Thrones thrones = new Thrones();
                creator.CreateThrone();
                System.out.println("This throne belongs to " + thrones.getName());
                System.out.println("Can you die?");
                System.out.println(thrones.getName() + ": ");thrones.die();
                System.out.println("Can you Resurrect?");
                System.out.println(thrones.getName() + ": ");thrones.respawn();
                System.out.println("How can you fly?");
                System.out.println(thrones.getName() + ": ");thrones.fly();
                System.out.println("What is your Jerarquia?");
                System.out.println(thrones.getName() + ": ");System.out.println(thrones.Jerarquia());
                System.out.println("Can you Change Color?");
                System.out.println(thrones.getName() + ": ");thrones.ChangeColor();
                System.out.println("Can you Change Dimension?");
                System.out.println(thrones.getName() + ": ");thrones.ChangeDimension();
                System.out.println("Can you ShapeShift?");thrones.ShapeShift();
            } else if (respuesta2 == 11) {
                Dominions dominions = new Dominions();
                creator.CreateDominion();
                System.out.println("This dominion belongs to " + dominions.getName());
                System.out.println("Can you die?");
                System.out.println(dominions.getName() + ": ");dominions.die();
                System.out.println("Can you Resurrect?");
                System.out.println(dominions.getName() + ": ");dominions.respawn();
                System.out.println("How can you fly?");
                System.out.println(dominions.getName() + ": ");dominions.fly();
                System.out.println("What is your Jerarquia?");
                System.out.println(dominions.getName() + ": ");System.out.println(dominions.Jerarquia());
                System.out.println("Can you Change Color?");
                System.out.println(dominions.getName() + ": ");dominions.ChangeColor();
                System.out.println("Can you Change Dimension?");
                System.out.println(dominions.getName() + ": ");dominions.ChangeDimension();
                System.out.println("Can you ShapeShift?");
                System.out.println(dominions.getName() + ": ");dominions.ShapeShift();
            } else if (respuesta2 == 12) {
                Virtues virtues = new Virtues();
                creator.CreateVirtues();
                System.out.println("This virtue belongs to " + virtues.getName());
                System.out.println("Can you die?");
                System.out.println(virtues.getName() + ": ");virtues.die();
                System.out.println("Can you Resurrect?");
                System.out.println(virtues.getName() + ": ");virtues.respawn();
                System.out.println("How can you fly?");
                System.out.println(virtues.getName() + ": ");virtues.fly();
                System.out.println("What is your Jerarquia?");
                System.out.println(virtues.getName() + ": ");System.out.println(virtues.Jerarquia());
                System.out.println("Can you Change Color?");
                System.out.println(virtues.getName() + ": ");virtues.ChangeColor();
                System.out.println("Can you Change Dimension?");
                System.out.println(virtues.getName() + ": ");virtues.ChangeDimension();
                System.out.println("Can you ShapeShift?");
                System.out.println(virtues.getName() + ": ");virtues.ShapeShift();
            } else if (respuesta2 == 13) {
                Powers powers = new Powers();
                creator.CreatePowers();
                System.out.println("This power belongs to " + powers.getName());
                System.out.println("Can you die?");
                System.out.println(powers.getName() + ": ");powers.die();
                System.out.println("Can you Resurrect?");
                System.out.println(powers.getName() + ": ");powers.respawn();
                System.out.println("How can you fly?");
                System.out.println(powers.getName() + ": ");powers.fly();
                System.out.println("What is your Jerarquia?");
                System.out.println(powers.getName() + ": ");System.out.println(powers.Jerarquia());
                System.out.println("Can you Change Color?");
                System.out.println(powers.getName() + ": ");powers.ChangeColor();
                System.out.println("Can you Change Dimension?");
                System.out.println(powers.getName() + ": ");powers.ChangeDimension();
                System.out.println("Can you ShapeShift?");
                System.out.println(powers.getName() + ": ");powers.ShapeShift();
            } else if (respuesta2 == 14) {
                Principalities principalities = new Principalities();
                creator.CreatePrincipalities();
                System.out.println("This principality belongs to " + principalities.getName());
                System.out.println("Can you die?");
                System.out.println(principalities.getName() + ": ");principalities.die();
                System.out.println("Can you Resurrect?");System.out.println(principalities.getName() + ": ");principalities.respawn();
                System.out.println("How can you fly?");System.out.println(principalities.getName() + ": ");principalities.fly();
                System.out.println("What is your Jerarquia?");System.out.println(principalities.getName() + ": ");System.out.println(principalities.Jerarquia());
                System.out.println("Can you Change Color?");System.out.println(principalities.getName() + ": ");principalities.ChangeColor();
                System.out.println("Can you Change Dimension?");System.out.println(principalities.getName() + ": ");principalities.ChangeDimension();
                System.out.println("Can you ShapeShift?");System.out.println(principalities.getName() + ": ");principalities.ShapeShift();
                System.out.println("How many legs do you have?");System.out.println(principalities.getName() + ": ");System.out.println(principalities.getLegs());
            } else if (respuesta2 == 15) {
                Seraphim seraphim = new Seraphim();
                creator.CreateSeraphim();
                System.out.println("This seraphim belongs to " + seraphim.getName());
                System.out.println("Can you die?");
                System.out.println(seraphim.getName() + ": ");seraphim.die();
                System.out.println("Can you Resurrect?");
                System.out.println(seraphim.getName() + ": ");seraphim.respawn();
                System.out.println("How can you fly?");
                System.out.println(seraphim.getName() + ": ");seraphim.fly();
                System.out.println("What is your Jerarquia?");
                System.out.println(seraphim.getName() + ": ");System.out.println(seraphim.Jerarquia());
                System.out.println("Can you Change Color?");
                System.out.println(seraphim.getName() + ": ");seraphim.ChangeColor();
                System.out.println("Can you Change Dimension?");
                System.out.println(seraphim.getName() + ": ");seraphim.ChangeDimension();
                System.out.println("Can you ShapeShift?");
                System.out.println(seraphim.getName() + ": ");seraphim.ShapeShift();
                System.out.println("How many wings do you have?");
                System.out.println(seraphim.getName() + ": ");seraphim.Alas();
                System.out.println("How high is your pride?");
                System.out.println(seraphim.getName() + ": ");seraphim.getArrogance();
                System.out.println("How close are you from the creator?");System.out.println(seraphim.getName() + ": ");seraphim.getDistanceTillGod();
            } else if (respuesta2 == 16) {
                Cherubim cherubim = new Cherubim();
                creator.CreateCherubim();
                System.out.println("This cherubim belongs to " + cherubim.getName());
                System.out.println("Can you die?");
                System.out.println(cherubim.getName() + ": ");cherubim.die();
                System.out.println("Can you Resurrect?");
                System.out.println(cherubim.getName() + ": ");cherubim.respawn();
                System.out.println("How can you fly?");
                System.out.println(cherubim.getName() + ": ");cherubim.fly();
                System.out.println("What is your Jerarquia?");
                System.out.println(cherubim.getName() + ": ");System.out.println(cherubim.Jerarquia());
                System.out.println("Can you Change Color?");
                System.out.println(cherubim.getName() + ": ");cherubim.ChangeColor();
                System.out.println("Can you Change Dimension?");
                System.out.println(cherubim.getName() + ": ");cherubim.ChangeDimension();
                System.out.println("Can you ShapeShift?");
                System.out.println(cherubim.getName() + ": ");cherubim.ShapeShift();
                System.out.println("How many wings do you have?");
                System.out.println(cherubim.getName() + ": ");cherubim.Alas();
            } else if (respuesta2 == 17) {
                Demon demon = new Demon();
                creator.CreateDemon();
                System.out.println("This demon belongs to " + demon.getName());
                System.out.println("Can you die?");
                System.out.println(demon.getName() + ": ");demon.die();
                System.out.println("Can you Resurrect?");
                System.out.println(demon.getName() + ": ");demon.respawn();
                System.out.println("How can you fly?");
                System.out.println(demon.getName() + ": ");demon.fly();
                System.out.println("How much Magic Eyes do you have?");
                System.out.println(demon.getName() + ": ");System.out.println(demon.MagicEyes());
                System.out.println("Can you Change Color?");
                System.out.println(demon.getName() + ": ");demon.ChangeColor();
                System.out.println("Can you Change Dimension?");
                System.out.println(demon.getName() + ": ");demon.ChangeDimension();
                System.out.println("Can you ShapeShift?");
                System.out.println(demon.getName() + ": ");demon.ShapeShift();

            } else if (respuesta2 == 18) {
                Imp imp = new Imp();
                creator.CreateImp();
                System.out.println("This imp belongs to " + imp.getName());
                System.out.println("Can you die?");
                System.out.println(imp.getName() + ": ");imp.die();
                System.out.println("Can you Resurrect?");
                System.out.println(imp.getName() + ": ");imp.respawn();
                System.out.println("How can you fly?");
                System.out.println(imp.getName() + ": ");imp.fly();
                System.out.println("Can you Change Color?");
                System.out.println(imp.getName() + ": ");imp.ChangeColor();
                System.out.println("Can you Change Dimension?");
                System.out.println(imp.getName() + ": ");imp.ChangeDimension();
                System.out.println("Can you ShapeShift?");
                System.out.println(imp.getName() + ": ");imp.ShapeShift();
                System.out.println("How many Magic Eyes do you have?");
                System.out.println(imp.getName() + ": ");System.out.println(imp.MagicEyes());
            } else if (respuesta2 == 19) {
                System.out.print("Creator: ");
                creator.born();
                creator.ChangeColor();
                creator.ChangeDimension();
                creator.ShapeShift();
                creator.die();
                creator.fly();
                creator.grow();
                creator.respawn();
            } else if (respuesta2 == 20) {
                System.out.println("I guess we are done here.");
                System.exit(0);
            } else {
                System.out.println("Please select a valid option. Try again:");
            }
        } while (respuesta2 >= 1 && respuesta2 <= 20);
        
        teclado.close(); // Cerrar Scanner al finalizar
    }
}