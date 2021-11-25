abstract class MenuTemplate {

    public void show(Time time) {
        if (time.getTime() instanceof Breakfast)
            System.out.println("Breakfast Menu:");
        else if (time.getTime() instanceof Lunch)
            System.out.println("Lunch Menu:");
        else
            System.out.println("Supper Menu:");

        showList();
        showFooter();
    }

    private void showFooter(){
        System.out.println("Buon appetito! ^_^");
        System.out.println("Kind reminder!\n10% service charge will be added to the payment receipt ^_^");
    }

    public abstract void showList();
}
