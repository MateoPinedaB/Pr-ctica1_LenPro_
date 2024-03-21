public class LivingBeingCreator implements Creator {
    @Override
    public void grow() {
        System.out.println("Puedo tomar cualquier forma, soy el Creador.");
    }
    
    @Override
    public void respawn() {
        System.out.println("Inventé la Muerte.");
    }

    @Override
    public void die() {
        System.out.println("El tiempo no tiene sentido, soy eterno.");
    }

    @Override
    public void fly() {
        System.out.println("Eso no tiene sentido, estoy arriba y abajo.");
    }
    
    @Override
    public void born() {
        System.out.println("Soy el Creador, nací del vacío.");
    }
    
    @Override
    public void ChangeColor() {
        System.out.println("Creé la luz que usas para ver...");
    }
    
    @Override
    public void ChangeDimension() {
        System.out.println("Creé las Dimensiones...");
    }
    
    @Override
    public void ShapeShift() {
        System.out.println("Soy, y siempre he sido, todo y nada.");
    }
    
    @Override
    public void CreateLivingBeings() {
        System.out.println("Estoy creando un Ser Vivo.");
    }
    private String name = "Creador";

    public String getName() {
        return name;
    }
    public void OptionsToCreate(){
        System.out.println("-----------------------");
        System.out.println("¿Qué quieres crear?");
        System.out.println("-----------------------");
        System.out.println("Ser Vivo de la Tierra: ");
        System.out.println("-----------------------");
        System.out.println("1.- Humano");
        System.out.println("2.- Perro");
        System.out.println("3.- Gato");
        System.out.println("4.- Capibara");
        System.out.println("5.- Oso");
        System.out.println("6.- Humano Caído");
        System.out.println("7.- Humano Sagrado");
        System.out.println("-----------------------");
        System.out.println("Ser Vivo del Cielo: ");
        System.out.println("-----------------------");
        System.out.println("8.- Ángel Guardián");
        System.out.println("9.- Arcángel");
        System.out.println("10.- Trono");
        System.out.println("11.- Dominio");
        System.out.println("12.- Virtudes");
        System.out.println("13.- Poderes");
        System.out.println("14.- Principados");
        System.out.println("15.- Serafines");
        System.out.println("16.- Querubines");
        System.out.println("17.- Demonio");
        System.out.println("18.- Diablo");
        System.out.println("-----------------------");
        System.out.println("19.- Conocer al Creador.");
        System.out.println("-----------------------");
        System.out.println("20.- Salir.");
        System.out.println("-----------------------");
    }
        public String CreateHuman(){
            return "Estoy creando un Humano.";
        }
        public String CreateDog(){
            return "Estoy creando un Perro.";
        }
        public String CreateCat(){
            return "Estoy creando un Gato.";
        }
        public String CreateCapibara(){
            return "Estoy creando un Capibara.";
        }
        public String CreateArchangel(){
            return "Estoy creando un Arcángel.";
        }
        public String CreateDemon(){
            return "Estoy creando un Demonio.";
        }
        public String CreateBear(){
            return "Estoy creando un Oso.";
        }
        public String CreateThrone(){
            return "Estoy creando un Trono.";
        }
        public String CreateDominion(){
            return "Estoy creando un Dominio.";
        }
        public String CreateGuardianAngel(){
            return "Estoy creando un Ángel Guardián.";
        }
        public String CreateSeraph(){
            return "Estoy creando un Serafín.";
        }
        public String CreateCherub(){
            return "Estoy creando un Querubín.";
        }
        public String CreateFallenHuman(){
            return "Estoy creando un Humano Caído.";
        }
        public String CreateHolyHuman(){
            return "Estoy creando un Humano Sagrado.";
        }
        public String CreateAngel(){
            return "Estoy creando un Ángel.";
        }
        public String CreateVirtues(){
            return "Estoy creando una Virtud.";
        }
        public String CreateImp(){
            return "Estoy creando un Diablo.";
        }
        public String CreatePrincipalities(){
            return "Estoy creando un Principado.";
        }
        public String CreatePowers(){
            return "Estoy creando un Poder.";
        }
        public String CreateLivingBeing(){
            return "Estoy creando un Ser Vivo.";
        }
        public String CreateSeraphim(){
            return "Estoy creando un Serafín.";
        }
        public String CreateCherubim(){
            return "Estoy creando un Querubín.";
        }
        public String creatorInteractions(){
            return "Soy el Creador, soy todo y nada.";
        }
    }
