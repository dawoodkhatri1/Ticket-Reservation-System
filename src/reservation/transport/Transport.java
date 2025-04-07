package reservation.transport;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

abstract class Transport {
    private int id;
    private ArrayList<String> source = new ArrayList<>(Arrays.asList("Karachi", "Faislabad", "Hyderabad"));
    private ArrayList<String> destination = new ArrayList<>(Arrays.asList("Hyderabad", "Karachi", "Faislabad"));

    private String[] name;
    private int[] price;

    // TODO Date of journey

    public Transport(String[] name, int[] price) {
        id = new Random().nextInt(1000, 10000);
        this.name = name;
        this.price = price;
    }

    public void addToSource(String start) {
        source.add(start);
    }

    public void addToDest(String cityName) {
        destination.add(cityName);
    }

    public void setName(String[] name) {
        this.name = name;
    }

    public String[] getName() {
        return name;
    }

    public void setPrice(int[] price) {
        this.price = price;
    }

    public int[] getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    public ArrayList<String> getSource() {
        return source;
    }

    public ArrayList<String> getDestination() {
        return destination;
    }

    public abstract void booking();

    public abstract void departure();
}
