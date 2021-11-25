import java.util.ArrayList;
import java.util.List;

interface Reserve{
    public void welcome();
}

interface Reserved{
    public void addClient(Reserve reserve);
    public void removeClient(Reserve reserve);
    public void notifyClients();
}

class Client implements Reserve{
    private String name;

    Client(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void welcome() {
        System.out.println("Dear, " + getName() + ", welcome to our SmartCanteen! :)");
    }
}

public class Service implements Reserved{
    List<String>reservedPlaces = new ArrayList<>();
    List<Reserve>reserveList = new ArrayList<>();

    public void reserve(String name){
        reservedPlaces.add(name);
    }

    public void cancel(String name){
        reservedPlaces.remove(name);
    }

    @Override
    public void addClient(Reserve reserve) {
        reserveList.add(reserve);
    }

    @Override
    public void removeClient(Reserve reserve) {
        reserveList.remove(reserve);
    }

    @Override
    public void notifyClients() {
        for (Reserve clients : reserveList)
            clients.welcome();
    }
}
