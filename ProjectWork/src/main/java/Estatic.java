class Employeelist{
    int emp_id;
    static String company = "Kritter";   //static variable
    String designation;

    Employeelist(int i, String des){  //constructor
        emp_id = i;
        designation = des;
    }

    static void change_company(){   //static method
        company = "abc";
    }

    void display(){
        System.out.println(emp_id+" "+company+" "+designation);
    }
}

public class Estatic {
    public static void main(String[] args){
        Employeelist.change_company();
        Employeelist e1 = new Employeelist(1,"Tech-Intern");
        Employeelist e2 = new Employeelist(2, "Software Engineer");
        e1.display();
        e2.display();
    }
}
