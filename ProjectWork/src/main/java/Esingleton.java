class Example {
    static Example example = null;

    public String s;
    private Example(){

        s= "Hello Everyone";

    }

    public static Example getInstance(){
        if (example == null)
            example = new Example();

        return example;
    }
}

public class Esingleton {
    public static void main (String[] args){
        Example e = Example.getInstance();
        Example f = Example.getInstance();
        Example g = Example.getInstance();

        e.s =(e.s).toLowerCase();

        System.out.println("e:" +e.s);
        System.out.println("f:" +f.s);
        System.out.println("g:" +g.s);


    }
}
