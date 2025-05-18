public class Car {
    String description;

    public Car()
    {
        System.out.println( "Hey, you got a " + getClass().getSimpleName() + "!");
    }


    public void startEngine() {
        System.out.println("Start engine of Car class called.");
    }

    public void drive() {
        System.out.println("Drive of Car class called.");
    }

    protected void runEngine()
    {
        System.out.println("Run engine of Car class called.");
    }

    public static Car getCar(String carType, double avgKmPerLitre, int cylinders, int batterySize)
    {
        if(carType.toUpperCase().charAt(0) == 'G')
        {
           return new GasPoweredCar(avgKmPerLitre,cylinders);
        }
        else if(carType.toUpperCase().charAt(0) == 'E')
        {
            return new ElectricCar(avgKmPerLitre,batterySize);
        }
        else if(carType.toUpperCase().charAt(0) == 'H')
        {
            return new HybridCar(avgKmPerLitre,batterySize,cylinders);
        }
        else
        {
            return new Car();
        }
    }
}

class GasPoweredCar extends Car{
    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(double avgKmPerLitre, int cylinders) {
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    public void startEngine() {
        System.out.println("Start engine of Gas Powered Car class called.");
    }

    public void drive() {
        System.out.println("Drive of Gas Powered Car class called.");
    }

    protected void runEngine() {
        System.out.println("Run engine of Gas Powered Car class called.");
    }
}

class ElectricCar extends Car{
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(double avgKmPerCharge, int batterySize) {
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
        System.out.println("This is an electric car");
    }

    public void startEngine() {
        System.out.println("Start engine of Electric Car class called.");
    }

    public void drive() {
        System.out.println("Drive of Electric Car class called.");
    }

    protected void runEngine() {
        System.out.println("Run engine of Electric Car class called.");
    }
}

class HybridCar extends Car{
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(double avgKmPerLitre, int batterySize, int cylinders) {
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    public void startHybridEngine() {
        System.out.println("Start engine of Hybrid Car class called.");
    }

    public void driveHybrid() {
        System.out.println("Drive of Hybrid Car class called.");
    }

    protected void runHybridEngine() {
        System.out.println("Run engine of Hybrid Car class called.");
    }
}
