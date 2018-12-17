import java.io.*;
class Employee
{
    public String empName;
    public int empId;
    public int empAge;
    public String empAdd;

    Employee()
    {
        empName="";
        empId=1;
        empAge=21;
        empAdd="";
    }

    Employee(String empName)
    {
        this.empName=empName;

    }



    public void read() throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the employee name");
        empName=br.readLine();
        System.out.println("enter the employee id");
        empId=Integer.parseInt(br.readLine());
        System.out.println("enter the employee age");
        empAge=Integer.parseInt(br.readLine());
        System.out.println("enter the employee address");
        empAdd=br.readLine();
    }

    public void disp() throws IOException
    {
        System.out.println("Employee Name:"+empName);
        System.out.println("Employee Id:"+empId);
        System.out.println("Employee Age:"+empAge);
        System.out.println("Employee Address:"+empAdd);
    }
}

class Manager extends Employee{
    private float salary;
    private int experience;
    Manager(){
        super(); //it points to the base class constructor
        salary=0;
        experience=0;
    }
    public void read() throws IOException
    {
        super.read();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the salary of the manager");
        salary=Float.parseFloat(br.readLine());
        System.out.println("Enter the Experience of the manager");
        experience=Integer.parseInt(br.readLine());
    }

    public void disp() throws IOException
    {
        super.disp();
        System.out.println("Manager Name:"+empName);
        System.out.println("Manager Id:"+empId);
        System.out.println("Manager Age:"+empAge);
        System.out.println("Manager Salary:"+salary);
        System.out.println("Experience of the Manager:"+experience);
    }
}
class Inheritance{
    public static void main(String args[]) throws IOException{
        int choice;
        Manager obj=new Manager();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        do{
            System.out.println("1)For Reading\n2)For displaying\nEnter your choice");
            choice=Integer.parseInt(br.readLine());
            switch(choice){
                case 1:try{
                    obj.read();
                    break;
                }catch(IOException e){}
                    break;
                case 2:try{
                    obj.disp();
                }catch(IOException e){}
                    break;
                default:
                    System.out.println("Invalid case");
            }
            System.out.println("Press 1 to continue");
            choice=Integer.parseInt(br.readLine());
        }while(choice==1);


    }
}

