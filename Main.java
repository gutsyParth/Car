public class Main {
    public static void main(String[] args) {
        Car eCar = Car.getCar("electric", 60, 4, 0);

        eCar.drive();

        Object unkObj = Car.getCar("H",50,5,4);

        if(unkObj instanceof HybridCar h)
        {
            h.driveHybrid();
            System.out.println(h.hashCode()+" "+ unkObj.hashCode()+" "+eCar.hashCode());
        }
    }
}