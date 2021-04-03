package kr.classExam01;

public class Car {
    private String name;
    private String brand;
    private String rank;
    private String color;
    private int price;
    
    public void carInformation() {
        System.out.println("?????? : " + getName());
        System.out.println("????????? : " + getBrand());
        System.out.println("?????? : " + getRank());
        System.out.println("?????? : " + getColor());
        System.out.println("?????? : " + getPrice() + "???");
    }
    
    public String getName() {
        return name;
    }
    
    public String getBrand() {
        return brand;
    }
    
    public String getRank() {
        return rank;
    }
    
    public String getColor() {
        return color;
    }
    
    public int getPrice() {
        return price;
    }
    
    public void setName(String nameOfCar) {
        name = nameOfCar;
    }
    
    public void setBrand(String brandOfCar) {
        brand = brandOfCar;
    }
    
    public void setRank(String rankOfCar) {
        rank = rankOfCar;
    }
    
    public void setColor(String colorOfCar) {
        color = colorOfCar;
    }
    
    public void setPrice(int priceofCar) {
        price = priceofCar;
    }
    
}