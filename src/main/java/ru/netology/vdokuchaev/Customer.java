package ru.netology.vdokuchaev;

public class Customer {
    static int idCounter=0;
    private int id;// номер плательщика
    private String namePayer; // плательщик
    public  void setNamePayer(String namePayer){
        this.namePayer = namePayer;
    }
    public String  getNamePayer(){
        return namePayer;
    }
    public int getId() {
        return id;
    }
    Customer() {
        idCounter++;
        id=idCounter;
    }
    public Customer(String namePayer) {
        idCounter++;
        id=idCounter;
        this.namePayer = namePayer;
    }

}
