public class HelloWorld {
    public void age(){
        int age = 10;   /* Trailing comments*/
        age = age +10;
        System.out.println("Age is" +age);
    }

    /**
     * this is where the main of the program is present
     * this is a helloworld program
     * this is called Documentation comment
     * @param args
     */
    /* This is a single line comment*/
    public static void main(String[] args){
        System.out.println("Hello everyone");
        HelloWorld hello = new HelloWorld(); //tells that a class object is create.
        hello.age();   // this is called end of line comment
    }
}
