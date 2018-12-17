abstract class Vehicles{
abstract void type();
Vehicles(){
    System.out.println("they are human creation for transportation");
}
}

class Bike extends Vehicles{
void type(){
    System.out.println("Bike is a 2 wheeler");
}
}

class Cars extends Vehicles{
    void type(){
        System.out.println("Car is a 4 wheeler");
    }

    void model(){
        System.out.println("This gives the model of the car");
    }
}

class Eabstract {
    public static void main(String[] args){
        Vehicles obj = new Bike();
        Vehicles obj1 = new Cars();
        obj.type();
        obj1.type();
        ((Cars) obj1).model();
    }
}
