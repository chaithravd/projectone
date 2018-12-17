public class Edebug {

    int a =2,  sum, average;


    void avg(){
        for(int i=1; i<=5; i++){
           sum = a;
           average = sum /5;
        }
        System.out.println("The average value is :" +average);
    }
    public static void main(String[] args){
        Edebug e = new Edebug();
        e.avg();
    }
}
