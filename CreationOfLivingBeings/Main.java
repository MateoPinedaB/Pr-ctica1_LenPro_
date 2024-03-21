import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("¿Quieres empezar a crear? (S/N)");
        String respuesta = teclado.nextLine();
        
        if (respuesta.equals("S")) {
            System.out.println("Vamos a empezar a crear.");
        } else if (respuesta.equals("N")) {
            System.out.println("Supongo que hemos terminado aquí.");
            System.exit(0);
        }

        LivingBeingCreator creator = new LivingBeingCreator();
        System.out.println("El creador ha nacido.");
        creator.OptionsToCreate();
        int respuesta2;
        do {
            System.out.println("Elige una opción (1-20):");
            while (!teclado.hasNextInt()) {
                System.out.println("Opción inválida, por favor intenta de nuevo.");
                teclado.next(); // Consumir la entrada no válida
            }
            respuesta2 = teclado.nextInt();
            teclado.nextLine(); // Consumir la nueva línea después de leer el entero
            
            if (respuesta2 == 1) {
                System.out.println("Ingresa el nombre del Humano:");
                String name = teclado.nextLine();
                Human human = new Human();
                System.out.print(name + ": "); human.born();
                System.out.print("¿Puedes morir? ");
                System.out.print("¿Puedes resucitar? ");System.out.print(name + ": "); human.respawn();
                System.out.print("¿Puedes volar? ");System.out.print(name + ": "); human.fly();
                System.out.print("¿Puedes cambiar de color? ");System.out.print(name + ": ");human.ChangeColor();
                System.out.print("¿Puedes cambiar de dimensión? ");System.out.print(name + ": ");human.ChangeDimension();
                System.out.print("¿Puedes cambiar de forma? ");System.out.print(name + ": ");human.ShapeShift();
                System.out.print(name + ": ");human.die();
            } else if (respuesta2 == 2) {
                Dog dog = new Dog();
                creator.CreateDog();
                System.out.print((dog.getName())+ ": ");dog.born();
                System.out.print("¿Puedes morir?");
                System.out.print((dog.getName())+ ": ");dog.die();
                System.out.print("¿Puedes crecer?");
                System.out.print((dog.getName())+ ": ");dog.grow();
                System.out.print("¿Puedes reproducirte?");
                System.out.print((dog.getName())+ ": ");dog.reproduce();
                System.out.print("¿Puedes resucitar?");
                System.out.print((dog.getName())+ ": ");dog.respawn();
            } else if (respuesta2 == 3) {
                Cat cat = new Cat();
                creator.CreateCat();
                System.out.print((cat.getName())+ ": ");cat.born();
                System.out.print("¿Puedes morir?");
                System.out.print((cat.getName())+ ": ");cat.die();
                System.out.print("¿Puedes crecer?");
                System.out.print((cat.getName())+ ": ");cat.grow();
                System.out.print("¿Puedes reproducirte?");
                System.out.print((cat.getName())+ ": ");cat.reproduce();
                System.out.print("¿Puedes resucitar?");
                System.out.print((cat.getName())+ ": ");cat.respawn();
                System.out.print("¿Cuántas vidas tienes?");
                System.out.print((cat.getName())+ ": ");System.out.println(cat.getLives());
                System.out.print("¿Puedes maullar?");
                System.out.print((cat.getName())+ ": ");System.out.println(cat.getMeowing());
            } else if (respuesta2 == 4) {
                Capibara capibara = new Capibara();
                creator.CreateCapibara();
                System.out.print((capibara.getName())+ ": ");capibara.born();
                System.out.print("¿Puedes morir?");
                System.out.print((capibara.getName())+ ": ");capibara.die();
                System.out.print("¿Puedes crecer?");System.out.print((capibara.getName())+ ": ");capibara.grow();
                System.out.print("¿Puedes reproducirte?");System.out.print((capibara.getName())+ ": ");capibara.reproduce();
                System.out.print("¿Puedes resucitar?");System.out.print((capibara.getName())+ ": ");capibara.respawn();
                System.out.print("¿Es cierto que eres el mejor animal?");System.out.print((capibara.getName())+ ": ");System.out.println(capibara.getStatus());
                                System.out.print("¿Puedes nadar?");System.out.print((capibara.getName())+ ": ");System.out.println(capibara.getSwim());
                            } else if (respuesta2 == 5) {
                                Bear bear = new Bear();
                                creator.CreateBear();
                                System.out.print((bear.getName())+ ": ");bear.born();
                                System.out.print("¿Puedes morir?");
                                System.out.print((bear.getName())+ ": ");bear.die();
                                System.out.print("¿Puedes crecer?");
                                System.out.print((bear.getName())+ ": ");bear.grow();
                                System.out.print("¿Puedes reproducirte?");
                                System.out.print((bear.getName())+ ": ");bear.reproduce();
                                System.out.print("¿Puedes resucitar?");
                                System.out.print((bear.getName())+ ": ");bear.respawn();
                                System.out.print("¿Cuál es el color de tu pelaje?");
                                System.out.print((bear.getName())+ ": ");System.out.println(bear.getFurColor());
                            } else if (respuesta2 == 6) {
                                FallenHuman fallenHuman = new FallenHuman();
                                creator.CreateFallenHuman();
                                System.out.print((fallenHuman.getName())+ ": ");fallenHuman.born();
                                System.out.print("¿Puedes morir?");
                                System.out.print((fallenHuman.getName())+ ": ");fallenHuman.die();
                                System.out.print("¿Puedes resucitar?");
                                System.out.print((fallenHuman.getName())+ ": ");fallenHuman.respawn();
                                System.out.print("¿Puedes volar?");
                                System.out.print((fallenHuman.getName())+ ": ");fallenHuman.fly();
                                System.out.print("¿Puedes cambiar de color?");
                                System.out.print((fallenHuman.getName())+ ": ");fallenHuman.ChangeColor();
                                System.out.print("¿Puedes cambiar de dimensión?");
                                System.out.print((fallenHuman.getName())+ ": ");fallenHuman.ChangeDimension();
                                System.out.print("¿Puedes cambiar de forma?");
                                System.out.print((fallenHuman.getName())+ ": ");fallenHuman.ShapeShift();
                                System.out.print("¿Cuántos ojos mágicos tienes?");
                                System.out.print((fallenHuman.getName())+ ": ");System.out.println(fallenHuman.getMagicEyes());
                            } else if (respuesta2 == 7) {
                                HolyHuman holyHuman = new HolyHuman();
                                creator.CreateHolyHuman();
                                System.out.println((holyHuman.getName())+ " nació");
                                System.out.println("¿Puedes morir?");
                                System.out.println((holyHuman.getName())+ ": ");holyHuman.die();
                                System.out.println("¿Puedes resucitar?");
                                System.out.println((holyHuman.getName())+ ": ");holyHuman.respawn();
                                System.out.println("¿Cómo puedes volar?");
                                System.out.println((holyHuman.getName())+ ": ");holyHuman.fly();
                                System.out.println("¿Cuál es tu jerarquía?");
                                System.out.println((holyHuman.getName())+ ": ");System.out.println(holyHuman.Jerarquia());
                                System.out.println("¿Cuál es tu atributo?");
                                System.out.println((holyHuman.getName())+ ": ");System.out.println(holyHuman.getAtribute());
                                System.out.println("¿Cuál es tu lealtad?");
                                System.out.println((holyHuman.getName())+ ": ");System.out.println(holyHuman.getLoyalty());
                                System.out.println("¿Cuál es tu ataque?");
                                System.out.println((holyHuman.getName())+ ": ");System.out.println(holyHuman.getAttack());
                            } else if (respuesta2 == 8) {
                                GuardianAngels guardianAngel = new GuardianAngels();
                                creator.CreateGuardianAngel();
                                System.out.println("Soy un " + guardianAngel.getName());
                                System.out.println("¿Puedes morir?");
                                System.out.println(guardianAngel.getName() + ": ");guardianAngel.die();
                                System.out.println("¿Puedes resucitar?");
                                System.out.println(guardianAngel.getName() + ": ");guardianAngel.respawn();
                                System.out.println("¿Cómo puedes volar?");
                                System.out.println("Vuelo con mis alas de " + guardianAngel.Alas());
                                System.out.println("¿Cuál es tu jerarquía?");
                                System.out.println(guardianAngel.getName() + ": ");System.out.println(guardianAngel.Jerarquia());
                                System.out.println("¿Puedes cambiar de color?");System.out.println(guardianAngel.getName() + ": ");guardianAngel.ChangeColor();
                                System.out.println("¿Puedes cambiar de dimensión?");System.out.println(guardianAngel.getName() + ": ");guardianAngel.ChangeDimension();
                                System.out.println("¿Puedes cambiar de forma?");System.out.println(guardianAngel.getName() + ": ");guardianAngel.ShapeShift();
                                System.out.println("¿Cuál es tu espada?");System.out.println(guardianAngel.getName() + ": ");System.out.println(guardianAngel.getBlade());
                                System.out.println("¿Cuál es tu escudo?");System.out.println(guardianAngel.getName() + ": ");System.out.println(guardianAngel.getShield());
                            } else if (respuesta2 == 9) {
                                Archangels archangel = new Archangels();
                                creator.CreateArchangel();
                                System.out.println("Soy un " + archangel.getName());
                                System.out.println("¿Puedes morir?");
                                System.out.println(archangel.getName() + ": ");archangel.die();
                                System.out.println("¿Puedes resucitar?");
                                System.out.println(archangel.getName() + ": ");archangel.respawn();
                                System.out.println("¿Cómo puedes volar?");
                                System.out.println(archangel.getName());
                                System.out.println("Vuelo con mis alas de " + archangel.Alas());
                                System.out.println("¿Cuál es tu jerarquía?");System.out.println(archangel.getName()); System.out.println(archangel.Jerarquia());
                                System.out.println("¿Puedes cambiar de color?");System.out.println(archangel.getName() + ": ");archangel.ChangeColor();
                                System.out.println("¿Puedes cambiar de dimensión?");System.out.println(archangel.getName() + ": ");archangel.ChangeDimension();
                                System.out.println("¿Cuál es tu lanza?");System.out.println(archangel.getName() + ": ");System.out.println(archangel.getSpear());
                                System.out.println("¿Cuál es tu espada?");System.out.println(archangel.getName() + ": ");System.out.println(archangel.getBlade());
                            } else if (respuesta2 == 10) {
                                Thrones thrones = new Thrones();
                                creator.CreateThrone();
                                System.out.println("Este trono pertenece a " + thrones.getName());
                                System.out.println("¿Puedes morir?");
                                System.out.println(thrones.getName() + ": ");thrones.die();
                                System.out.println("¿Puedes resucitar?");
                                System.out.println(thrones.getName() + ": ");thrones.respawn();
                                System.out.println("¿Cómo puedes volar?");
                                System.out.println(thrones.getName() + ": ");thrones.fly();
                                System.out.println("¿Cuál es tu jerarquía?");
                                System.out.println(thrones.getName() + ": ");System.out.println(thrones.Jerarquia());
                                System.out.println("¿Puedes cambiar de color?");
                                System.out.println(thrones.getName() + ": ");thrones.ChangeColor();
                                System.out.println("¿Puedes cambiar de dimensión?");
                                System.out.println(thrones.getName() + ": ");thrones.ChangeDimension();
                                System.out.println("¿Puedes cambiar de forma?");thrones.ShapeShift();
                            } else if (respuesta2 == 11) {
                                Dominions dominions = new Dominions();
                                creator.CreateDominion();
                                System.out.println("Este dominio pertenece a " + dominions.getName());
                                System.out.println("¿Puedes morir?");
                                System.out.println(dominions.getName() + ": ");dominions.die();
                                System.out.println("¿Puedes resucitar?");
                                System.out.println(dominions.getName() + ": ");dominions.respawn();
                                System.out.println("¿Cómo puedes volar?");
                                System.out.println(dominions.getName() + ": ");dominions.fly();
                                System.out.println("¿Cuál es tu jerarquía?");
                                System.out.println(dominions.getName() + ": ");System.out.println(dominions.Jerarquia());
                                System.out.println("¿Puedes cambiar de color?");
                                System.out.println(dominions.getName() + ": ");dominions.ChangeColor();
                                System.out.println("¿Puedes cambiar de dimensión?");
                                System.out.println(dominions.getName() + ": ");dominions.ChangeDimension();
                                System.out.println("¿Puedes cambiar de forma?");
                                System.out.println(dominions.getName() + ": ");dominions.ShapeShift();
                            } else if (respuesta2 == 12) {
                                Virtues virtues = new Virtues();
                                creator.CreateVirtues();
                                System.out.println("Esta virtud pertenece a " + virtues.getName());
                                System.out.println("¿Puedes morir?");
                                System.out.println(virtues.getName() + ": ");virtues.die();
                                System.out.println("¿Puedes resucitar?");
                System.out.println(virtues.getName() + ": ");virtues.respawn();
                System.out.println("¿Cómo puedes volar?");
                                System.out.println(virtues.getName() + ": ");virtues.fly();
                                System.out.println("¿Cuál es tu jerarquía?");
                                System.out.println(virtues.getName() + ": ");System.out.println(virtues.Jerarquia());
                                System.out.println("¿Puedes cambiar de color?");
                                System.out.println(virtues.getName() + ": ");virtues.ChangeColor();
                                System.out.println("¿Puedes cambiar de dimensión?");
                                System.out.println(virtues.getName() + ": ");virtues.ChangeDimension();
                                System.out.println("¿Puedes cambiar de forma?");
                                System.out.println(virtues.getName() + ": ");virtues.ShapeShift();
                            } else if (respuesta2 == 13) {
                                Powers powers = new Powers();
                                creator.CreatePowers();
                                System.out.println("Este poder pertenece a " + powers.getName());
                                System.out.println("¿Puedes morir?");
                                System.out.println(powers.getName() + ": ");powers.die();
                                System.out.println("¿Puedes resucitar?");
                                System.out.println(powers.getName() + ": ");powers.respawn();
                                System.out.println("¿Cómo puedes volar?");
                                System.out.println(powers.getName() + ": ");powers.fly();
                                System.out.println("¿Cuál es tu jerarquía?");
                                System.out.println(powers.getName() + ": ");System.out.println(powers.Jerarquia());
                                System.out.println("¿Puedes cambiar de color?");
                                System.out.println(powers.getName() + ": ");powers.ChangeColor();
                                System.out.println("¿Puedes cambiar de dimensión?");
                                System.out.println(powers.getName() + ": ");powers.ChangeDimension();
                                System.out.println("¿Puedes cambiar de forma?");
                                System.out.println(powers.getName() + ": ");powers.ShapeShift();
                            } else if (respuesta2 == 14) {
                                                            Principalities principalities = new Principalities();
                                                            creator.CreatePrincipalities();
                                                            System.out.println("Esta principado pertenece a " + principalities.getName());
                                                            System.out.println("¿Puedes morir?");
                                                            System.out.println(principalities.getName() + ": ");principalities.die();
                                                            System.out.println("¿Puedes resucitar?");System.out.println(principalities.getName() + ": ");principalities.respawn();
                                                            System.out.println("¿Cómo puedes volar?");System.out.println(principalities.getName() + ": ");principalities.fly();
                                                            System.out.println("¿Cuál es tu jerarquía?");System.out.println(principalities.getName() + ": ");System.out.println(principalities.Jerarquia());
                                                            System.out.println("¿Puedes cambiar de color?");System.out.println(principalities.getName() + ": ");principalities.ChangeColor();
                                                            System.out.println("¿Puedes cambiar de dimensión?");System.out.println(principalities.getName() + ": ");principalities.ChangeDimension();
                                                            System.out.println("¿Puedes cambiar de forma?");System.out.println(principalities.getName() + ": ");principalities.ShapeShift();
                                                            System.out.println("¿Cuántas patas tienes?");System.out.println(principalities.getName() + ": ");System.out.println(principalities.getLegs());
                                                        } else if (respuesta2 == 15) {
                                                            Seraphim seraphim = new Seraphim();
                                                            creator.CreateSeraphim();
                                                            System.out.println("Este serafín pertenece a " + seraphim.getName());
                                                            System.out.println("¿Puedes morir?");
                                                            System.out.println(seraphim.getName() + ": ");seraphim.die();
                                                            System.out.println("¿Puedes resucitar?");
                                                            System.out.println(seraphim.getName() + ": ");seraphim.respawn();
                                                            System.out.println("¿Cómo puedes volar?");
                                                            System.out.println(seraphim.getName() + ": ");seraphim.fly();
                                                            System.out.println("¿Cuál es tu jerarquía?");
                                                            System.out.println(seraphim.getName() + ": ");
                                                            System.out.println(seraphim.Jerarquia());
                                                            System.out.println("¿Puedes cambiar de color?");
                                                            System.out.println(seraphim.getName() + ": ");
                                                            seraphim.ChangeColor();
                                                            System.out.println("¿Puedes cambiar de dimensión?");
                                                            System.out.println(seraphim.getName() + ": ");
                                                            seraphim.ChangeDimension();
                                                            System.out.println("¿Puedes cambiar de forma?");
                                                            System.out.println(seraphim.getName() + ": ");
                                                            seraphim.ShapeShift();
                                                            System.out.println("¿Cuántas alas tienes?");
                                                            System.out.println(seraphim.getName() + ": ");
                                                            seraphim.Alas();
                                                            System.out.println("¿Qué tan orgulloso eres?");
                                                            System.out.println(seraphim.getName() + ": ");
                                                            seraphim.getArrogance();
                                                            System.out.println("¿Qué tan cerca estás del creador?");
                                                            System.out.println(seraphim.getName() + ": ");
                                                            seraphim.getDistanceTillGod();
                                                            } else if (respuesta2 == 16) {
                                                            Cherubim cherubim = new Cherubim();
                                                            creator.CreateCherubim();
                                                            System.out.println("Este querubín pertenece a " + cherubim.getName());
                                                            System.out.println("¿Puedes morir?");
                                                            System.out.println(cherubim.getName() + ": ");
                                                            cherubim.die();
                                                            System.out.println("¿Puedes resucitar?");
                                                            System.out.println(cherubim.getName() + ": ");
                                                            cherubim.respawn();
                                                            System.out.println("¿Cómo puedes volar?");
                                                            System.out.println(cherubim.getName() + ": ");
                                                            cherubim.fly();
                                                            System.out.println("¿Cuál es tu jerarquía?");
                                                            System.out.println(cherubim.getName() + ": ");
                                                            System.out.println(cherubim.Jerarquia());
                                                            System.out.println("¿Puedes cambiar de color?");
                                                            System.out.println(cherubim.getName() + ": ");
                                                            cherubim.ChangeColor();
                                                            System.out.println("¿Puedes cambiar de dimensión?");
                                                            System.out.println(cherubim.getName() + ": ");
                                                            cherubim.ChangeDimension();
                                                            System.out.println("¿Puedes cambiar de forma?");
                                                            System.out.println(cherubim.getName() + ": ");
                                                            cherubim.ShapeShift();
                                                            System.out.println("¿Cuántas alas tienes?");
                                                            System.out.println(cherubim.getName() + ": ");
                                                            cherubim.Alas();
                                                            } else if (respuesta2 == 17) {
                                                            Demon demon = new Demon();
                                                            creator.CreateDemon();
                                                            System.out.println("Este demonio pertenece a " + demon.getName());
                                                            System.out.println("¿Puedes morir?");
                                                            System.out.println(demon.getName() + ": ");
                                                            demon.die();
                                                            System.out.println("¿Puedes resucitar?");
                                                            System.out.println(demon.getName() + ": ");
                                                            demon.respawn();
                                                            System.out.println("¿Cómo puedes volar?");
                                                            System.out.println(demon.getName() + ": ");
                                                            demon.fly();
                                                            System.out.println("¿Cuántos ojos mágicos tienes?");
                                                            System.out.println(demon.getName() + ": ");
                                                            System.out.println(demon.MagicEyes());
                                                            System.out.println("¿Puedes cambiar de color?");
                                                            System.out.println(demon.getName() + ": ");
                                                            demon.ChangeColor();
                                                            System.out.println("¿Puedes cambiar de dimensión?");
                                                            System.out.println(demon.getName() + ": ");
                                                            demon.ChangeDimension();
                                                            System.out.println("¿Puedes cambiar de forma?");
                                                            System.out.println(demon.getName() + ": ");
                                                            demon.ShapeShift();
                                                            } else if (respuesta2 == 18) {
                                                            Imp imp = new Imp();
                                                            creator.CreateImp();
                                                            System.out.println("Este duende pertenece a " + imp.getName());
                                                            System.out.println("¿Puedes morir?");
                                                            System.out.println(imp.getName() + ": ");
                                                            imp.die();
                                                            System.out.println("¿Puedes resucitar?");
                                                            System.out.println(imp.getName() + ": ");
                                                            imp.respawn();
                                                            System.out.println("¿Cómo puedes volar?");
                                                            System.out.println(imp.getName() + ": ");
                                                            imp.fly();
                                                            System.out.println("¿Puedes cambiar de color?");
                                                            System.out.println(imp.getName() + ": ");
                                                            imp.ChangeColor();
                                                            System.out.println("¿Puedes cambiar de dimensión?");
                                                            System.out.println(imp.getName() + ": ");
                                                            imp.ChangeDimension();
                                                            System.out.println("¿Puedes cambiar de forma?");
                                                            System.out.println(imp.getName() + ": ");
                                                            imp.ShapeShift();
                                                            System.out.println("¿Cuántos ojos mágicos tienes?");
                                                            System.out.println(imp.getName() + ": ");
                                                            System.out.println(imp.MagicEyes());
                                                            } else if (respuesta2 == 19) {
                                                            System.out.print("Creador: ");
                                                            creator.born();
                                                            creator.ChangeColor();
                                                            creator.ChangeDimension();
                                                            creator.ShapeShift();
                                                            creator.die();
                                                            creator.fly();
                                                            creator.grow();
                                                            creator.respawn();
                                                            } else if (respuesta2 == 20) {
                                                            System.out.println("Supongo que hemos terminado aquí.");
                                                            System.exit(0);
                                                            } else {
                                                            System.out.println("Por favor, selecciona una opción válida. Intenta de nuevo:");
                                                            }
                                                            } while (respuesta2 >= 1 && respuesta2 <= 20);

                                                            teclado.close(); // Cerrar Scanner al finalizar
                                                            }
                                                            }
