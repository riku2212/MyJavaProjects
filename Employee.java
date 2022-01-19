import java.util.Scanner;

public class Employee {

    //Declaring the variables

    String Name;
    int Salary;
    int hour;

    //Default Constructor

    Employee(){

        Name="";
        Salary=0;
        hour=0;
    }

    //Userdefined Constructor

    Employee(String Name,int Salary, int hour){

        this.Name=Name;
        this.Salary=Salary;
        this.hour=hour;
    }

    //Salary Setter

    public void setSalary(int Salary){
        this.Salary=Salary;
        display(Salary);


    }

    //Methods

    public void AddSal(int Salary){

        if(Salary<600) {
            Salary = Salary + 10;
        }
        setSalary(Salary);

    }

    public void Addwork(int hour){

        if(hour>5) {


            Salary = Salary + 5;
        }

        setSalary(Salary);

    }

    public void getinfo(){



        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the name");
        String Name=sc.nextLine();
        System.out.println("Enter the Salary");
        int Salary=sc.nextInt();
        System.out.println("Enter the hour");
        int hour=sc.nextInt();

        Employee B= new Employee(Name,Salary,hour);

        B.Addwork(hour);
        B.AddSal(Salary);
    }

    public void display(int Sal){
        System.out.println("The final salary is:"+Sal);
    }



    public static void main(String args[]){

        Employee B1=new Employee();

        B1.getinfo();








    }


}





