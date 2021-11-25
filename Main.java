public class Main {
    public static void main(String[] args) {
        // We are opening our Smart Canteen at AITU
        Service SmartCanteenService = new Service();

        // Clients has come to our Smart canteen ;)
        Client SanzharKoshkarbayev = new Client("Sanzhar Koshkarbayev");
        Client SanzharBekzhigit = new Client("Sanzhar Bekzhigit");
        Client MeirbekBolatbekov = new Client("Meirbek Bolatbekov");

        Waiter waiter4meeting = new Waiter();
        waiter4meeting.setAction(new MeetClients());
        waiter4meeting.operate();

        System.out.println("#===========================================================================================#");

        SmartCanteenService.addClient(SanzharKoshkarbayev);
        SmartCanteenService.addClient(SanzharBekzhigit);
        SmartCanteenService.addClient(MeirbekBolatbekov);

        SmartCanteenService.removeClient(MeirbekBolatbekov);
        SmartCanteenService.reserve("Meirbek Bolatbekov");

        SmartCanteenService.notifyClients();

        System.out.println("#===========================================================================================#");

        Waiter waiter4cleaning = new Waiter();
        waiter4cleaning.setAction(new ClearTheTable());
        waiter4cleaning.operate();

        System.out.println("#===========================================================================================#");

        Waiter waiter4orders = new Waiter();
        waiter4orders.setAction(new GetOrders());
        waiter4orders.operate();

        System.out.println("#===========================================================================================#");

        Time I = new Time();
        I.setTime(new Breakfast());
        I.wannaEat();

        System.out.println("#===========================================================================================#");

        I.wannaEat(); // shows menu for lunch

        System.out.println("#===========================================================================================#");

        I.wannaEat(); // shows menu for supper

        System.out.println("#===========================================================================================#");

        Meal preMeal = new JuniorChef();
        preMeal.prepare();
        System.out.println();
        Meal meal = new MiddleChef(preMeal);
        meal.prepare();
        System.out.println();
        Meal postMeal = new SeniorChef(meal);
        postMeal.prepare();

        System.out.println("#===========================================================================================#");

        Waiter waiter4cheque = new Waiter();
        waiter4cheque.setAction(new ProvideCheque());
        waiter4cheque.operate();

        System.out.println("#===========================================================================================#");

        Payment payment = new Payment(SanzharBekzhigit);
        payment.using(new QR());
        payment.pay();

        System.out.println("#===========================================================================================#");

        Payment payment2 = new Payment(SanzharKoshkarbayev);
        payment2.using(new Cash());
        payment2.pay();
    }
}
