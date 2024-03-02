package ru.netology.vdokuchaev;

import java.time.LocalDate;

public class Operation {
    static int idCounter=0;
    private int idTrans; // id, номер транзакции
    private boolean outTrans; //направление транзакции
    private float sumTrans; // сумма транзакции
    private String naznach; // назначение
    //private LocalDate dataTranz; // дата платежа
    private int idCustomer;// номер плательщика
    StringBuilder sb3= new StringBuilder();
    public int getIdCustomer() {
        return idCustomer;
    }
    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }
    public Operation() {
        idCounter++;
        idTrans=idCounter;
    }
    public Operation(boolean outTrans, float sumTrans, String naznach, int idCustomer) {
        idCounter++;
        idTrans=idCounter;
        this.outTrans = outTrans;
        this.sumTrans = sumTrans;
        this.naznach = naznach;
        this.idCustomer = idCustomer;
    }

    public int getIdTrans() {
        return idTrans;
    }
    public void setOutTrans(boolean outTrans){
        this.outTrans = outTrans;
    }
    public boolean  getOutTrans() {
        return outTrans;
    }
    public void setSumTrans(Float sumTrans){
        this.sumTrans = sumTrans;
    }
    public float  getSumTrans() {
        return sumTrans;
    }
    public void setNaznach(String naznach){
        this.naznach = naznach;
    }
    public String  getNaznach() {
        return naznach;
    }
//    public void setDataTranz(LocalDate dataTranz){
//        this.dataTranz = dataTranz;
//    }
//    public LocalDate  getDataTranz() {
//        return dataTranz;
//    }
    public void print(){
        sb3.append("Номер транзакции: ");
        sb3.append(idTrans);
        sb3.append(", ID плательщика: ");
        sb3.append(idCustomer);
        sb3.append(", назначение платежа: ");
        sb3.append(naznach);
        sb3.append(", сумма: ");
        sb3.append(sumTrans);
//        sb3.append(", дату транзакции: ");
//        sb3.append(dataTranz);
        System.out.println(sb3.toString());
    }
}
