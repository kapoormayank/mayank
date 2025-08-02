public class Car{
    public static void main(String[] args) {
        car_details car1 = new car_details("BMW",250077900L,"Ms","V8 engine",25,"Petrol");
        car1.details();
    }
}
class car_details{
    String car_name;
    Long price;
    String model;
    String engine;
    int mileage;
    String fueltype;

    car_details(String car_name,Long price,String model,String engine,int mileage,String fueltype)
    {
        this.car_name = car_name;
        this.price = price;
        this.model = model;
        this.engine = engine;
        this.mileage = mileage;
        this.fueltype = fueltype;
    }
    void details(){
        System.out.println("Car Name : "+this.car_name);
        System.out.println("Price of car : "+this.price);
        System.out.println("Model of car : "+this.model);
        System.out.println("Engine of car : "+this.engine);
        System.out.println("Mileage of car : "+this.mileage);
        System.out.println("Fueltype of car : "+this.fueltype);
    }
}
