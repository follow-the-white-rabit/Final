interface Action{
    public void perform();
}

class MeetClients implements Action{
    @Override
    public void perform() {
        System.out.println("Waiter is meeting clients...");
    }
}

class GetOrders implements Action{
    @Override
    public void perform() {
        System.out.println("Waiter is asking clients for order...");
    }
}

class ClearTheTable implements Action{
    @Override
    public void perform() {
        System.out.println("Waiter is clearing the table...");
    }
}

class ProvideCheque implements Action{
    @Override
    public void perform() {
        System.out.println("Waiter is providing the cheque...");
    }
}

public class Waiter {
    private Action action;

    public void setAction(Action action) {
        this.action = action;
    }

    public void operate(){
        action.perform();
    }
}
