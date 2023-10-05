public class Car {
    //Attriubut
    private int id;
    private String brand;
    private double speed = 0.0;
    private int milage = 0;
    private String owner;
    private int value;

    //Connstructers
    public Car (int id, String brand, String owner, int value) {
        this.id = id;
        this.brand = brand;
        this.owner = owner;
        this.value = value;

        System.out.println("Car has been created");
    }

    //Methods
    public void speedUp (double increase){
        if(this.speed + increase <= 221) {
            this.speed = this.speed + increase;
        }else{
            System.out.println("Max speed has been reached");
        }
    }

    //Getters & Setters
    public String getBrand(){
        return this.brand;
    }

}
