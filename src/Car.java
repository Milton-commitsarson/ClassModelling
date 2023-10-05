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
    public void stop(double stop){
        speed = 0;
    }
    public void speedUp (double increase){
        if(this.speed + increase <220) {
            this.speed = this.speed + increase;
        }else{
            System.out.println("Max speed has been reached");
        }
    }
    public void speedDown (double decrease){
        if(this.speed - decrease > 0) {
            this.speed = this.speed - decrease;
        }else{
            System.out.println("Minimum speed reached");
        }
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }

    //Getters & Setters
    public String getBrand(){
        return this.brand;
    }
    public int getId(){
        return this.id;
    }
    public double getSpeed(){
        return this.speed;
    }
    public int getMilage(){
        return this.milage;
    }
    public String getOwner(){
        return this.owner;
    }
    public int getValue(){
        return this.value;
    }


}
