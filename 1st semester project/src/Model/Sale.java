package Model;
import java.util.*;
import java.time.LocalDateTime;

public class Sale {
    private int ID;
    private String costumer;
    private ArrayList<Integer> listOfProducts;
    private int price;
    private LocalDateTime dueTime;
    private String department;

    public Sale (int ID, String costumer, int price, LocalDateTime dueTime, String department) {

        this.costumer = costumer;
        this.price = price;
        this.dueTime = dueTime;
        this.department = department;
        listOfProducts = new ArrayList<>();

    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getCostumer() {
        return costumer;
    }

    public void setCostumer(String costumer) {
        this.costumer = costumer;
    }

    public ArrayList<Integer> getListOfProducts() {
        return listOfProducts;
    }

    public void setListOfProducts(ArrayList<Integer> listOfProducts) {
        this.listOfProducts = listOfProducts;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalDateTime getDueTime() {
        return dueTime;
    }

    public void setDueTime(LocalDateTime dueTime) {
        this.dueTime = dueTime;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
