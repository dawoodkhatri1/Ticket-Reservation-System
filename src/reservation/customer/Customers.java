package reservation.customer;

import java.util.ArrayList;

abstract class Customers {

    private ArrayList<String> fname = new ArrayList<>();
    private ArrayList<String> lname = new ArrayList<>();
    private ArrayList<String> phoneNo = new ArrayList<>();
    private ArrayList<String> email = new ArrayList<>();
    private ArrayList<Integer> age = new ArrayList<>();
    private ArrayList<Integer> price = new ArrayList<>();
    private int totalPassenger = 0;

    public void addToList(String fname, String lname, String phoneNo, String email, int age, int price) {
        this.fname.add(fname);
        this.lname.add(lname);
        this.phoneNo.add(phoneNo);
        this.email.add(email);
        this.age.add(age);
        this.price.add(price);
        totalPassenger = this.fname.size();
    }

    public abstract int calcTotalPrice();

    public ArrayList<String> getFname() {
        return fname;
    }

    public ArrayList<String> getLname() {
        return lname;
    }

    public ArrayList<String> getPhoneNo() {
        return phoneNo;
    }

    public ArrayList<Integer> getAge() {
        return age;
    }

    public ArrayList<Integer> getPrice() {
        return price;
    }

    public int getTotalPassenger() {
        return totalPassenger;
    }
}
