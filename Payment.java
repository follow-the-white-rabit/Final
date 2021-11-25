interface Method{
    public void scan();
    public void give();
}

class QR implements Method{
    @Override
    public void scan() {
        System.out.println("payment with QR completed successfully!");
        System.out.println("Thank you!");
    }
    public void give() {}
}

class Cash implements Method{
    public void scan(){}

    @Override
    public void give() {
        System.out.println("payment with Cash was accepted!");
        System.out.println("Thank you!");
    }
}

public class Payment{
    private String clientName;
    Method method = null;
    Payment(Client client){
        clientName = client.getName();
    }
    public void using(Method method){
        this.method = method;
    }
    public void pay(){
        System.out.print("Dear, " + clientName + ", ");
        if (method instanceof QR)
            method.scan();
        else
            method.give();
    }
}

