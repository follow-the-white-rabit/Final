interface Meal{
    public void prepare();
}

class Chef implements Meal{
    private Meal meal;

    public Chef(Meal _meal){
        meal = _meal;
    }

    @Override
    public void prepare() {
        meal.prepare();
    }
}

class JuniorChef implements Meal{
    @Override
    public void prepare() {
        System.out.print("Preparing ingredients...");
    }
}

class MiddleChef extends Chef{
    public MiddleChef(Meal _meal) {
        super(_meal);
    }

    @Override
    public void prepare() {
        super.prepare();
        System.out.print("Cooking meal...");
    }
}

class SeniorChef extends Chef{
    SeniorChef(Meal _meal){
        super(_meal);
    }

    @Override
    public void prepare() {
        super.prepare();
        System.out.println("Checking the taste and kicking the asses of chefs...");
    }
}
