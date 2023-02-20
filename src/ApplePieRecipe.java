public class ApplePieRecipe {
    //variabelen - instance variables
    Ingredients butter = new Ingredients(200, "gram", "roomboter");
    Ingredients sugar = new Ingredients(200, "gram", "sugar");
    Ingredients flower = new Ingredients(400, "gram", "flower");
    Ingredients egg = new Ingredients(1, "piece", "egg");
    Ingredients vanilla = new Ingredients(8, "gram", "vanilla sugar");
    Ingredients salt = new Ingredients(1, "snif", "salt");
    Ingredients apples = new Ingredients(1, "kilo", "apples");
    Ingredients cristalsugar = new Ingredients(75, "gram", "cristal sugar");
    Ingredients cinnamon = new Ingredients(3, "spoons", "cinnamon");
    Ingredients paneermeel = new Ingredients(15, "gram", "paneermeel");

    //methods
    public void printRecipe() {
        VerwarmOven();
        KlopEi();
        MengIngredients();
        Invetten();
        SchilAppels();
        BodemDeeg();
        AppelsVerwerken();
        StrokenDeeg();
        StrokenKruislings();
        TaartInOven();
    }
    public void VerwarmOven() {
        System.out.println("Verwarm de oven van te voren op 170 graden Celsius (boven en onderwarmte)");

    }

    public void KlopEi() {
        System.out.println("Klop het ei los en verdeel deze in twee delen. De ene helft is voor het deeg, het andere deel is voor het bestrijken van de appeltaart.");

    }

    public void MengIngredients() {
        System.out.println("Meng de boter, bastard suiker, zelfrijzend bakmeel, een helft van het ei, vanille suiker en een snufje zout tot een stevig deeg en verdeel deze in 3 gelijke delen.");

    }

    public void Invetten() {
        System.out.println("Vet de springvorm in en bestrooi deze met bloem.");

    }

    public void SchilAppels() {
        System.out.println("Schil nu de appels en snij deze in plakjes. Vermeng in een kopje de suiker en kaneel.");

    }

    public void BodemDeeg() {
        System.out.println("Gebruik een deel van het deeg om de bodem van de vorm te bedekken. Gebruik een deel van het deeg om de rand van de springvorm te bekleden. Strooi het paneermeel op de bodem van de beklede vorm. De paneermeel neemt het vocht van de appels op.");

    }

    public void AppelsVerwerken() {
        System.out.println("Doe de heft van de appels in de vorm en strooi hier 1/3 van het kaneel-suiker mengsel overheen. Meng de ander helft van de appels met het overgebleven kaneel-suiker mengsel en leg deze in de vorm.");

    }

    public void StrokenDeeg() {
        System.out.println("Rol het laatste deel van de deeg uit tot een dunne lap en snij stroken van ongeveer 1 cm breed.");

    }

    public void StrokenKruislings() {
        System.out.println("Leg de stroken kruislings op de appeltaart. Met wat extra deegstroken werk je de rand rondom af. Gebruik het overgebleven ei om de bovenkant van het deeg te bestrijken");

    }

    public void TaartInOven() {
        System.out.println("Zet de taart iets onder het midden van de oven. Bak de taart in 60 minuten op 170 graden Celsius (boven en onderwarmte) gaar en goudbruin.");

    }

    public void PrintIngredients() {
        System.out.println(butter.getAmount() + " "  + butter.getUnit() + " " + butter.getName());
        System.out.println(sugar.getAmount() + " " +  sugar.getUnit() +  " " + sugar.getName());
        System.out.println(flower.getAmount() +  " " + flower.getUnit() + " " +  flower.getName());
        System.out.println(egg.getAmount() +  " " + egg.getUnit() + " " +  egg.getName());
        System.out.println(vanilla.getAmount() + " " +  vanilla.getUnit() +  " " + vanilla.getName());
        System.out.println(salt.getAmount() + " " +  salt.getUnit() + " " +  salt.getName());
        System.out.println(apples.getAmount() + " " +  apples.getUnit() + " " +  apples.getName());
        System.out.println(cristalsugar.getAmount() + " " +  cristalsugar.getUnit() + " " +  cristalsugar.getName());
        System.out.println(cinnamon.getAmount() + " " +  cinnamon.getUnit() + " " +  cinnamon.getName());
        System.out.println(paneermeel.getAmount() + " " +  paneermeel.getUnit() + " " +  paneermeel.getName());
    }
}