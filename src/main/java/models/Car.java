package models;

public class Car {

    public Car(String mark, String model, int series) {
        this.mark = mark;
        this.model = model;
        this.series = series;
    }
    public String mark;

    public String model;
    public int series;


    @Override
    public String toString() {
        return mark + " " + model + " " + series;
    }
}
