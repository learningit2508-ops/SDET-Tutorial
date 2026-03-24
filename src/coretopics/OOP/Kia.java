package coretopics.OOP;

public class Kia extends Car {

    public Kia(String brand, String color) {
        super(brand, color);
    }

    @Override
    public void display() {
        System.out.println("The brand of the car is : " + this.getBrand());
        System.out.println("The color of the car is : " + this.getColor());
    }

    public static void main(String[] args) {
        Kia kia1 = new Kia("Sonet", "Black");
        Kia kia2 = new Kia("Syros", "Black");
        kia1.display();
        kia2.display();
    }
}
