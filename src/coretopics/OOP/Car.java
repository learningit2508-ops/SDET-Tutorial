package coretopics.OOP;

import coretopics.OOP.Veichle;

public class Car  extends Veichle {


    private String Brand ;
    private String Color ;


    public String getBrand() {
        return Brand;
    }

    public String setBrand(String brand) {
        Brand = brand;
        return brand ;
    }



    public String getColor() {
        return Color;
    }

    public String setColor(String color) {
        Color = color;
        return color ;
    }





    public Car(String brand , String color ){
            this.Brand = brand ;
            this.Color = color ;
    }

    public void display(){
        System.out.println("The brand of the car is : " +"Maruti");
        System.out.println("The color of the car is : " +"White");

    }

    public void display_message(String brand , String color){
        System.out.println("The brand of the car is : " + brand);
        System.out.println("The color of the car is : " + color);


    }

    @Override
    void start_engine() {
        System.out.println("The engine of the car is starting...");
    }

    public static void main(String[] args) {

        Car car1 = new Car("Toyota" , "Red");
        Car car2 = new Car("Honda" , "Blue");

        car1.display_message(car1.Brand , car1.Color);
        car2.display_message(car2.Brand , car2.Color);
        car2.display_message(car1.setBrand("Lexus"), car1.setColor("Black"));
        car1.display();
        car2.display();











    }
}
