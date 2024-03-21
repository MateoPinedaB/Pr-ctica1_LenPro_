public class LivingBeingCreator implements Creator {
    @Override
    public void grow() {
        System.out.println("I can take any form, I am the Creator.");
    }
    
    @Override
    public void respawn() {
        System.out.println("I invented Death.");
    }

    @Override
    public void die() {
        System.out.println("Time is meaingless, i am eternal.");
    }

    @Override
    public void fly() {
        System.out.println("That is meaningless, i am up and bellow.");
    }
    
    @Override
    public void born() {
        System.out.println("I am the Creator, I was born from the void.");
    }
    
    @Override
    public void ChangeColor() {
        System.out.println("I created the light you use to see...");
    }
    
    @Override
    public void ChangeDimension() {
        System.out.println("I created Dimensions...");
    }
    
    @Override
    public void ShapeShift() {
        System.out.println("I am, and always have been, everything and nothing.");
    }
    
    @Override
    public void CreateLivingBeings() {
        System.out.println("I am creating a Living Being.");
    }
    private String name = "Creator";

    public String getName() {
        return name;
    }
    public void OptionsToCreate(){
        System.out.println("-----------------------");
        System.out.println("What do you want to create?");
        System.out.println("-----------------------");
        System.out.println("Earth Beings: ");
        System.out.println("-----------------------");
        System.out.println("1.- Human");
        System.out.println("2.- Dog");
        System.out.println("3.- Cat");
        System.out.println("4.- Capibara");
        System.out.println("5.- Bear");
        System.out.println("6.- Fallen Human");
        System.out.println("7.- Holy Human");
        System.out.println("-----------------------");
        System.out.println("Sky Beings: ");
        System.out.println("-----------------------");
        System.out.println("8.- Guardian Angel");
        System.out.println("9.- Archangel");
        System.out.println("10.- Throne");
        System.out.println("11.- Dominion");
        System.out.println("12.- Virtues");
        System.out.println("13.- Powers");
        System.out.println("14.- Principalities");
        System.out.println("15.- Seraphim");
        System.out.println("16.- Cherubim");
        System.out.println("17.- Demon");
        System.out.println("18.- Imp");
        System.out.println("-----------------------");
        System.out.println("19.- Know the Creator.");
        System.out.println("-----------------------");
        System.out.println("20.- Exit.");
        System.out.println("-----------------------");
    }
        public String CreateHuman(){
            return "I am creating a Human.";
        }
        public String CreateDog(){
            return "I am creating a Dog.";
        }
        public String CreateCat(){
            return "I am creating a Cat.";
        }
        public String CreateCapibara(){
            return "I am creating a Capibara.";
        }
        public String CreateArchangel(){
            return "I am creating an Archangel.";
        }
        public String CreateDemon(){
            return "I am creating a Demon.";
        }
        public String CreateBear(){
            return "I am creating a Bear.";
        }
        public String CreateThrone(){
            return "I am creating a Throne.";
        }
        public String CreateDominion(){
            return "I am creating a Dominion.";
        }
        public String CreateGuardianAngel(){
            return "I am creating a Guardian Angel.";
        }
        public String CreateSeraph(){
            return "I am creating a Seraph.";
        }
        public String CreateCherub(){
            return "I am creating a Cherub.";
        }
        public String CreateFallenHuman(){
            return "I am creating a Fallen Human.";
        }
        public String CreateHolyHuman(){
            return "I am creating a HolyHuman.";
        }
        public String CreateAngel(){
            return "I am creating a Angel.";
        }
        public String CreateVirtues(){
            return "I am creating a Virtue.";
        }
        public String CreateImp(){
            return "I am creating an Imp.";
        }
        public String CreatePrincipalities(){
            return "I am creating a Principality.";
        }
        public String CreatePowers(){
            return "I am creating a Power.";
        }
        public String CreateLivingBeing(){
            return "I am creating a Living Being.";
        }
        public String CreateSeraphim(){
            return "I am creating a Seraphim.";
        }
        public String CreateCherubim(){
            return "I am creating a Cherubim.";
        }
    }
