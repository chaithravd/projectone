class Vehicle{
    void type(){
        System.out.println("Vehicle can be a 2 wheeler or a 4 wheeler");
    }
}

class Car extends Vehicle{
    void carType(){
        System.out.println("Car is a 4 wheeler");
    }
}
/*with only vehicle and car class it is single inheritance*/


class Bmw extends Vehicle{
    void BmwType(){
        System.out.println("BMW is a car too which is 4 wheeler");
    }
}
/*Bmw class with the car and vehicle acts as a multilevel inheritance*/

/*if Bmw extends vehicle class it becomes hierarchical inheritance*/
/*if Bmw extends car class then it is a multilevel */
/*if Bmw extends both the car and vehicle it throws a compile time error*/
public class Einheritance {
    public static void main(String[] args){
        Bmw test = new Bmw();
        Car test1 = new Car();
        test1.carType();
        test.BmwType();
        test.type();
    }
}
