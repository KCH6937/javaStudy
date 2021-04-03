package kr.classExam01;

public class ClassExam {
    public static void main(String[] args) {
        Car car = new Car();
        
        car.setName("폴스타2");
        car.setBrand("뽈뽀");
        car.setRank("중형");
        car.setColor("블랙");
        car.setPrice(80000000);
        
        car.carInformation();
    }
    
}
