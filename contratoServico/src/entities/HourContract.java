package entities;
import java.util.Date;
public class HourContract {
    //atributos
    private Date date;
    private Double valuePerHour;
    private Integer hours; //wrap class
    //construtores
    public HourContract(){

    }
    public HourContract(Date date, Double valuePerHour, Integer hours){
        this.date = date;
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }
    //get e sets
    //date
    public Date getDate(){
        return date;
    }
    public void setDate(Date date){
        this.date = date;
    }
    //valuePerHour
    public Double getValuePerHour(){
        return valuePerHour;
    }
    public void setValuePerHour(Double valuePerHour){
        this.valuePerHour = valuePerHour;
    }
    //hours
    public Integer getHours(){
        return hours;
    }
    public void setHours(Integer hours){
        this.hours = hours;
    }
    //metodo
    public double totalValue(){
        return valuePerHour * hours;
    }
}
