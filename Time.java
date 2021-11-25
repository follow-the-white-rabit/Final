interface Menu{
    public abstract void show(Time time);
}

class Breakfast extends MenuTemplate implements Menu{
    @Override
    public void show(Time time) {
        System.out.println("Showing breakfast menu to clients...");
        MenuTemplate myMenu = new Breakfast();
        myMenu.showList();
        time.setTime(new Lunch());
    }

    @Override
    public void showList() {
        System.out.println("Rice porridge with vegetables, quince and dried fruits - 2590 KZT");
        System.out.println("Chocolate pumpkin mousse with spices - 1950 KZT");
        System.out.println("Rolls with apples, carrots and chocolate sauce - 2100 KZT");
        System.out.println("Oatmeal pudding with apples and applesauce - 2350 KZT");
        System.out.println("Low Carb Cream Cheese Pancakes - 1880 KZT");
    }
}

class Lunch extends MenuTemplate implements Menu {
    @Override
    public void show(Time time) {
        System.out.println("Showing lunch menu to clients...");
        MenuTemplate myMenu = new Lunch();
        myMenu.showList();
        time.setTime(new Supper());
    }

    @Override
    public void showList() {
        System.out.println("Grilled beef medallions with vegetable garnish - 5100 KZT");
        System.out.println("Chicken in onion-garlic marinade - 4250 KZT");
        System.out.println("Veal stewed in tomato sauce - 4550 KZT");
        System.out.println("Flank steak - 5500 KZT");
        System.out.println("Fried meat balls - 4990 KZT");
    }
}

class Supper extends MenuTemplate implements Menu {
    @Override
    public void show(Time time) {
        System.out.println("Showing supper menu to clients...");
        MenuTemplate myMenu = new Supper();
        myMenu.showList();
        time.setTime(new Breakfast());
    }
    @Override
    public void showList() {
        System.out.println("Mussel soup - 3330 KZT");
        System.out.println("Vegetable jalfrezi - 4190 KZT");
        System.out.println("Chicken in sweet and sour sauce in Chinese - 5430 KZT");
        System.out.println("Chicken baked in a crispy crust with ginger and oranges KZT");
        System.out.println("Uzbek pilaf - 4440 KZT");
    }
}

public class Time {
    private Menu menu;

    Time(Menu _menu){
        menu = _menu;
    }

    Time(){}

    protected void setTime(Menu menu) {
        this.menu = menu;
    }
    protected Menu getTime() { return menu; }

    public void wannaEat(){
        menu.show(this);
    }
}
